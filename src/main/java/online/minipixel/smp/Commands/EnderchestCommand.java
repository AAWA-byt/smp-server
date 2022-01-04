package online.minipixel.smp.Commands;

import online.minipixel.smp.MessageAPI.Prefix;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public class EnderchestCommand  implements CommandExecutor {

    public static ArrayList<UUID> enderchest = new ArrayList();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {

            sender.sendMessage(Prefix.Plugin_Prefix + "Du bist kein Spieler");
            return true;

        }

        Player player = (Player) sender;
        if (args.length == 0) {
            player.openInventory(player.getEnderChest());

        }

        return false;
    }
}
