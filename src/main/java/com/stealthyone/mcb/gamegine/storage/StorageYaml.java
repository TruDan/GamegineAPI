package com.stealthyone.mcb.gamegine.storage;

import org.apache.commons.lang.Validate;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StorageYaml implements Storage {

    private File file;
    private FileConfiguration config;

    public StorageYaml(String filePath) {
        Validate.notNull(filePath, "File path cannot be null.");
        this.file = new File(filePath);
    }

    public StorageYaml(File file) {
        Validate.notNull(file, "File cannot be null.");
        this.file = file;
    }
    @Override
    public void init() {
        load();
    }

    @Override
    public void save() {
        if (file == null || config == null) {
            load();
        } else {
            try {
                config.save(file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void load() {
        if (!file.exists()) {
            try {
                file.createNewFile();
                save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    @Override
    public void setValue(String key, Object value) {
        config.set(key, value);
    }

    @Override
    public Object get(String key) {
        return config.get(key);
    }

    @Override
    public String getString(String key) {
        return config.getString(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return config.getBoolean(key);
    }

    @Override
    public int getInt(String key) {
        return config.getInt(key);
    }

    @Override
    public double getDouble(String key) {
        return config.getDouble(key);
    }

    @Override
    public long getLong(String key) {
        return config.getLong(key);
    }

    @Override
    public List<?> getList(String key) {
        return config.getList(key);
    }

    @Override
    public List<String> getStringList(String key) {
        return config.getStringList(key);
    }

}