package online.minipixel.smp.Backpack;

import online.minipixel.smp.Main;

import java.io.IOException;
import java.util.*;

public class BackpackManager {

    private final Map<UUID, Backpack> map;

    public BackpackManager() {
        map = new HashMap<>();

        load();
    }

    public Backpack getBackpack(UUID uuid) {
        if(map.containsKey(uuid)) {
            return map.get(uuid);
        }

        Backpack backpack = new Backpack(uuid);
        map.put(uuid, backpack);
        return backpack;
    }


    public void setBackpack(UUID uuid, Backpack backpack) {
        map.put(uuid, backpack);
    }

    private void load() {
        ConfigBackpacks configBackpacks = Main.getINSTANCE().getConfiguration();

        List<String> uuids = configBackpacks.getConfig().getStringList("backpacks");

        uuids.forEach(s -> {
            UUID uuid = UUID.fromString(s);
            String base64 = configBackpacks.getConfig().getString("backpack." + s);

            try {
                map.put(uuid, new Backpack(uuid, base64));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void save() {
        ConfigBackpacks configBackpacks = Main.getINSTANCE().getConfiguration();

        List<String> uuids = new ArrayList<>();

        for (UUID uuid : map.keySet()) {
            uuids.add(uuid.toString());
        }

        configBackpacks.getConfig().set("backpacks", uuids);
        map.forEach((uuid, backpack) -> configBackpacks.getConfig().set("backpack." + uuid.toString(), backpack.toBase64()));
    }
}
