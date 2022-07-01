package earth.aaronwagner.smp.Commands;

import earth.aaronwagner.smp.Backpack.Backpack;
import earth.aaronwagner.smp.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BackpackCommand  implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;

        Backpack backpack = Main.getINSTANCE().getBackpackManager().getBackpack(player.getUniqueId());

        player.openInventory(backpack.getInventory());
        return true;
    }

}
