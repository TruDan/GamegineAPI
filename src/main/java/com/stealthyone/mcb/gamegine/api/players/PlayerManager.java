package com.stealthyone.mcb.gamegine.api.players;

import com.stealthyone.mcb.gamegine.api.games.instances.GameInstance;
import org.bukkit.entity.Player;

/**
 * Tracks players among different player handlers for easily retrieving a player's current game.
 */
public interface PlayerManager {

    /**
     * Handles a player joining the server.
     *
     * @param player Joining player.
     */
    public void handlePlayerConnect(Player player);

    /**
     * Handles a player disconnecting from the server.
     *
     * @param player Leaving player.
     */
    public void handlePlayerDisconnect(Player player);

    /**
     * Returns the current game for a specified player.
     *
     * @param player Player to retrieve game of.
     * @return Game instance player is in.
     *         Null if player isn't in a game.
     */
    public GameInstance getPlayerGame(Player player);

}