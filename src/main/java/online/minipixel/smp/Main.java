package online.minipixel.smp;

import online.minipixel.smp.Backpack.BackpackManager;
import online.minipixel.smp.Configs.ConfigBackpacks;
import online.minipixel.smp.Commands.*;
import online.minipixel.smp.Configs.ConfigWarps;
import online.minipixel.smp.CustomItems.ItemManager;
import online.minipixel.smp.Inventorys.Help;
import online.minipixel.smp.Inventorys.Menu;
import online.minipixel.smp.Inventorys.Team;
import online.minipixel.smp.Inventorys.Vip;
import online.minipixel.smp.Listener.*;
import online.minipixel.smp.MessageAPI.Prefix;
import online.minipixel.smp.Tablist.TablistManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class Main extends JavaPlugin {

    public static Main INSTANCE;
    private static ConfigWarps warps;

    private static Inventory menu;
    private static Inventory help;
    private static Inventory team;
    private static Inventory vip;
    private static Inventory teleporter;

    private TablistManager tablistManager;

    private ConfigBackpacks configBackpacks;
    private BackpackManager backpackManager;

    @Override
    public void onLoad() {
        configBackpacks = new ConfigBackpacks();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        log("--------------------------------------");
        log(ChatColor.BLUE + "" + ChatColor.BOLD + "LobbySystem " + ChatColor.GRAY + "wird geladen...");
        log("--------------------------------------");
        log("Developer: " + ChatColor.GREEN + "AAWA");
        log("E-Mail: " + ChatColor.GREEN + "admin.aaron@minipixel.online");
        log("Website: " + ChatColor.GREEN + "minipixel.online");
        log("MC-Server: " + ChatColor.GREEN + "minipixel.online");
        log("--------------------------------------");

        INSTANCE = this;
        tablistManager = new TablistManager();
        backpackManager = new BackpackManager();
        warps = new ConfigWarps("warps.yml", getDataFolder());
        ItemManager.initItems();

        //Inventorys

        menu = Bukkit.createInventory(null, 9*1, "§8§lMenü"); //created main menu for the whole server
        Menu.open_main_menu();

        help = Bukkit.createInventory(null, 9*1, "§8§lHelp Menü");
        Help.open_help_menu();

        team = Bukkit.createInventory(null, 9*1, "§8§lTeam Menü");
        Team.open_team_menu();

        vip = Bukkit.createInventory(null, 9*1, "§8§lVip Menü");
        Vip.open_vip_menu();

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
            getCommand("afk").setExecutor(new AFKCommand());
            getCommand("help").setExecutor(new HelpCommand());
            getCommand("menu").setExecutor(new MenuCommand());
            getCommand("backpack").setExecutor(new BackpackCommand());
            getCommand("vip").setExecutor(new VIPCommand());
            getCommand("team").setExecutor(new TeamCommand());
            getCommand("warp").setExecutor(new WarpCommand());
            getCommand("jda").setExecutor(new DiscordBotCommand());

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

    public void log(String text) {

        Bukkit.getConsoleSender().sendMessage(Prefix.System_Prefix + text);
    }

    public static Main getINSTANCE() { return INSTANCE; }
    public static Inventory getMenu() {return menu;}
    public static Inventory getHelp() {return help;}
    public static Inventory getTeam() {return team;}
    public static Inventory getVip() {return vip;}
    public TablistManager getTablistManager() { return tablistManager; }
    public ConfigBackpacks getConfiguration() {return configBackpacks;}
    public BackpackManager getBackpackManager() {return backpackManager;}
    public static ConfigWarps getWarps() {return warps;}
    public static Inventory getTeleporter() {return teleporter;}

    public ItemStack getItem(Player player) {
        ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(player.getUniqueId()));
        skullMeta.setDisplayName("§a" + player.getName());
        skullMeta.setLocalizedName(player.getName());
        skullMeta.setLore(Arrays.asList("§7Klicke um dich zu diesem Spieler zu teleportieren!"));
        itemStack.setItemMeta(skullMeta);

        return itemStack;
    }
}