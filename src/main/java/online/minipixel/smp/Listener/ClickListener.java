package online.minipixel.smp.Listener;

import online.minipixel.smp.GambleSystem.Gamble;
import online.minipixel.smp.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

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

    @EventHandler
    public void onClickMenu(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals("§8§lMenü")) {
            e.setCancelled(true);
            if (e.getCurrentItem() != null) {

              if (e.getCurrentItem().equals(Material.COMPASS)) {
                  player.closeInventory();
                  player.updateInventory();
                  player.openInventory(Main.getTeleporter());

              } else if (e.getCurrentItem().equals(Material.DIAMOND)) {
                  player.closeInventory();
                  player.updateInventory();
                  new Gamble().start(player);

              } else if (e.getCurrentItem().equals(Material.CHEST)) {
                  player.closeInventory();
                  player.updateInventory();
                  player.openInventory(Main.getShop());
              }

            }
        }
    }

    @EventHandler
    public void onClickVip(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals("§8§lVip Menü")) {
            e.setCancelled(true);
            if (e.getCurrentItem() != null) {

                if (e.getCurrentItem().equals(Material.COMPASS)) {
                    player.closeInventory();
                    player.updateInventory();


                } else if (e.getCurrentItem().equals(Material.PLAYER_HEAD)) {
                    player.closeInventory();
                    player.updateInventory();


                } else if (e.getCurrentItem().equals(Material.GLOWSTONE_DUST)) {
                    player.closeInventory();
                    player.updateInventory();

                }
            }
        }
    }
}
