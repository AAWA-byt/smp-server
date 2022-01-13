package online.minipixel.smp.Utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class JoinMethod {

    public void firstJoin(Player player) {

    }

    public void defaultJoin(Player player) {


    }

    public void helpmessage(Player player) {


    }

    public void equip(Player player) {

        Inventory inventory = player.getInventory();

        inventory.addItem(new ItemBuilder(Material.STONE_SWORD, 1).build());
        inventory.addItem(new ItemBuilder(Material.STONE_AXE, 1).build());
        inventory.addItem(new ItemBuilder(Material.STONE_PICKAXE, 1).build());
        inventory.addItem(new ItemBuilder(Material.BREAD, 20).build());
    }
}
