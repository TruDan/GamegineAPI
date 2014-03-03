package com.stealthyone.mcb.gamegine.games;

import com.stealthyone.mcb.gamegine.games.instances.GameInstance;
import com.stealthyone.mcb.stbukkitlib.lib.utils.RandomUtils;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class Game {

    private JavaPlugin owner;
    private String name;
    private GameUUID uuid;

    private File dataDir;
    private GameConfig config;

    private Map<String, GameInstance> gameInstances = new HashMap<>();

    public Game(JavaPlugin owner, String name, GameConfig config) {
        this(owner, name, config, owner.getDataFolder() + File.separator + "GamegineData" + File.separator + name);
    }

    public Game(JavaPlugin owner, String name, GameConfig config, String dataDirPath) {
        this.owner = owner;
        this.name = name;
        this.uuid = new GameUUID(this);
        this.config = config;
        dataDir = new File(dataDirPath);
        dataDir.mkdir();
    }

    public final JavaPlugin getOwner() {
        return owner;
    }

    public final GameConfig getConfig() {
        return config;
    }

    public final File getDataDir() {
        return dataDir;
    }

    public final String getName() {
        return name;
    }

    public final GameUUID getUniqueId() {
        return uuid;
    }

    public final String getNextGameInstanceId() {
        String id = null;
        while (id == null || gameInstances.containsKey(id)) {
            id = RandomUtils.getRandomString(8, true);
        }
        return id;
    }

}