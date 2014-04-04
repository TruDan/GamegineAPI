package com.stealthyone.mcb.gamegine.api.selections;

import org.bukkit.Location;

/**
 * Base interface representing a selection for an arena.
 */
public interface Selection {

    /**
     * Sets the minimum point for the selection.
     *
     * @param minPoint Minimum point to set.
     */
    public void setMinimumPoint(Location minPoint);

    /**
     * Sets the maxmium point for the selection.
     *
     * @param maxPoint Maxmium point to set.
     */
    public void setMaximumPoint(Location maxPoint);

    /**
     * Clears the selection.
     */
    public void clearSelection();

    /**
     * Checks to see if the selection is valid.
     *
     * @return True if selection is valid.
     *         False if selection is not valid.
     */
    public boolean isValid();

}