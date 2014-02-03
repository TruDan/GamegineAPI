package com.stealthyone.mcb.gamegine.signs;

import org.bukkit.Location;

import java.util.HashMap;
import java.util.Map;

public class SimpleSignManager implements SignManager {

    private Map<SignUUID, SignType> registeredSignTypes = new HashMap<>();
    private Map<Location, GameSign> loadedSigns = new HashMap<>();

    @Override
    public boolean registerSignType(SignType type) {
        SignUUID uuid = type.getUuid();
        if (!registeredSignTypes.containsKey(uuid)) {
            registeredSignTypes.put(uuid, type);
            return true;
        }
        return false;
    }

    @Override
    public boolean unregisterSignType(SignType type) {
        SignUUID uuid = type.getUuid();
        if (registeredSignTypes.containsKey(uuid)) {
            registeredSignTypes.remove(uuid);
            return true;
        }
        return false;
    }

    @Override
    public GameSign getSign(Location location) {
        return loadedSigns.get(location);
    }

}