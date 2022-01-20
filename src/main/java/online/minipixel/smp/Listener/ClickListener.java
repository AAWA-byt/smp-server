package online.minipixel.smp.Listener;

import online.minipixel.smp.GambleSystem.*;
import online.minipixel.smp.Inventorys.Crafting;
import online.minipixel.smp.Main;
import online.minipixel.smp.ModelsParticel.Effects;
import online.minipixel.smp.ModelsParticel.ParticelData;
import online.minipixel.smp.Utils.CraftingUtils;
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

        if (e.getCurrentItem().getType() == Material.DIAMOND_HELMET) {
            new CraftingUtils().utils_emerald_helmet(player);

        } else if (e.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE) {
            new CraftingUtils().utils_emerald_chestplate(player);

        } else if (e.getCurrentItem().getType() == Material.DIAMOND_LEGGINGS) {
            new CraftingUtils().utils_emerald_leggings(player);

        } else if (e.getCurrentItem().getType() == Material.DIAMOND_BOOTS) {
            new CraftingUtils().utils_emerald_boots(player);

        } else if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
            new CraftingUtils().utils_emerald_sword(player);

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
