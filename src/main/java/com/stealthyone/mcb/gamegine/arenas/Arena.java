package com.stealthyone.mcb.gamegine.arenas;

public class Arena {

    private ArenaHandler owner;
    private int rawId;
    private ArenaUUID uuid;
    private ArenaConfig config;

    public Arena(ArenaHandler owner, int rawId) {
        this.owner = owner;
        this.rawId = rawId;
        this.uuid = new ArenaUUID(this);
    }

    public final ArenaHandler getOwner() {
        return owner;
    }

    public final int getRawId() {
        return rawId;
    }

    public final ArenaUUID getUniqueId() {
        return uuid;
    }

}