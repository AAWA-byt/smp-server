package online.minipixel.smp.Commands;

import online.minipixel.smp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeamCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            //TODO: message for console (team command)
            sender.sendMessage("");
        }

        Player player = (Player) sender;
        player.openInventory(Main.getTeam());

            return false;
        }
    }