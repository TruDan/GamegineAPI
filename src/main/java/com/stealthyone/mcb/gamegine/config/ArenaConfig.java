package com.stealthyone.mcb.gamegine.config;

import com.stealthyone.mcb.gamegine.arenas.Arena;

public interface ArenaConfig {

    public Arena getOwner();

    public void loadConfig();

    public void saveConfig();

    public boolean isArenaEnabled();

    public void setArenaEnabled(boolean state);

}