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

public class Gamble_5 {

    List<Inventory> invs = new ArrayList<Inventory>();
    public static ItemStack[] contents;
    private int ItemIndex = 0;

    public void gamble(Player player) {

        ItemStack fee = new ItemStack(Material.DIAMOND, 15);
        if (player.getInventory().getItemInMainHand().isSimilar(fee)) {
            player.getInventory().removeItem(fee);
            spin(player);
        } else {
        player.sendMessage(Prefix.Plugin_Prefix + "§cDu benötigst 15 Diamanten!");

    }
}

    public void shuffle(Inventory inv) {
        if (contents == null) {
            ItemStack[] items = new ItemStack[22];

            items[1] = new ItemBuilder(Material.IRON_HELMET, 1).addEnchantment(Enchantment.MENDING, 1, true).build();
            items[6] = new ItemBuilder(Material.IRON_CHESTPLATE, 1).addEnchantment(Enchantment.MENDING, 1, true).build();
            items[11] = new ItemBuilder(Material.IRON_LEGGINGS, 1).addEnchantment(Enchantment.MENDING, 1, true).build();
            items[18] = new ItemBuilder(Material.IRON_BOOTS, 1).addEnchantment(Enchantment.MENDING, 1, true).build();

            items[4] = new ItemBuilder(Material.DIAMOND_HELMET, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true).build();
            items[8] = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true).build();
            items[13] = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true).build();
            items[20] = new ItemBuilder(Material.DIAMOND_BOOTS, 1).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true).build();

            items[5] = new ItemBuilder(Material.VILLAGER_SPAWN_EGG, 1).build();
            items[9] = new ItemBuilder(Material.WOLF_SPAWN_EGG, 1).build();
            items[12] = new ItemBuilder(Material.CREEPER_SPAWN_EGG, 1).build();
            items[14] = new ItemBuilder(Material.COW_SPAWN_EGG, 1).build();
            items[17] = new ItemBuilder(Material.SHEEP_SPAWN_EGG, 1).build();
            items[19] = new ItemBuilder(Material.ZOMBIE_SPAWN_EGG, 1).build();
            items[21] = new ItemBuilder(Material.SKELETON_SPAWN_EGG, 1).build();

            items[16] = new ItemBuilder(Material.BEACON, 1).build();
            items[3] = new ItemBuilder(Material.SPAWNER, 1).build();

            items[0] = new ItemBuilder(Material.ENCHANTED_BOOK, 1).addEnchantment(Enchantment.ARROW_INFINITE, 1, true).build();
            items[15] = new ItemBuilder(Material.ENCHANTED_BOOK, 1).addEnchantment(Enchantment.DAMAGE_ALL, 5, true).build();


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
        Inventory inv = Bukkit.createInventory(null, 27, "§6§lLotterie 5");
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