package earth.aaronwagner.smp.Listener;

import earth.aaronwagner.smp.Utils.JoinMethod;
import earth.aaronwagner.smp.MessageAPI.Prefix;
import earth.aaronwagner.smp.Scoreboard.DefaultScoreboard;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        new DefaultScoreboard(player, "§7§l<< §2§lSMP §7§l>>");

        e.setJoinMessage("§a>> §7" + player.getName());
    }

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore()) {
            new JoinMethod().equip(player);
            e.setJoinMessage(null);
            Bukkit.getOnlinePlayers().forEach(player1 -> {
                player1.sendMessage(Prefix.Plugin_Prefix + "§7Willkommen auf dem §2SMP §7Server " + e.getPlayer().getName() + ".");
            });
        }
    }
}