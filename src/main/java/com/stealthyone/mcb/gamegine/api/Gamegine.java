package com.stealthyone.mcb.gamegine.api;

import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;

import java.util.logging.Level;

/**
 * Represents the Gamegine API and provides simple access to various parts of it.
 */
public final class Gamegine {

    private Gamegine() { }

    private static GamegineProvider provider;

    /**
     * Returns the current version of the API.
     *
     * @return Gamegine API version.
     */
    public static String getVersion() {
        //TODO: Properly get version from compiled JAR or replace on compile via Maven
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

}