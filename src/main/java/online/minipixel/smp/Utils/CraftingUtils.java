package online.minipixel.smp.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;


public class CraftingUtils {

    public void utils_emerald_helmet(Player player) {
        Inventory ueh;
        ueh = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldhelm");


        ueh.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        ueh.setItem(0, new ItemBuilder(Material.EMERALD, 5).build());

        player.openInventory(ueh);
    }

    public void utils_emerald_chestplate(Player player) {
        Inventory uec;
        uec = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldbrustplatte");

        uec.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uec.setItem(0, new ItemBuilder(Material.EMERALD, 8).build());

        player.openInventory(uec);
    }

    public void utils_emerald_leggings(Player player) {
        Inventory uel;

        uel = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldhose");

        uel.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uel.setItem(0, new ItemBuilder(Material.EMERALD, 8).build());

        player.openInventory(uel);
    }

}
