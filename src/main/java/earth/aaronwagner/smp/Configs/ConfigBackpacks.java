package earth.aaronwagner.smp.Configs;

import earth.aaronwagner.smp.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigBackpacks {

    private final File file;
    private final YamlConfiguration config;

    public ConfigBackpacks() {
        File dir = new File(String.valueOf(Main.getINSTANCE().getDataFolder()));

        if (!dir.exists()) {
            dir.mkdirs();
        }

        this.file = new File(dir, "backpacks.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.config = YamlConfiguration.loadConfiguration(file);
    }

    public File getFile() {
        return file;
    }

    public YamlConfiguration getConfig() {
        return config;
    }

    public void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}