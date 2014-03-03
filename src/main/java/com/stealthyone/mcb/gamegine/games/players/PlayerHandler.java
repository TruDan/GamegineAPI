package com.stealthyone.mcb.gamegine.games.players;

import org.bukkit.entity.Player;

/**
 * Handles players for a certain game instance.
 */
public interface PlayerHandler {

    /**
     * Adds a player to the game instance.
     */
    public void addPlayer();

    /**
     * Removes a player from the game instance.
     */
    public void removePlayer();

    /**
     * Handles a player disconnecting from the server.
     *
     * @param player Player that disconnected.
     */
    public void handlePlayerDisconnect(Player player);

    /**
     * Handles a player that quit from the game.
     *
     * @param player Player that quit the game.
     */
    public void handlePlayerQuit(Player player);

}