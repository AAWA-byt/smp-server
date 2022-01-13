package online.minipixel.smp.Listener;

import online.minipixel.smp.GambleSystem.gambles.*;
import online.minipixel.smp.Main;
import online.minipixel.smp.ModelsParticel.Effects;
import online.minipixel.smp.ModelsParticel.ParticelData;
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

            } else if (e.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                player.closeInventory();
                player.updateInventory();

            } else if (e.getCurrentItem().getType() == Material.BARRIER) {
                player.closeInventory();
                player.updateInventory();

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
                    player.openInventory(Main.getTeleporter());

                } else if (e.getCurrentItem().equals(Material.TOTEM_OF_UNDYING)) {
                    player.closeInventory();
                    player.updateInventory();

                    ParticelData particelData_totem = new ParticelData(player.getUniqueId());

                    if (particelData_totem.hasID()) {
                        particelData_totem.endTask();
                        particelData_totem.removeID();

                    }
                    Effects trails = new Effects(player);
                    trails.startTotem();

                } else if (e.getCurrentItem().equals(Material.DRAGON_EGG)) {
                    player.closeInventory();
                    player.updateInventory();

                    ParticelData particelData_dragon = new ParticelData(player.getUniqueId());

                    if (particelData_dragon.hasID()) {
                        particelData_dragon.endTask();
                        particelData_dragon.removeID();

                    }
                    Effects trails = new Effects(player);
                    trails.startDragonBreath();

                } else if (e.getCurrentItem().equals(Material.BARRIER)) {
                    player.closeInventory();
                    player.updateInventory();

                    ParticelData particelData = new ParticelData(player.getUniqueId());

                    if (particelData.hasID()) {
                        particelData.endTask();
                        particelData.removeID();

                    }
                }
            }
        }
    }

    @EventHandler
    public void onClickGamble(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals("§6§lLotterie")) {
            e.setCancelled(true);
            if (e.getCurrentItem() != null) {

                if (e.getCurrentItem().getItemMeta().hasLocalizedName()) {

                    if (e.getCurrentItem().getItemMeta().getLocalizedName() == "l1") {
                        player.getInventory().close();
                        player.updateInventory();
                        new Gamble_1().gamble(player);

                    } else if (e.getCurrentItem().getItemMeta().getLocalizedName() == "l2") {
                        player.getInventory().close();
                        player.updateInventory();

                    } else if (e.getCurrentItem().getItemMeta().getLocalizedName() == "l3") {
                        player.getInventory().close();
                        player.updateInventory();

                    } else if (e.getCurrentItem().getItemMeta().getLocalizedName() == "l4") {
                        player.getInventory().close();
                        player.updateInventory();

                    } else if (e.getCurrentItem().getItemMeta().getLocalizedName() == "l5") {
                        player.getInventory().close();
                        player.updateInventory();

                    } else if (e.getCurrentItem().getItemMeta().getLocalizedName() == "l6") {
                        player.getInventory().close();
                        player.updateInventory();

                    } else if (e.getCurrentItem().getItemMeta().getLocalizedName() == "close") {
                        player.getInventory().close();
                        player.updateInventory();
                    }
                }
            }
        }
    }
}
