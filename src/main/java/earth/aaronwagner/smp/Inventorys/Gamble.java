package earth.aaronwagner.smp.Inventorys;

import earth.aaronwagner.smp.Main;
import earth.aaronwagner.smp.Utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;

public class Gamble {

    public static void open_gamble_menu() {
        create_gamble_menu();
    }

    private static void create_gamble_menu() {

        Main.getGamble().setItem(10, new ItemBuilder(Material.GRASS_BLOCK, 1).setDisplayname("§a§lOverworld §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 8x Diamant", "", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!",
                        "", "§7Preise:",
                        "§c- 64x MYCELIUM",
                        "§c- 64x AMETHYST_BLOCK",
                        "§c- 64x TINTED_GLASS",
                        "§c- 64x DARK_PRISMARINE",
                        "§c- 64x BLUE_ICE",
                        "§c- 64x DRIPSTONE_BLOCK",
                        "§c- 64x TUFF",
                        "§c- 64x CLAY",
                        "§c- 64x SNOW_BLOCK")
                .setLocalizedName("l1").build());

        Main.getGamble().setItem(12, new ItemBuilder(Material.NETHERRACK, 1).setDisplayname("§4§lNether §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 12x Diamant", "", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!",
                        "", "§7Preise:",
                        "§c- 64x SHROOMLIGHT",
                        "§c- 64x GILDED_BLACKSTONE",
                        "§c- 64x WARPED_WART_BLOCK",
                        "§c- 64x NETHER_WART_BLOCK",
                        "§c- 64x MAGMA_BLOCK",
                        "§c- 64x NETHER_QUARTZ_ORE",
                        "§c- 64x SMOOTH_BASALT",
                        "§c- 64x OBSIDIAN",
                        "§c- 64x CRYING_OBSIDIAN")
                .setLocalizedName("l2").build());

        Main.getGamble().setItem(14, new ItemBuilder(Material.END_STONE, 1).setDisplayname("§f§lEnd §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 20x Diamant", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!",
                        "", "§7Preise:",
                        "§c- 1x NETHERITE_INGOT",
                        "§c- 1x TRIDENT",
                        "§c- 1x TOTEM_OF_UNDYING",
                        "§c- 1x SPECTRAL_ARROW",
                        "§c- 16x DRAGON_BREATH",
                        "§c- 1x ELYTRA",
                        "§c- 64x END_ROD",
                        "§c- 64x END_CRYSTAL",
                        "§c- 16x ENDER_PEARL")
                .setLocalizedName("l3").build());

        Main.getGamble().setItem(16, new ItemBuilder(Material.IRON_PICKAXE, 1).setDisplayname("§9§lTools §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).setLore("", "§7Preis: 25x Diamant", "§cDu musst den benötigten Preis", "§cin der Hand halten, wenn", "§cdu die Lotterie öffnest!",
                        "", "§7Preise:",
                        "§c- 64x END_STONE",
                        "§c- 64x PURPUR_BLOCK",
                        "§c- 64x CHORUS_FLOWER",
                        "§c- 1x DRAGON_HEAD",
                        "§c- 16x DRAGON_BREATH",
                        "§c- 1x ELYTRA",
                        "§c- 64x END_ROD",
                        "§c- 64x END_CRYSTAL",
                        "§c- 16x ENDER_PEARL")
                .setLocalizedName("l4").build());

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
