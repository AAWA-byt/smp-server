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

        Main.getGamble().setItem(10, new ItemBuilder(Material.GRASS_BLOCK, 1).setDisplayname("§a§lOverworld §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 8x Diamant", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!", "").setLocalizedName("l1").build());

        Main.getGamble().setItem(12, new ItemBuilder(Material.NETHERRACK, 1).setDisplayname("§4§lNether §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 12x Diamant", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!", "").setLocalizedName("l1").build());

        Main.getGamble().setItem(14, new ItemBuilder(Material.END_STONE, 1).setDisplayname("§f§lTools §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 20x Diamant", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!", "").setLocalizedName("l1").build());

        Main.getGamble().setItem(16, new ItemBuilder(Material.IRON_PICKAXE, 1).setDisplayname("§9§lTools §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 25x Diamant", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!", "").setLocalizedName("l1").build());

        Main.getGamble().setItem(26, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLocalizedName("close").build());



        //inventory "background"
        Main.getGamble().setItem(0, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(1, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(2, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(3, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(4, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(5, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(6, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(7, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(8, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(9, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(11, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(13, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(15, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(17, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(18, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(19, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(20, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(21, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(22, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(23, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(24, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getGamble().setItem(25, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
    }
}
