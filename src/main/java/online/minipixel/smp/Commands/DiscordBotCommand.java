package online.minipixel.smp.Commands;

import online.minipixel.smp.DiscordBot.Builder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import javax.security.auth.login.LoginException;


public class DiscordBotCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        try {
            new Builder().create();
        } catch (LoginException e) {
            e.printStackTrace();
        }
        return false;
    }
}
