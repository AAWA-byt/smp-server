package online.minipixel.smp.Inventorys;

import online.minipixel.smp.Main;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;

public class Help {

    public static void open_help_menu() {
        create_help_menu();
    }

    private static void create_help_menu() {

        Main.getHelp().setItem(0, new ItemBuilder(Material.BOOK, 1).setDisplayname("")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

    }
}
