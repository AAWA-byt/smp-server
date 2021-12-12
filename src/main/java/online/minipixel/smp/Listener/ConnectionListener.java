package online.minipixel.smp.Listener;

import online.minipixel.smp.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;


public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Main.getTeleporter().addItem(getItem(e.getPlayer()));



    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Main.getTeleporter().clear();
        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            if (onlinePlayer != e.getPlayer()){
                Main.getTeleporter().addItem(getItem(onlinePlayer));
            }
        }

    }

    public ItemStack getItem(Player player){
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