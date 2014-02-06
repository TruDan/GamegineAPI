package com.stealthyone.mcb.gamegine.arenas;

import com.stealthyone.mcb.gamegine.config.Config;
import com.stealthyone.mcb.gamegine.storage.Storage;
import com.stealthyone.mcb.gamegine.storage.StorageYaml;

public class ArenaConfig extends Config {

    public ArenaConfig(Arena arena) {
        super(new StorageYaml(arena.getOwner().get));
    }

}