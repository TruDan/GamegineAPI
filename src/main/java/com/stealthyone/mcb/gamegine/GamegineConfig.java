package com.stealthyone.mcb.gamegine;

import com.stealthyone.mcb.gamegine.config.Config;
import com.stealthyone.mcb.gamegine.storage.StorageYaml;

import java.io.File;

public class GamegineConfig extends Config {

    public GamegineConfig() {
        super(new StorageYaml(Gamegine.getProvider().getStorageManager().getDataFolder() + File.separator + "GamegineConfig.yml"));
    }

    public boolean isDebug() {
        return getStorage().getBoolean("Debug");
    }

}