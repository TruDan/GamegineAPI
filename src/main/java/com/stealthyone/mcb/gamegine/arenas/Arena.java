package com.stealthyone.mcb.gamegine.arenas;

import com.stealthyone.mcb.gamegine.config.ArenaConfig;

public class Arena {

    private ArenaHandler owner;
    private int id;
    private ArenaUUID uuid;
    private ArenaConfig config;

    public Arena(ArenaHandler owner, int id) {
        this.owner = owner;
        this.id = id;
        this.uuid = new ArenaUUID(this);
    }

    public final ArenaHandler getOwner() {
        return owner;
    }

    public final int getId() {
        return id;
    }

    public final ArenaUUID getUuid() {
        return uuid;
    }

}