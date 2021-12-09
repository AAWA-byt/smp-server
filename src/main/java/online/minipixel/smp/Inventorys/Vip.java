package online.minipixel.smp.Inventorys;

import online.minipixel.smp.Main;
import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;

public class Vip {

    public static void open_vip_menu() {

    create_vip_menu();
}

        private static void create_vip_menu() {

            Main.getVip().setItem(0, new ItemBuilder(Material.COMPASS, 1).setDisplayname("§9§lTeleporter §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            Main.getVip().setItem(1, new ItemBuilder(Material.PLAYER_HEAD, 1).setDisplayname("§2§lSkins §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            Main.getVip().setItem(2, new ItemBuilder(Material.GLOWSTONE_DUST,1).setDisplayname("§e§lPartikel §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        }
}
