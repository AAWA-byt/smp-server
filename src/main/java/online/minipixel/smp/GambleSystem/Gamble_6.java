package online.minipixel.smp.GambleSystem;

import online.minipixel.smp.Main;
import online.minipixel.smp.MessageAPI.Prefix;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Gamble_6 {

    List<Inventory> invs = new ArrayList<Inventory>();
    public static ItemStack[] contents;
    private int ItemIndex = 0;

    public void gamble(Player player) {

        ItemStack fee = new ItemStack(Material.DIAMOND, 20);
        if (player.getInventory().getItemInMainHand().equals(fee)) {
            player.getInventory().removeItem(fee);
            spin(player);

        } else {
        player.sendMessage(Prefix.Plugin_Prefix + "§cDu benötigst 20 Diamanten!");

        }
    }


    public void shuffle(Inventory inv) {
        if (contents == null) {
            ItemStack[] items = new ItemStack[15];
            items[0] = new ItemBuilder(Material.SKELETON_SPAWN_EGG, 1).build();
            items[2] = new ItemBuilder(Material.CREEPER_SPAWN_EGG, 1).build();
            items[4] = new ItemBuilder(Material.COW_SPAWN_EGG, 1).build();
            items[6] = new ItemBuilder(Material.ZOMBIE_SPAWN_EGG, 1).build();
            items[8] = new ItemBuilder(Material.VILLAGER_SPAWN_EGG, 1).build();
            items[10] = new ItemBuilder(Material.SPIDER_SPAWN_EGG, 1).build();
            items[12] = new ItemBuilder(Material.AMETHYST_BLOCK, 4).build();
            items[14] = new ItemBuilder(Material.FOX_SPAWN_EGG, 1).build();
            items[13] = new ItemBuilder(Material.BLUE_ICE, 12).build();
            items[11] = new ItemBuilder(Material.GLOWSTONE, 6).build();
            items[9] = new ItemBuilder(Material.ANCIENT_DEBRIS, 2).build();
            items[7] = new ItemBuilder(Material.SPAWNER, 1).build();
            items[5] = new ItemBuilder(Material.EMERALD_BLOCK, 2).build();
            items[3] = new ItemBuilder(Material.CHAIN, 10).build();
            items[1] = new ItemBuilder(Material.BAMBOO, 10).build();

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
        Inventory inv = Bukkit.createInventory(null, 27, "§6§lLotterie VIP");
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
                                player.playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 10, 1);
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

