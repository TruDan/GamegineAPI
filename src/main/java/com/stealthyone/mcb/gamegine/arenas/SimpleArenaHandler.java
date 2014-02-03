package com.stealthyone.mcb.gamegine.arenas;

import com.stealthyone.mcb.gamegine.games.Game;

import java.util.HashMap;
import java.util.Map;

public class SimpleArenaHandler implements ArenaHandler {

    private Game owner;

    private Map<ArenaUUID, Arena> loadedArenas = new HashMap<>();

    public SimpleArenaHandler(Game owner) {
        this.owner = owner;
    }

    @Override
    public Game getOwner() {
        return owner;
    }

    @Override
    public boolean loadArena(Arena arena) {
        return false;
    }

    @Override
    public boolean unloadArena(Arena arena) {
        return false;
    }

    @Override
    public Arena createArena() {
        return null;
    }

    @Override
    public Arena getArena(ArenaUUID arenaUuid) {
        return loadedArenas.get(arenaUuid);
    }

}