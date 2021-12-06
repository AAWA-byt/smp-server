package online.minipixel.smp.Listener;

import online.minipixel.smp.MessageAPI.JoinMethod;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        new JoinMethod().defaultJoin(player);
    }

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        new JoinMethod().firstJoin(player);
    }
}
