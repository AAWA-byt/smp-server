package earth.aaronwagner.smp.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

        Player player = e.getPlayer();

        if (player.hasPermission("minipixel.admin")) {
            e.setFormat("§4Admin §8| §7" + player.getName() + " §8>> §f" + ChatColor.translateAlternateColorCodes('&', e.getMessage()));

        } else if (player.hasPermission("minipixel.mod")){
            e.setFormat("§bMod §8| §7" + player.getName() + " §8>> §f" + ChatColor.translateAlternateColorCodes('&', e.getMessage()));

        } else if (player.hasPermission("minipixel.dev")) {
            e.setFormat("§aDev §8| §7" + player.getName() + " §8>> §f" + ChatColor.translateAlternateColorCodes('&', e.getMessage()));

        } else if (player.hasPermission("minipixel.sup")){
            e.setFormat("§9Sup §8| §7" + player.getName() + " §8>> §f" + ChatColor.translateAlternateColorCodes('&', e.getMessage()));

        } else if (player.hasPermission("minipixel.builder")) {
            e.setFormat("§eBuilder §8| §7" + player.getName() + " §8>> §f" + ChatColor.translateAlternateColorCodes('&', e.getMessage()));

        } else if (player.hasPermission("minipixel.vip+")) {
            e.setFormat("§dVIP§6§l+ §8| §7" + player.getName() + " §8>> §f" + ChatColor.translateAlternateColorCodes('&', e.getMessage()));

        } else if (player.hasPermission("minipixel.vip")){
            e.setFormat("§dVIP §8| §7" + player.getName() + " §8>> §f" + e.getMessage());

        } else {
            e.setFormat("§7" + player.getName() + " §8>> §f" + e.getMessage());

        }
    }
}
