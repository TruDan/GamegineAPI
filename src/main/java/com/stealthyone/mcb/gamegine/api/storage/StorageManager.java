package com.stealthyone.mcb.gamegine.api.storage;

import com.stealthyone.mcb.gamegine.api.GamegineConfig;

import java.io.File;

public interface StorageManager {

    /**
     * Returns the base directory for storing data.
     *
     * @return The base directory.
     */
    public File getDataFolder();

    /**
     * Returns the configuration file for Gamegine.
     *
     * @return The configuration file for Gamegine.
     */
    public GamegineConfig getGamegineConfig();

}