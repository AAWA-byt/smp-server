package online.minipixel.smp.Inventorys;

import online.minipixel.smp.CustomItems.Items.*;
import online.minipixel.smp.Main;

public class Crafting {

    public static void open_crafting_menu() {
        create_crafting_menu();
    }

    private static void create_crafting_menu() {

        Main.getCrafting().setItem(0, EmeraldHelmet.IS);
        Main.getCrafting().setItem(1, EmeraldChestplatte.IS);
        Main.getCrafting().setItem(2, EmeraldLeggings.IS);
        Main.getCrafting().setItem(3, EmeraldBoots.IS);
        Main.getCrafting().setItem(4, EmeraldSword.IS);
        Main.getCrafting().setItem(5, EmeraldPickaxe.IS);
        Main.getCrafting().setItem(6, Redstoneboots.IS);
        Main.getCrafting().setItem(7, Lapispickaxe.IS);
        Main.getCrafting().setItem(8, ObsidianSword.IS);
        Main.getCrafting().setItem(9, Knockbackstick.IS);
    }

}
