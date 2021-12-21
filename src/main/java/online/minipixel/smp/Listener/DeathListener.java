package online.minipixel.smp.Listener;

import online.minipixel.smp.MessageAPI.Prefix;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player player = e.getPlayer();

        player.sendMessage(Prefix.Plugin_Prefix + "§7Du bist bei §a" + player.getLocation().getBlockX() + " " + player.getLocation().getBlockY() + " " +
                player.getLocation().getBlockZ() + " §7gestorben.");
    }
}
