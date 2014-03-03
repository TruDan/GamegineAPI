package com.stealthyone.mcb.gamegine.games.instances;

import com.stealthyone.mcb.gamegine.games.Game;
import com.stealthyone.mcb.gamegine.games.players.PlayerHandler;

/**
 * Represents a running instance of a game.
 */
public abstract class GameInstance {

    private String id;
    private GameInstanceUUID uuid;

    private Game owner;
    private PlayerHandler playerHandler;

    /**
     * Creates a game instance.
     *
     * @param owner Game that this instance is for.
     * @param playerHandler The player handler for this instance.
     */
    public GameInstance(Game owner, PlayerHandler playerHandler) {
        this.owner = owner;
        this.playerHandler = playerHandler;
    }

    public String getId() {
        if (id == null) {
            owner.getNextGameInstanceId();
        }
        return id;
    }

    public GameInstanceUUID getUniqueId() {
        return uuid;
    }

    public Game getOwner() {
        return owner;
    }

    public PlayerHandler getPlayerHandler() {
        return playerHandler;
    }

    /**
     * Handles the game logic. One game tick is equal to two Minecraft ticks.
     */
    public abstract void gameTick();

}