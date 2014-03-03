package com.stealthyone.mcb.gamegine;

import com.stealthyone.mcb.gamegine.games.GameManager;
import com.stealthyone.mcb.gamegine.players.PlayerManager;
import com.stealthyone.mcb.gamegine.signs.SignManager;
import com.stealthyone.mcb.gamegine.storage.StorageManager;
import org.bukkit.plugin.java.JavaPlugin;

public interface GamegineProvider {

    /**
     * Enable the provider.
     */
    public void enable();

    /**
     * Disable the provider.
     */
    public void disable();

    /**
     * Returns the plugin that owns the provider.
     *
     * @return JavaPlugin owning the provider.
     */
    public JavaPlugin getOwner();
    
    /**
     * Returns the name of the provider.
     *
     * @return The provider's name.
     */
    public String getName();

    /**
     * Returns the version of the provider.
     *
     * @return The provider's version.
     */
    public String getVersion();

    /**
     * Returns the version of the Gamegine API.
     *
     * @return The Gamegine API's version.
     */
    public String getApiVersion();

    /**
     * Returns the storage manager associated with the provider.
     *
     * @return StorageManager defined for the provider.
     */
    public StorageManager getStorageManager();

    /**
     * Returns the game manager associated with the provider.
     *
     * @return GameManager defined for the provider
     */
    public GameManager getGameManager();

    /**
     * Returns the player manager associated with the provider.
     *
     * @return PlayerManager defined for the provider.
     */
    public PlayerManager getPlayerManager();

    /**
     * Returns the sign manager associated with the provider.
     *
     * @return SignManager defined for the provider.
     */
    public SignManager getSignManager();

}