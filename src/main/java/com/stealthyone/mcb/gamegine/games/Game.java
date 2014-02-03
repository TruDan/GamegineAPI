package com.stealthyone.mcb.gamegine.games;

import com.stealthyone.mcb.gamegine.config.GameConfig;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public abstract class Game {

    private JavaPlugin owner;
    private String name;
    private GameUUID uuid;

    private File dataDir;
    private GameConfig config;

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

    public final GameUUID getUuid() {
        return uuid;
    }

}