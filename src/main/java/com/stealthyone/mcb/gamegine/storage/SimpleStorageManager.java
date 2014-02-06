package com.stealthyone.mcb.gamegine.storage;

import com.stealthyone.mcb.gamegine.Gamegine;
import com.stealthyone.mcb.gamegine.GamegineConfig;

import java.io.File;

public class SimpleStorageManager implements StorageManager {

    private GamegineConfig gamegineConfig;

    public SimpleStorageManager() {
        gamegineConfig = new GamegineConfig();
    }

    @Override
    public File getDataFolder() {
        return Gamegine.getProvider().getOwner().getDataFolder();
    }

    @Override
    public GamegineConfig getGamegineConfig() {
        return gamegineConfig;
    }

}