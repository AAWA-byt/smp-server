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

        Main.getGamble().setItem(11, new ItemBuilder(Material.COMPASS, 1).setDisplayname("§9§lTeleporter §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getGamble().setItem(13, new ItemBuilder(Material.DIAMOND, 1).setDisplayname("§6§lLotterie §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getGamble().setItem(15, new ItemBuilder(Material.CRAFTING_TABLE, 1).setDisplayname("§2§lRezepte §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        Main.getGamble().setItem(26, new ItemBuilder(Material.BARRIER,1).setDisplayname("§c§lSchließen §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());


        //inventory "background"
        Main.getGamble().setItem(0, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE, 1).setDisplayname("§c")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

    }
}
