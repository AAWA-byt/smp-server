package online.minipixel.smp.Inventorys;

import online.minipixel.smp.CustomItems.Items.*;
import online.minipixel.smp.Main;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;

public class Crafting {

    public static void open_crafting_menu() {
        create_crafting_menu();
    }

    private static void create_crafting_menu() {

        //Emerald Armor
        Main.getCrafting().setItem(10, new ItemBuilder(Material.BOOK, 1).setDisplayname("§9§lEmeraldrüstung")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getCrafting().setItem(12, EmeraldHelmet.IS);
        Main.getCrafting().setItem(13, EmeraldChestplatte.IS);
        Main.getCrafting().setItem(14, EmeraldLeggings.IS);
        Main.getCrafting().setItem(15, EmeraldBoots.IS);



        //Tools
        Main.getCrafting().setItem(119, new ItemBuilder(Material.BOOK, 1).setDisplayname("§9§lTools")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getCrafting().setItem(21, EmeraldSword.IS);
        Main.getCrafting().setItem(22, EmeraldPickaxe.IS);
        Main.getCrafting().setItem(23, Lapispickaxe.IS);
        Main.getCrafting().setItem(24, ObsidianSword.IS);
        Main.getCrafting().setItem(25, Knockbackstick.IS);


        //Others
        Main.getCrafting().setItem(28, new ItemBuilder(Material.BOOK, 1).setDisplayname("§9§lAndere")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getCrafting().setItem(30, Redstoneboots.IS);

        //Item for closing the inventory
        Main.getCrafting().setItem(53, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());


        //background of inventory (design)
        Main.getCrafting().setItem(0, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(1, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(2, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(3, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(4, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(5, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(6, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(7, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(8, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(9, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(17, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(18, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(26, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(27, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(35, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(36, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(44, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(45, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(46, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(47, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(48, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(49, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(50, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(51, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        Main.getCrafting().setItem(52, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
    }

}
