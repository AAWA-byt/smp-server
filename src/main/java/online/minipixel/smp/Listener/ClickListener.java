package online.minipixel.smp.Listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickListener implements Listener {


    @EventHandler
    public void OnClickTeleporter(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§8§lTeleporter")) {
            event.setCancelled(true);
            if (event.getCurrentItem() != null) {
                String playername = event.getCurrentItem().getItemMeta().getLocalizedName();
                event.getWhoClicked().teleport(Bukkit.getPlayer(playername));

            }
        }
    }
}
