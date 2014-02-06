package com.stealthyone.mcb.gamegine.config;

import com.stealthyone.mcb.gamegine.storage.Storage;
import org.apache.commons.lang.Validate;

public abstract class Config {

    private Storage storage;

    public Config(Storage storage) {
        Validate.notNull(storage, "Storage cannot be null.");
        this.storage = storage;
    }

    /**
     * Returns the storage backend for the configuration data.
     *
     * @return Storage backend.
     */
    public Storage getStorage() {
        return storage;
    }

}