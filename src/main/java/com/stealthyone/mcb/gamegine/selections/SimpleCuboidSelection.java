package com.stealthyone.mcb.gamegine.selections;

import org.bukkit.Location;

public class SimpleCuboidSelection implements Selection {

    private Location minPoint;
    private Location maxPoint;

    public SimpleCuboidSelection() {
        minPoint = null;
        maxPoint = null;
    }

    @Override
    public void setMinimumPoint(Location minPoint) {
        this.minPoint = minPoint;
    }

    @Override
    public void setMaximumPoint(Location maxPoint) {
        this.maxPoint = maxPoint;
    }

    @Override
    public void clearSelection() {
        minPoint = null;
        maxPoint = null;
    }

    @Override
    public boolean isValid() {
        return minPoint.getWorld() != null && maxPoint.getWorld() != null && minPoint.getWorld().equals(maxPoint.getWorld());
    }

}