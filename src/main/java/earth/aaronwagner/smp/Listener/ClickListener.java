package earth.aaronwagner.smp.Listener;

import earth.aaronwagner.smp.GambleSystem.Gamble_End;
import earth.aaronwagner.smp.GambleSystem.Gamble_Nether;
import earth.aaronwagner.smp.GambleSystem.Gamble_Overworld;
import earth.aaronwagner.smp.GambleSystem.Gamble_Tools;
import online.minipixel.smp.GambleSystem.*;
import earth.aaronwagner.smp.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
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

    @EventHandler
    public void onClickMenu(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals("§8§lMenü")) {
            e.setCancelled(true);

            if (e.getCurrentItem().getType() == Material.COMPASS) {
                player.closeInventory();
                player.updateInventory();
                player.openInventory(Main.getTeleporter());

            } else if (e.getCurrentItem().getType() == Material.DIAMOND) {
                player.closeInventory();
                player.updateInventory();
                player.openInventory(Main.getGamble());

            } else if (e.getCurrentItem().getType() == Material.BARRIER) {
                player.closeInventory();
                player.updateInventory();

            }
        }
    }

    @EventHandler
    public void onClickGamble(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals("§6§lLotterie")) {
            e.setCancelled(true);

            if (e.getCurrentItem().getType() == Material.GRASS_BLOCK) {
                player.closeInventory();
                player.updateInventory();
                new Gamble_Overworld().gamble(player);

            } else if (e.getCurrentItem().getType() == Material.NETHERRACK) {
                player.closeInventory();
                player.updateInventory();
                new Gamble_Nether().gamble(player);


            } else if (e.getCurrentItem().getType() == Material.END_STONE) {
                player.closeInventory();
                player.updateInventory();
                new Gamble_End().gamble(player);

            } else if (e.getCurrentItem().getType() == Material.IRON_PICKAXE) {
                player.closeInventory();
                player.updateInventory();
                new Gamble_Tools().gamble(player);

            }
        }
    }

    @EventHandler
    public void onClickGambleSystem(InventoryClickEvent e) {

        if (e.getView().getTitle().equals("§8The End")) {
            e.setCancelled(true);

        } else if (e.getView().getTitle().equals("§8Nether")) {
            e.setCancelled(true);

        } else if (e.getView().getTitle().equals("§8Tools")) {
            e.setCancelled(true);

        } else if (e.getView().getTitle().equals("§8Overworld")) {
            e.setCancelled(true);

        }
    }

    @EventHandler
    public void onClickCrafting(InventoryClickEvent e) {
        Player player =  (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals("§8§lCrafting Rezepte")) {
            e.setCancelled(true);
        }

    }

    @EventHandler
    public void onClickCraftingUtilsGeneral(InventoryClickEvent e) {

        if (e.getView().getTitle().equals("§8Benötige Ressourcen für Emeraldhelm")) {
            e.setCancelled(true);

        } else if (e.getView().getTitle().equals("")) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onClickRessourceInventory(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().startsWith("§8Benötige Ressourcen für")) {
            e.setCancelled(true);
        }
    }
}
