package online.minipixel.smp.Listener;

import online.minipixel.smp.Main;
import online.minipixel.smp.Utils.JoinMethod;
import online.minipixel.smp.MessageAPI.Prefix;
import online.minipixel.smp.Scoreboard.DefaultScoreboard;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        new JoinMethod().defaultJoin(player);

        new DefaultScoreboard(player, "§7§l>> §4§lMiniPixel §7§l<<");
        Main.getINSTANCE().getTablistManager().setTablist(player);
        Main.getINSTANCE().getTablistManager().setPlayerTeam(player);
        Main.getINSTANCE().getTablistManager().setAllPlayerTeams();

        e.setJoinMessage("§a>> §7" + player.getName());
    }

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore()) {
            new JoinMethod().firstJoin(player);
            e.setJoinMessage(null);
            Bukkit.getOnlinePlayers().forEach(player1 -> {
                player1.sendMessage(Prefix.Plugin_Prefix + "§7Willkommen auf §4minipixel.online §7" + e.getPlayer().getName() + ".");
            });
        }
    }
}