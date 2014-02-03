package com.stealthyone.mcb.gamegine.arenas;

public class ArenaUUID {

    private String arenaUuid;

    public ArenaUUID(Arena arena) {
        arenaUuid = arena.getOwner().getUuid().toString() + "@" + arena.getId();
    }

    @Override
    public String toString() {
        return arenaUuid;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ArenaUUID && (obj == this || ((ArenaUUID) obj).arenaUuid.equals(this.arenaUuid));
    }

}