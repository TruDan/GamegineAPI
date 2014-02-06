package com.stealthyone.mcb.gamegine.storage;

import java.util.List;

/**
 * Base for storage backends.
 */
public interface Storage {

    /**
     * Initiate the storage backend.
     */
    public void init();

    /**
     * Save changes to the disk.
     */
    public void save();

    /**
     * Load changes from the disk.
     */
    public void load();

    /**
     * Set a value in the storage backend.
     *
     * @param key Identifier of the value.
     * @param value The value to set for the key.
     */
    public void setValue(String key, Object value);

    /**
     * Returns the value associated with a specified key.
     *
     * @param key Key to retrieve value of.
     * @return Object representing the value.
     *         Null if nothing is set at the key.
     */
    public Object get(String key);

    /**
     * Returns a string value associated with a specified key.
     *
     * @param key Key to retrieve string from.
     * @return String value.
     *         Null if nothing is set at the key.
     */
    public String getString(String key);

    /**
     * Returns a string value associated with a specified key.
     *
     * @param key Key to retrieve string from.
     * @return String value.
     *         Null if nothing is set at the key.
     */
    public boolean getBoolean(String key);

    /**
     * Returns an integer value associated with a specified key.
     *
     * @param key Key to retrieve integer from.
     * @return Integer value.
     *         Null if nothing is set at the key.
     */
    public int getInt(String key);

    /**
     * Returns a double value associated with a specified key.
     *
     * @param key Key to retrieve double from.
     * @return Double value.
     *         Null if nothing is set at the key.
     */
    public double getDouble(String key);

    /**
     * Returns a long value associated with a specified key.
     *
     * @param key Key to retrieve long from.
     * @return Long value.
     *         Null if nothing is set at the key.
     */
    public long getLong(String key);

    /**
     * Returns a list associated with a specified key.
     *
     * @param key Key to retrieve list from.
     * @return List object.
     *         Null if nothing is set at the key.
     */
    public List<?> getList(String key);
    /**
     * Returns a string list associated with a specified key.
     *
     * @param key Key to retrieve string list from.
     * @return String list object.
     *         Null if nothing is set at the key.
     */
    public List<String> getStringList(String key);

}