package online.minipixel.smp.SkinManager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class SkinInventory {

    public void open(Player player) {

        Inventory skins;
        skins = Bukkit.createInventory(player, 9*1, "§8§lWähle einen Skin...");
        //TODO: add items for skins

        player.openInventory(skins);

    }

}
