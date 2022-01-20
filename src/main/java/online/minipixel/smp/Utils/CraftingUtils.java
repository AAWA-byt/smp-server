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

        ueh.setItem(7, new ItemBuilder(Material.ARROW, 1).setDisplayname("§9§lZurück §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        ueh.setItem(0, new ItemBuilder(Material.EMERALD, 5).build());

        player.openInventory(ueh);
    }

    public void utils_emerald_chestplate(Player player) {
        Inventory uec;
        uec = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldbrustplatte");

        uec.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uec.setItem(7, new ItemBuilder(Material.ARROW, 1).setDisplayname("§9§lZurück §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uec.setItem(0, new ItemBuilder(Material.EMERALD, 8).build());

        player.openInventory(uec);
    }

    public void utils_emerald_leggings(Player player) {
        Inventory uel;

        uel = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldhose");

        uel.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uel.setItem(7, new ItemBuilder(Material.ARROW, 1).setDisplayname("§9§lZurück §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uel.setItem(0, new ItemBuilder(Material.EMERALD, 8).build());

        player.openInventory(uel);
    }

    public void utils_emerald_boots(Player player) {
        Inventory ueb;

        ueb = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldschuhe");

        ueb.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        ueb.setItem(7, new ItemBuilder(Material.ARROW, 1).setDisplayname("§9§lZurück §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        ueb.setItem(0, new ItemBuilder(Material.EMERALD, 8).build());

        player.openInventory(ueb);
    }

    public void utils_emerald_sword(Player player) {
        Inventory ues;
        ues = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldschwert");

        ues.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        ues.setItem(7, new ItemBuilder(Material.ARROW, 1).setDisplayname("§9§lZurück §7(Linksklick)")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        ues.setItem(0, new ItemBuilder(Material.EMERALD, 2).build());
        ues.setItem(1, new ItemBuilder(Material.STICK, 1).build());

        player.openInventory(ues);
    }

    public void utils_emerald_pickaxe(Player player) {
        Inventory uep;
        uep = Bukkit.createInventory(null, 9*1, "§8Benötige Ressourcen für Emeraldspitzhacke");

        uep.setItem(8, new ItemBuilder(Material.BARRIER, 1).setDisplayname("§c§lSchließen §7(Linksklick")
                .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uep.setItem(7, new ItemBuilder(Material.ARROW, 1).setDisplayname("§9§lZurück §7(Linksklick)")
            .addItemFlags(ItemFlag.HIDE_ATTRIBUTES).build());

        uep.setItem(0, new ItemBuilder(Material.EMERALD, 3).build());
        uep.setItem(1, new ItemBuilder(Material.STICK, 2).build());

        player.openInventory(uep);
    }
}
