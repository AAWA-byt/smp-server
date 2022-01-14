package online.minipixel.smp.Commands;

import online.minipixel.smp.MessageAPI.Prefix;
import online.minipixel.smp.WarpSystem.WarpManager;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (args.length == 1) {
            if (WarpManager.getWarp(args[0]) != null) {
                p.teleport(WarpManager.getWarp(args[0]));
                p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 0.2f, 1.4f);
                p.spawnParticle(Particle.DRAGON_BREATH, p.getLocation(), 200);
                p.sendMessage(Prefix.WarpSystem_Prefix + "§7Du wurdest zum Warp §a§l" + args[0] + " §7teleportiert!");
            } else {
                p.sendMessage(Prefix.WarpSystem_Prefix + "§cDiesen Warp gibt es nicht!");
            }


        } else if (args.length == 2) {
            if (!p.hasPermission("warp.manager")) {
                p.sendMessage(Prefix.System_Prefix + "§cDazu hast du keine Berechtigung!");
                p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.2f, 1.4f);
                return false;
            }
            if (p.hasPermission("minipixel.smp.command.warp.add")) {
                if (args[0].equalsIgnoreCase("add")) {
                    if (WarpManager.getWarp(args[1]) == null) {
                        WarpManager.createWarp(args[1], p.getLocation());
                        p.sendMessage(Prefix.WarpSystem_Prefix + "§7Du hast den Warp §a§l" + args[1] + " §7erstellt!");

                    } else {
                        p.sendMessage(Prefix.WarpSystem_Prefix + "§7Diesen Warp gibt es schon!");
                    }
                }
            } if (args[0].equalsIgnoreCase("reload")) {

                WarpManager.reloadConfig();
                p.sendMessage(Prefix.WarpSystem_Prefix + "§aDie Config wurde neu geladen!");

            } else {

            }

        }

        return false;
    }

}