package com.stealthyone.mcb.gamegine.signs;

import org.bukkit.Location;

public interface SignManager {

    /**
     * Registers a sign type.
     *
     * @param type Sign type to register.
     * @return True if type registered successfully.
     *         False if type already registered.
     */
    public boolean registerSignType(SignType type);

    /**
     * Unregisters a sign type.
     *
     * @param type Sign type to unregister.
     * @return True if type unregistered successfully.
     *         False if type not registered.
     */
    public boolean unregisterSignType(SignType type);

    /**
     * Returns a sign at a given location.
     *
     * @param location Location of sign.
     * @return GameSign if there is a registered game sign.
     *         Null if no registered game sign found.
     */
    public GameSign getSign(Location location);

}