package online.minipixel.smp.Listener;

import online.minipixel.smp.Main;
import online.minipixel.smp.MessageAPI.JoinMethod;
import online.minipixel.smp.Scoreboard.DefaultScoreboard;
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
    }

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        new JoinMethod().firstJoin(player);
    }
}
