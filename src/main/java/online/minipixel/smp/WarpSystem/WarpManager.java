package online.minipixel.smp.WarpSystem;

import online.minipixel.smp.Main;
import org.bukkit.Location;

public class WarpManager {

        public static Location getWarp(String name) {
        return Main.getWarps().getConfiguration().getLocation(name);

        }

        public static void createWarp(String name, Location location) {
                Main.getWarps().set(name, location);
                Main.getWarps().save();
        }

        public static void deleteWarp(String name) {
                Main.getWarps().isClear(true);
                Main.getWarps().save();
        }

        public static void reloadConfig() {
        Main.getWarps().reload();

        }
}
