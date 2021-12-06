package online.minipixel.smp.Scoreboard;

import online.minipixel.smp.Main;
import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class DefaultScoreboard extends ScoreboardBuilder {

    private int socialId;

    public DefaultScoreboard(Player player, String displayName) {
        super(player, "§7§l<< §4§lMiniPixel §7§l>>");
       socialId = 0;
        run();
    }


    @Override
    public void createScoreboard() {

        setScore("§cminipixel.online", 0);
        setScore("§d", 1);
        setScore("§7Tode: §c" + player.getStatistic(Statistic.DEATHS), 2);
        setScore("§7Kills: §c" + player.getStatistic(Statistic.PLAYER_KILLS), 3);
        setScore("§7Kills (Mobs): §c" + player.getStatistic(Statistic.MOB_KILLS), 4);
        setScore("§3", 5);
        setScore("§7Server: §aSMP-1", 6);
        setScore("§7Online: §c" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§c" + Bukkit.getServer().getMaxPlayers(), 7);
        setScore("§a", 8);
        if (player.hasPermission("minipixel.admin")) {
            setScore("§7Rang: §4Administrator", 9);

        } else if (player.hasPermission("minipixel.mod")){
            setScore("§7Rang: §bModerator", 9);

        } else if (player.hasPermission("minipixel.dev")) {
            setScore("§7Rang: §aDeveloper", 9);

        } else if (player.hasPermission("minipixel.sup")){
            setScore("§7Rang: §9Supporter", 9);

        } else if (player.hasPermission("minipixel.builder")) {
            setScore("§7Rang: §eBuilder", 9);

        } else if (player.hasPermission("minipixel.vip+")) {
            setScore("§7Rang: §dVIP§6+", 9);

        } else if (player.hasPermission("minipixel.vip")){
            setScore("§7Rang: §dVIP", 9);

        } else {
            setScore("§7Rang: §3Spieler", 9);

        }
        setScore("§1", 10);
    }

    @Override
    public void update() {
        switch (socialId) {
            case 0:

                setScore("§7Tode: §c" + player.getStatistic(Statistic.DEATHS), 2);
                setScore("§7Kills: §c" + player.getStatistic(Statistic.PLAYER_KILLS), 3);
                setScore("§7Kills (Mobs): §c" + player.getStatistic(Statistic.MOB_KILLS), 4);
                setScore("§7Online: §c" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§c" + Bukkit.getServer().getMaxPlayers(), 7);

                break;

            case 1:

                setScore("§7Tode: §c" + player.getStatistic(Statistic.DEATHS), 2);
                setScore("§7Kills: §c" + player.getStatistic(Statistic.PLAYER_KILLS), 3);
                setScore("§7Kills (Mobs): §c" + player.getStatistic(Statistic.MOB_KILLS), 4);
                setScore("§7Online: §c" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§c" + Bukkit.getServer().getMaxPlayers(), 7);

                break;

            case 2:
                setScore("§7Tode: §c" + player.getStatistic(Statistic.DEATHS), 2);
                setScore("§7Kills: §c" + player.getStatistic(Statistic.PLAYER_KILLS), 3);
                setScore("§7Kills (Mobs): §c" + player.getStatistic(Statistic.MOB_KILLS), 4);
                setScore("§7Online: §c" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§c" + Bukkit.getServer().getMaxPlayers(), 7);

                if (player.hasPermission("minipixel.admin")) {
                    setScore("§7Rang: §4Administrator", 9);

                } else if (player.hasPermission("minipixel.mod")){
                    setScore("§7Rang: §bModerator", 9);

                } else if (player.hasPermission("minipixel.dev")) {
                    setScore("§7Rang: §aDeveloper", 9);

                } else if (player.hasPermission("minipixel.sup")){
                    setScore("§7Rang: §9Supporter", 9);

                } else if (player.hasPermission("minipixel.builder")) {
                    setScore("§7Rang: §eBuilder", 9);

                } else if (player.hasPermission("minipixel.vip+")) {
                    setScore("§7Rang: §dVIP§6+", 9);

                } else if (player.hasPermission("minipixel.vip")){
                    setScore("§7Rang: §dVIP", 9);

                } else {
                    setScore("§7Rang: §3Spieler", 9);

                }

                break;
        }

        socialId++;

        if (socialId >= 3) {
            socialId = 0;
        }
    }
        private void run () {
            new BukkitRunnable() {
                @Override
                public void run() {
                    update();
                }
            }.runTaskTimer(Main.getINSTANCE(), 20, 20);
        }
    }





