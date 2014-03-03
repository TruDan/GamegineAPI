package com.stealthyone.mcb.gamegine.players;

import com.stealthyone.mcb.gamegine.games.Game;
import com.stealthyone.mcb.gamegine.games.instances.GameInstance;
import org.bukkit.entity.Player;

/**
 * Master player handler for the Gamegine provider.
 */
public interface PlayerManager {

    /**
     * Returns the current game for a specified player.
     *
     * @param player Player to retrieve game of.
     * @return Game player is in.
     *         Null if player isn't in a game.
     */
    public Game getPlayerGame(Player player);

    /**
     * Set the current game instance of a player.
     *
     * @param player Player to set game instance of.
     * @param gameInstance Game instance to set.
     */
    public void setPlayerGame(Player player, GameInstance gameInstance);

    /**
     * Handles a player connecting to the server.
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

}