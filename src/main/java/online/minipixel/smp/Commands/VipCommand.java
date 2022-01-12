package online.minipixel.smp.Commands;

import online.minipixel.smp.Main;
import online.minipixel.smp.MessageAPI.Prefix;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VipCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(Prefix.System_Prefix + "§cDu bist kein Spieler!");
        }

        Player player = (Player) sender;
        player.openInventory(Main.getVip());
        return false;
    }
}
