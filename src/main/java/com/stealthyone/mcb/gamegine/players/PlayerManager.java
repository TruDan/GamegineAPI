package com.stealthyone.mcb.gamegine.players;

import com.stealthyone.mcb.gamegine.games.Game;
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
     * Handles a player joining the server.
     *
     * @param player Joining player.
     */
    public void handlePlayerJoin(Player player);

    /**
     * Handles a player disconnecting from the server.
     *
     * @param player Leaving player.
     */
    public void handlePlayerQuit(Player player);

}