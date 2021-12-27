package online.minipixel.smp.ModelsParticel;

import online.minipixel.smp.Utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;

public class ParticelInventory {

    Inventory particels;

    public void open(Player player) {

        if (player.hasPermission("minipixel.vip")) {


            particels = Bukkit.createInventory(player, 9*1, "§8Partikel Menü");

            particels.setItem(0, new ItemBuilder(Material.TOTEM_OF_UNDYING, 1).setDisplayname("§6§lTotem Effekt §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            particels.setItem(1, new ItemBuilder(Material.DRAGON_EGG, 1).setDisplayname("§5§lDrachen Effekt §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            particels.setItem(2, new ItemBuilder(Material.WHITE_WOOL, 1).setDisplayname("§f§lWolken Effekt §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

            particels.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lEffekte entfernen §7(Linksklick)")
                    .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        }
    }

    public void close(Player player) {

        particels.close();
        player.closeInventory();
        player.updateInventory();
    }
}
