package com.stealthyone.mcb.gamegine.api.logging;

public interface GamegineLogger {

    /**
     * Logs a debug message.
     *
     * @param message
     */
    public void debug(String message);

    /**
     * Logs an info message.
     *
     * @param message Message to log.
     */
    public void info(String message);

    /**
     * Logs a warning message.
     *
     * @param message Message to log.
     */
    public void warning(String message);

    /**
     * Logs a severe message.
     *
     * @param message Message to log.
     */
    public void severe(String message);

}