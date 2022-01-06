package online.minipixel.smp.Inventorys;

import online.minipixel.smp.Main;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;

public class Gamble {

    public static void open_gamble_menu() {
        create_gamble_menu();
    }

    private static void create_gamble_menu() {

        Main.getGamble().setItem(10, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie 1 §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 1x Diamant", "").build());
        Main.getGamble().setItem(11, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie 2 §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 4x Diamant", "").build());
        Main.getGamble().setItem(12, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie 3 §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 6x Diamant", "").build());
        Main.getGamble().setItem(13, new ItemBuilder(Material.BOOK, 1).setDisplayname("§9§lAnleitung")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(14, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie 4 §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 8x Diamant", "").build());
        Main.getGamble().setItem(15, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie 5 §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 10x Diamant", "").build());
        Main.getGamble().setItem(16, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie 6 §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 15x Diamant", "").build());



        //inventory "background"
        Main.getGamble().setItem(0, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
    }
}
