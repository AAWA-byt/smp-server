package online.minipixel.smp;

import online.minipixel.smp.Commands.AFKCommand;
import online.minipixel.smp.Commands.HelpCommand;
import online.minipixel.smp.Commands.MenuCommand;
import online.minipixel.smp.Inventorys.Help;
import online.minipixel.smp.Inventorys.Menu;
import online.minipixel.smp.Inventorys.Team;
import online.minipixel.smp.Listener.*;
import online.minipixel.smp.MessageAPI.Prefix;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main INSTANCE;

    private static Inventory menu;
    private static Inventory help;
    private static Inventory team;

    @Override
    public void onEnable() {
        // Plugin startup logic

        log("--------------------------------------");
        log(ChatColor.RED + "Das Plugin wird geladen...");
        log("--------------------------------------");
        log("Developer: " + ChatColor.GREEN + "AAWA");
        log("E-Mail: " + ChatColor.GREEN + "admin.aaron@minipixel.online");
        log("Website: " + ChatColor.GREEN + "minipixel.online");
        log("MC-Server: " + ChatColor.GREEN + "minipixel.online");
        log("--------------------------------------");

        INSTANCE = this;

        //Inventorys

        menu = Bukkit.createInventory(null, 9*1, "§8§lMenü"); //created main menu for the whole server
        Menu.open_main_menu(); //initialize main menu

        help = Bukkit.createInventory(null, 9*1, "§8§lHelp Menü");
        Help.open_help_menu();

        team = Bukkit.createInventory(null, 9*1, "§8§lTeam Menü");
        Team.open_team_menu();

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

            log(ChatColor.GREEN + "Die Listener wurden geladen!");
            log("");
            log(ChatColor.RED + "Die Commands werden geladen...");
            //Commands
            getCommand("afk").setExecutor(new AFKCommand());
            getCommand("help").setExecutor(new HelpCommand());
            getCommand("menu").setExecutor(new MenuCommand());

            log(ChatColor.GREEN + "Die Commands wurden geladen!");
            log("");

        } else {
            /*
             * We inform about the fact that PlaceholderAPI isn't installed and 101then
             * disable this plugin to prevent issues.
             */
            System.out.println("Could not find PlaceholderAPI! This plugin is required.");
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
        log(ChatColor.RED + "Das Plugin ist deaktiviert!");
    }

    public void log(String text) {

        Bukkit.getConsoleSender().sendMessage(Prefix.System_Prefix + text);
    }

    public static Main getINSTANCE() { return INSTANCE; }
    public static Inventory getMenu() {return menu;}
    public static Inventory getHelp() {return help;}
    public static Inventory getTeam() {return team;}
}