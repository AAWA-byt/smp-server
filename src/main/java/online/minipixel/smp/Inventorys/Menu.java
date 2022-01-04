package online.minipixel.smp.Inventorys;

import online.minipixel.smp.Main;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;

public class Menu {

    public static void open_main_menu() {
        create_main_menu();
    }

    private static void create_main_menu() {

        Main.getMenu().setItem(0, new ItemBuilder(Material.COMPASS, 1).setDisplayname("§9§lTeleporter §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getMenu().setItem(1, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getMenu().setItem(2, new ItemBuilder(Material.CHEST, 1).setDisplayname("§6§lShop §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

    }
}
