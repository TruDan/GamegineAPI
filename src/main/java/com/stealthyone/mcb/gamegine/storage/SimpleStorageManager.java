package com.stealthyone.mcb.gamegine.storage;

import com.stealthyone.mcb.gamegine.Gamegine;

import java.io.File;

public class SimpleStorageManager implements StorageManager {

    @Override
    public File getDataFolder() {
        return Gamegine.getProvider().getOwner().getDataFolder();
    }

}