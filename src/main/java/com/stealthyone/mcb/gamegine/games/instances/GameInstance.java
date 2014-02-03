package com.stealthyone.mcb.gamegine.games.instances;

import com.stealthyone.mcb.gamegine.games.Game;

public abstract class GameInstance {

    private Game owner;
    private PlayerHandler playerHandler;

    public GameInstance(Game owner, PlayerHandler playerHandler) {
        this.owner = owner;
    }

    public PlayerHandler getPlayerHandler() {
        return playerHandler;
    }

}