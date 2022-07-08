package earth.aaronwagner.smp;

import earth.aaronwagner.smp.Backpack.BackpackManager;
import earth.aaronwagner.smp.Commands.BackpackCommand;
import earth.aaronwagner.smp.Commands.EnderchestCommand;
import earth.aaronwagner.smp.Commands.MenuCommand;
import earth.aaronwagner.smp.Commands.WarpCommand;
import earth.aaronwagner.smp.Configs.ConfigBackpacks;
import earth.aaronwagner.smp.Configs.ConfigWarps;
import earth.aaronwagner.smp.CustomItems.ItemManager;
import earth.aaronwagner.smp.Inventorys.Gamble;
import earth.aaronwagner.smp.Inventorys.Menu;
import earth.aaronwagner.smp.Inventorys.Vip;
import earth.aaronwagner.smp.Listener.*;
import earth.aaronwagner.smp.MessageAPI.Prefix;
import earth.aaronwagner.smp.Scoreboard.TablistManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Arrays;

public final class Main extends JavaPlugin {

    public static Main INSTANCE;
    private static ConfigWarps warps;

    private static Inventory menu;
    private static Inventory vip;
    private static Inventory teleporter;
    private static Inventory gamble;
    private static Inventory admin;

    private ConfigBackpacks configBackpacks;
    private BackpackManager backpackManager;
    private TablistManager tablistManager;


    @Override
    public void onLoad() {
        configBackpacks = new ConfigBackpacks();
    } //loading backpack config

    @Override
    public void onEnable() {
        // Plugin startup logic

        log("--------------------------------------");
        log(ChatColor.BLUE + "" + ChatColor.BOLD + "SMP " + ChatColor.GRAY + "wird geladen...");
        log("--------------------------------------");
        log("Developer: " + ChatColor.GREEN + "AAWA");
        log("E-Mail: " + ChatColor.GREEN + "admin.aaron@minipixel.online");
        log("Website: " + ChatColor.GREEN + "minipixel.online");
        log("MC-Server: " + ChatColor.GREEN + "minipixel.online");
        log("--------------------------------------");

        INSTANCE = this;
        backpackManager = new BackpackManager();
        warps = new ConfigWarps("warps.yml", getDataFolder());
        ItemManager.initItems();
        tablistManager = new TablistManager();

        //Inventorys
        //creating inventory that are often used

        menu = Bukkit.createInventory(null, 9*3, "§8§lMenü"); //created main menu for the whole server
        Menu.open_main_menu();

        vip = Bukkit.createInventory(null, 9*1, "§d§lVip Menü");
        Vip.open_vip_menu();

        teleporter = Bukkit.createInventory(null, 9*5, "§8§lTeleporter");

        gamble = Bukkit.createInventory(null, 9*3, "§6§lLotterie");
        Gamble.open_gamble_menu();

        admin = Bukkit.createInventory(null, 9*3, "§4§lAdmin");
        //PlaceholderAPI
        log(ChatColor.RED + "PlaceholderAPI wird geladen...");
        log("");

        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {

            log(ChatColor.RED + "Die Listener werden geladen...");
            //Listener
            Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
            Bukkit.getPluginManager().registerEvents(new ConnectionListener(), this);
            Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
            Bukkit.getPluginManager().registerEvents(new InventoryListener(), this);
            Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
            Bukkit.getPluginManager().registerEvents(new QuitListener(), this);
            Bukkit.getPluginManager().registerEvents(new ClickListener(), this);

            log(ChatColor.GREEN + "Die Listener wurden geladen!");
            log("");
            log(ChatColor.RED + "Die Commands werden geladen...");
            //Commands
            getCommand("menu").setExecutor(new MenuCommand());
            getCommand("backpack").setExecutor(new BackpackCommand());
            getCommand("warp").setExecutor(new WarpCommand());
            getCommand("enderchest").setExecutor(new EnderchestCommand());

            log(ChatColor.GREEN + "Die Commands wurden geladen!");
            log("");

        } else {
            /*
             * We inform about the fact that PlaceholderAPI isn't installed and 101then
             * disable this plugin to prevent issues.
             */
            log("Could not find PlaceholderAPI! This plugin is required.");
            Bukkit.getPluginManager().disablePlugin(this);
        }
        log(ChatColor.GREEN + "PlaceholderAPI wurde geladen...");
        log("");
        log("");
        log("--------------------------------------");
        log(ChatColor.GREEN + "Das Plugin wurde geladen!");
        log("--------------------------------------");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        backpackManager.save();
        configBackpacks.save();
        log(ChatColor.RED + "Das Plugin ist deaktiviert!");
    }

    public void log(String text) { //log method for enable and disable the plugin

        Bukkit.getConsoleSender().sendMessage(Prefix.System_Prefix + text);
    }

    public static Main getINSTANCE() { return INSTANCE; }
    public static Inventory getMenu() {return menu;}
    public static Inventory getVip() {return vip;}
    public ConfigBackpacks getConfiguration() {return configBackpacks;}
    public BackpackManager getBackpackManager() {return backpackManager;}
    public static ConfigWarps getWarps() {return warps;}
    public static Inventory getTeleporter() {return teleporter;}
    public static Inventory getGamble() {return gamble;}
    public TablistManager getTablistManager() {return tablistManager;}
}