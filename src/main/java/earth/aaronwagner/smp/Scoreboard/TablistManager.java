/*
https://github.com/DerBanko/TutorialReloaded
 */

package earth.aaronwagner.smp.Scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistManager {
    public void setTablist(Player player) {
        player.setPlayerListHeaderFooter("", "");
    }

    public void setAllPlayerTeams() {
        Bukkit.getOnlinePlayers().forEach(player -> {
            setPlayerTeam(player);
        });
    }

    public void setPlayerTeam(Player player) {

        Scoreboard scoreboard = player.getScoreboard();

        //Default players
        Team pdefault = scoreboard.getTeam("009default");

        if (pdefault == null) {
            pdefault = scoreboard.registerNewTeam("009default");
        }

        //VIP players
        Team pvip = scoreboard.getTeam("008vip");

        if (pvip == null) {
            pvip = scoreboard.registerNewTeam("008vip");
        }

        //VIP+ players
        Team pvipplus = scoreboard.getTeam("007vip+");

        if (pvipplus == null) {
            pvipplus = scoreboard.registerNewTeam("007vip+");
        }

        //Builder players
        Team pbuilder = scoreboard.getTeam("006builder");

        if (pbuilder == null) {
            pbuilder = scoreboard.registerNewTeam("006builder");
        }

        //Supporter players
        Team psup = scoreboard.getTeam("005sup");

        if (psup == null) {
            psup = scoreboard.registerNewTeam("005sup");
        }

        //Developer players
        Team pdev = scoreboard.getTeam("003dev");

        if (pdev == null) {
            pdev = scoreboard.registerNewTeam("003dev");
        }

        //Moderator players
        Team pmod = scoreboard.getTeam("002mod");

        if (pmod == null) {
            pmod = scoreboard.registerNewTeam("002mod");
        }

        //Admin players
        Team padmin = scoreboard.getTeam("001admin");

        if (padmin == null) {
            padmin = scoreboard.registerNewTeam("001admin");
        }

        pdefault.setPrefix("");
        pdefault.setColor(ChatColor.GRAY);

        pvip.setPrefix("§dVIP §8| ");
        pvip.setColor(ChatColor.GRAY);

        pvipplus.setPrefix("§dVIP§6+ §8| ");
        pvipplus.setColor(ChatColor.GRAY);

        pbuilder.setPrefix("§eBuilder §8| ");
        pbuilder.setColor(ChatColor.GRAY);

        psup.setPrefix("§9Sup §8| ");
        psup.setColor(ChatColor.GRAY);

        pdev.setPrefix("§aDev §8| ");
        pdev.setColor(ChatColor.GRAY);

        pmod.setPrefix(ChatColor.AQUA + "Mod §8| ");
        pmod.setColor(ChatColor.GRAY);

        padmin.setPrefix("§4Admin §8| ");
        padmin.setColor(ChatColor.GRAY);


        for (Player target : Bukkit.getOnlinePlayers()) {
            if (target.hasPermission("smp.admin")) {
                padmin.addEntry(target.getName());
                continue;

            } else if (target.hasPermission("smp.mod")) {
                pmod.addEntry(target.getName());
                continue;

            } else if (target.hasPermission("smp.dev")) {
                pdev.addEntry(target.getName());
                continue;

            } else if (target.hasPermission("smp.sup")) {
                psup.addEntry(target.getName());
                continue;

            } else if (target.hasPermission("smp.builder")) {
                pbuilder.addEntry(target.getName());
                continue;

            } else if (target.hasPermission("smp.vip+")) {
                pvipplus.addEntry(target.getName());
                continue;

            } else if (target.hasPermission("smp.vip")) {
                pvip.addEntry(target.getName());
                continue;

            }

            pdefault.addEntry(target.getName());


        }
    }
}




