package com.stealthyone.mcb.gamegine.games;

public interface GameManager {

    /**
     * Registers a game.
     *
     * @param game Game object to register.
     * @return True if game was successfully registered.
     *         False if game is already registered.
     */
    public boolean registerGame(Game game);

    /**
     * Unregisters a game.
     *
     * @param game Game object to unregister.
     * @return True if game was successfully unregistered.
     *         False if game is not registered.
     */
    public boolean unregisterGame(Game game);

    /**
     * Checks to see if a game is already registered.
     *
     * @param game Game to check registration of.
     * @return True if game is registered.
     *         False if game isn't registered.
     */
    public boolean isGameRegistered(Game game);

    /**
     * Checks to see if a game is already registered.
     *
     * @param gameUuid GameUUID of game to check registration of.
     * @return True if game is registered.
     *         False if game isn't registered.
     */
    public boolean isGameRegistered(GameUUID gameUuid);

    /**
     * Returns a game with a given GameUUID.
     *
     * @param gameUuid GameUUID of game to retrieve.
     * @return Game object if it exists.
     *         Null if game doesn't exist or isn't registered.
     */
    public Game getGame(GameUUID gameUuid);

}