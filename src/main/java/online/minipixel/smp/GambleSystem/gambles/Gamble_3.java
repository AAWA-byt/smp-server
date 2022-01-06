package online.minipixel.smp.GambleSystem.gambles;

import online.minipixel.smp.Main;
import online.minipixel.smp.MessageAPI.Prefix;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Gamble_3 {

    List<Inventory> invs = new ArrayList<Inventory>();
    public static ItemStack[] contents;
    private int ItemIndex = 0;

    public void gamble(Player player) {
        ItemStack fee = new ItemStack(Material.DIAMOND, 6);
        if (player.getInventory().getItemInMainHand().equals(fee)) {
            player.getInventory().removeItem(fee);
            spin(player);
        } else {
            player.sendMessage(Prefix.Plugin_Prefix + "§cDu benötigst 6 Diamanten!");
        }
    }

    public void shuffle(Inventory inv) {
        if (contents == null) {
            ItemStack[] items = new ItemStack[19];
            items[0] = new ItemBuilder(Material.LEATHER_HELMET, 1).addEnchantment(Enchantment.DURABILITY, 5, true).build();
            items[5] = new ItemBuilder(Material.LEATHER_CHESTPLATE, 1).addEnchantment(Enchantment.DURABILITY, 5,true).build();
            items[10] = new ItemBuilder(Material.LEATHER_LEGGINGS, 1).addEnchantment(Enchantment.DURABILITY, 5,true).build();
            items[15] = new ItemBuilder(Material.LEATHER_BOOTS, 1).addEnchantment(Enchantment.DURABILITY, 5,true).build();

            items[6] = new ItemBuilder(Material.CHAINMAIL_HELMET, 1).addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3,true).build();
            items[1] = new ItemBuilder(Material.CHAINMAIL_CHESTPLATE, 1).addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3,true).build();
            items[11] = new ItemBuilder(Material.CHAINMAIL_LEGGINGS, 1).addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3,true).build();
            items[0] = new ItemBuilder(Material.CHAINMAIL_BOOTS, 1).addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3,true).build();

            items[16] = new ItemBuilder(Material.GOLDEN_HELMET, 1).addEnchantment(Enchantment.THORNS, 4,true).build();
            items[12] = new ItemBuilder(Material.GOLDEN_CHESTPLATE, 1).addEnchantment(Enchantment.THORNS, 4,true).build();
            items[2] = new ItemBuilder(Material.GOLDEN_LEGGINGS, 1).addEnchantment(Enchantment.THORNS, 4,true).build();
            items[7] = new ItemBuilder(Material.GOLDEN_BOOTS, 1).addEnchantment(Enchantment.THORNS, 4,true).build();

            items[8] = new ItemBuilder(Material.IRON_HELMET, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4,true).build();
            items[17] = new ItemBuilder(Material.IRON_CHESTPLATE, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4,true).build();
            items[13] = new ItemBuilder(Material.IRON_LEGGINGS, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4,true).build();
            items[3] = new ItemBuilder(Material.IRON_BOOTS, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4,true).build();

            items[4] = new ItemBuilder(Material.DIAMOND_HELMET, 1).addEnchantment(Enchantment.PROTECTION_FALL, 5,true).build();
            items[9] = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).addEnchantment(Enchantment.PROTECTION_FALL, 5,true).build();
            items[14] = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).addEnchantment(Enchantment.PROTECTION_FALL, 5,true).build();
            items[18] = new ItemBuilder(Material.DIAMOND_BOOTS, 1).addEnchantment(Enchantment.PROTECTION_FALL, 5,true).build();






            contents = items;
        }

        int statingIndex = ThreadLocalRandom.current().nextInt(contents.length);

        for (int index = 0; index < statingIndex; index++) {
            for (int itemstacks = 9; itemstacks < 18; itemstacks++) {
                inv.setItem(itemstacks, contents[(itemstacks + ItemIndex) % contents.length]);
            }
            ItemIndex++;
        }

        ItemStack item = new ItemStack(Material.HOPPER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8|");
        item.setItemMeta(meta);
        inv.setItem(4, item);

    }

    public void spin(final Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "§6§lLotterie 3");
        shuffle(inv);
        invs.add(inv);
        player.openInventory(inv);

        Random r = new Random();
        double seconds = 10.0 + (15.0 -10.0) * r.nextDouble();

        new BukkitRunnable() {
            double delay = 0;
            int ticks = 0;
            boolean done = false;

            public void run() {
                if (done)
                    return;
                ticks++;
                delay += 1 / (20 *seconds);
                if (ticks > delay * 10) {
                    ticks = 0;

                    for (int itemstacks = 9; itemstacks < 18; itemstacks++)
                        inv.setItem(itemstacks, contents[(itemstacks + ItemIndex) % contents.length]);

                    ItemIndex++;

                    if (delay >= .5) {
                        done = true;
                        new BukkitRunnable() {
                            public void run() {
                                ItemStack item = inv.getItem(13);
                                player.getInventory().addItem(item);
                                player.updateInventory();
                                player.closeInventory();
                                cancel();
                            }
                        }.runTaskLater(Main.getPlugin(Main.class), 50);
                        cancel();
                    }
                }
            }


        }.runTaskTimer(Main.getINSTANCE(), 0, 1);
    }
}


