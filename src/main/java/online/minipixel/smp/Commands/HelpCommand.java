package online.minipixel.smp.Commands;

import online.minipixel.smp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            //TODO: message for console (help command)
            sender.sendMessage("");
            return true;
        }

        Player player = (Player) sender;
        player.openInventory(Main.getHelp());

        return false;
    }
}
