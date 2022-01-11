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

            Main.getVip().setItem(2, new ItemBuilder(Material.TOTEM_OF_UNDYING, 1).setDisplayname("§6§lTotem Effekt §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            Main.getVip().setItem(3, new ItemBuilder(Material.DRAGON_EGG,1).setDisplayname("§b§lDrachen Effekt §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            Main.getVip().setItem(5, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lEffekte entfernen §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());
        }
}
