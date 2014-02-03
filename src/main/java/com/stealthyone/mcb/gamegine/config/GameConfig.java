package com.stealthyone.mcb.gamegine.config;

import com.stealthyone.mcb.gamegine.games.Game;

public interface GameConfig {

    /**
     * Returns the game that this configuration represents.
     *
     * @return Game that owns this configuration.
     */
    public Game getOwner();

    /**
     * Loads the game's configuration.
     */
    public void loadConfig();

    /**
     * Saves the game's configuration.
     */
    public void saveConfig();

    /**
     * Returns whether or not the game is enabled.
     *
     * @return True if game is enabled.
     *         False if game isn't enabled.
     */
    public boolean isGameEnabled();

    /**
     * Sets the game to an enabled or disabled state.
     *
     * @param state State to set game to.
     */
    public void setGameEnabled(boolean state);

}