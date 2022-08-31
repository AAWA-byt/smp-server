package earth.aaronwagner.smp.Listener;

import earth.aaronwagner.smp.MessageAPI.Prefix;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player player = e.getPlayer();

        e.setDeathMessage(Prefix.Plugin_Prefix + "§f" + e.getDeathMessage());
        player.sendMessage(Prefix.Plugin_Prefix + "§7Du bist bei §a" + player.getLocation().getBlockX() + " " + player.getLocation().getBlockY() + " " +
                player.getLocation().getBlockZ() + " §7gestorben.");

        ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();
        skullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(player.getUniqueId()));
        skullMeta.setDisplayName("§a" + player.getName());
        itemStack.setItemMeta(skullMeta);



        if (e.getEntity().getKiller() instanceof Player) {
            Player player_1 = e.getEntity().getKiller();
            player_1.getInventory().addItem(itemStack);

            if (!player_1.getInventory().isEmpty()) {
                player_1.getLocation().getBlock().getDrops().add(itemStack);
            }

        }
    }
}
