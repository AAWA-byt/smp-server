package online.minipixel.smp.GambleSystem;

import online.minipixel.smp.GambleSystem.gambles.*;
import online.minipixel.smp.MessageAPI.Prefix;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Gamble {

    public void start(Player player) {
        Inventory inventory = player.getInventory();

        ItemStack diamond_1 = new ItemStack(Material.DIAMOND, 3);
        ItemStack diamond_2 = new ItemStack(Material.DIAMOND,6);
        ItemStack diamond_3 = new ItemStack(Material.DIAMOND,9);
        ItemStack diamond_4 = new ItemStack(Material.DIAMOND,12);
        ItemStack diamond_5 = new ItemStack(Material.DIAMOND,15);

        if (player.getItemInHand() == diamond_1) {
            new Gamble_1().gamble(player);

        } else if (player.getItemInHand() == diamond_2) {
            new Gamble_2().gamble(player);

        } else if (player.getItemInHand() == diamond_3) {
            new Gamble_3().gamble(player);

        } else if (player.getItemInHand() == diamond_4) {
            new Gamble_4().gamble(player);

        } else if (player.getItemInHand() == diamond_5) {
            new Gamble_5().gamble(player);

        } else if (player.getItemInHand() == null) {
            player.closeInventory();
            player.updateInventory();
            player.sendMessage(Prefix.Plugin_Prefix + "§7Halte bitte §c3§7, §c6§7, §c9§7, §c12§7 oder §c15 §7Dimanten, wenn du die Lotterie öffnest.");
        }
    }
}
