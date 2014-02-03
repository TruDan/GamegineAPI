package com.stealthyone.mcb.gamegine.arenas;

import com.stealthyone.mcb.gamegine.games.Game;

public interface ArenaHandler {

    /**
     * Returns the game this handles arenas for.
     *
     * @return Owning game.
     */
    public Game getOwner();

    /**
     * Loads an arena.
     *
     * @param arena Arena to load.
     * @return True if arena successfully loaded.
     *         False if arena isn't owned by the same game or if it's already loaded.
     */
    public boolean loadArena(Arena arena);

    /**
     * Unloads an arena.
     *
     * @param arena Arena to unload.
     * @return True if arena unloaded.
     *         False if arena not unloaded. (Not owned by same game or not loaded)
     */
    public boolean unloadArena(Arena arena);

    /**
     * Creates an arena.
     *
     * @return New arena instance.
     */
    public Arena createArena();

    /**
     * Get an arena by it's UUID.
     *
     * @param arenaUuid ArenaUUID of arena to retrieve.
     * @return Arena matching UUID.
     *         Null if no arena matching given UUID;
     */
    public Arena getArena(ArenaUUID arenaUuid);

}