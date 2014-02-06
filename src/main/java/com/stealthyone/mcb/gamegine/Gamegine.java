package com.stealthyone.mcb.gamegine;

import com.stealthyone.mcb.gamegine.games.Game;
import com.stealthyone.mcb.gamegine.games.GameManager;
import com.stealthyone.mcb.gamegine.games.GameUUID;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;

import java.util.logging.Level;

public final class Gamegine {

    private Gamegine() { }

    private static GamegineProvider provider;

    /**
     * Returns the current version of the API.
     *
     * @return Gamegine API version.
     */
    public static String getVersion() {
        return "1.0-SNAPSHOT";
    }

    /**
     * Returns the Gamegine provider
     *
     * @return The Gamegine provider that implements 'GamegineProvider'
     */
    public static GamegineProvider getProvider() {
        return provider;
    }

    /**
     * Sets the Gamegine provider
     *
     * @param provider The Gamegine provider that implements 'GamegineProvider'
     */
    public static void setProvider(GamegineProvider provider) {
        Validate.notNull(provider, "Provider cannot be null.");
        if (Gamegine.provider != null) {
            throw new IllegalStateException("Gamegine provider has already been defined.");
        }
        Gamegine.provider = provider;
        Bukkit.getLogger().log(Level.INFO, "This server is running " + Gamegine.provider.getName() + " version " + Gamegine.provider.getVersion() + " (API version " + Gamegine.provider.getApiVersion() + ")");
    }

    /**
     * Returns the game manager.
     *
     * @return Game manager from provider.
     *         Null if provider isn't set.
     */
    public static GameManager getGameManager() {
        return Gamegine.provider.getGameManager();
    }

    public static Game getGame(GameUUID gameUuid) {
        Validate.notNull(gameUuid, "Game UUID cannot be null.");
        return Gamegine.provider == null ? null : Gamegine.provider.getGameManager().getGame(gameUuid);
    }

}