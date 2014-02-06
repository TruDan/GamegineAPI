package com.stealthyone.mcb.gamegine.storage;

import java.io.File;

public interface StorageManager {

    /**
     * Returns the base directory for storing data.
     *
     * @return The base directory.
     */
    public File getDataFolder();

}