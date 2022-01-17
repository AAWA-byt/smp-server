package online.minipixel.smp.GambleSystem;

import online.minipixel.smp.Main;
import online.minipixel.smp.MessageAPI.Prefix;
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

public class Gamble_End {

    List<Inventory> invs = new ArrayList<Inventory>();
    public static ItemStack[] contents;
    private int ItemIndex = 0;

    public void gamble(Player player) {

        ItemStack fee = new ItemStack(Material.DIAMOND, 20);
        if (player.getInventory().getItemInMainHand().equals(fee)) {
            player.getInventory().removeItem(player.getInventory().getItemInMainHand());
            this.spin(player);

        } else {
            player.closeInventory();
            player.sendMessage(Prefix.Plugin_Prefix + "§cDu benötigst 20 Diamanten!");
        }



    }


    public void shuffle (Inventory inv){
        if (contents == null) {
            ItemStack[] items = new ItemStack[19];
            items[0] = new ItemStack(Material.END_STONE, 64);
            items[1] = new ItemStack(Material.PURPUR_BLOCK, 64);
            items[2] = new ItemStack(Material.CHORUS_FLOWER, 64);
            items[3] = new ItemStack(Material.DRAGON_HEAD, 1);
            items[4] = new ItemStack(Material.DRAGON_BREATH, 16);
            items[5] = new ItemStack(Material.ELYTRA, 1);
            items[6] = new ItemStack(Material.END_ROD, 64);
            items[7] = new ItemStack(Material.END_CRYSTAL, 64);
            items[8] = new ItemStack(Material.ENDER_PEARL, 16);
            items[9] = new ItemStack(Material.END_STONE, 64);
            items[10] = new ItemStack(Material.PURPUR_BLOCK, 64);
            items[12] = new ItemStack(Material.CHORUS_FLOWER, 64);
            items[13] = new ItemStack(Material.DRAGON_HEAD, 1);
            items[14] = new ItemStack(Material.DRAGON_BREATH, 32);
            items[15] = new ItemStack(Material.ELYTRA, 1);
            items[16] = new ItemStack(Material.END_ROD, 64);
            items[17] = new ItemStack(Material.END_CRYSTAL, 64);
            items[18] = new ItemStack(Material.ENDER_PEARL, 16);



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

    public void spin ( final Player player){
        Inventory inv = Bukkit.createInventory(null, 27, "§8The End");
        shuffle(inv);
        invs.add(inv);
        player.openInventory(inv);

        Random r = new Random();
        double seconds = 10.0 + (15.0 - 10.0) * r.nextDouble();

        new BukkitRunnable() {
            double delay = 0;
            int ticks = 0;
            boolean done = false;

            public void run() {
                if (done)
                    return;
                ticks++;
                delay += 1 / (20 * seconds);
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
