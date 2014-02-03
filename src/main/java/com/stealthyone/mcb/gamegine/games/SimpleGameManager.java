package com.stealthyone.mcb.gamegine.games;

import org.apache.commons.lang.Validate;

import java.util.HashMap;
import java.util.Map;

public class SimpleGameManager implements GameManager {

    private Map<GameUUID, Game> registeredGames = new HashMap<>();

    @Override
    public boolean registerGame(Game game) {
        Validate.notNull(game, "Game cannot be null.");
        GameUUID uuid = game.getUuid();
        if (!registeredGames.containsKey(uuid)) {
            registeredGames.put(uuid, game);
            return true;
        }
        return false;
    }

    @Override
    public boolean unregisterGame(Game game) {
        Validate.notNull(game, "Game cannot be null.");
        GameUUID uuid = game.getUuid();
        if (registeredGames.containsKey(uuid)) {
            registeredGames.remove(uuid);
            return true;
        }
        return false;
    }

    @Override
    public boolean isGameRegistered(Game game) {
        Validate.notNull(game, "Game cannot be null.");
        return isGameRegistered(game.getUuid());
    }

    @Override
    public boolean isGameRegistered(GameUUID gameUuid) {
        Validate.notNull(gameUuid, "GameUUID cannot be null.");
        return registeredGames.containsKey(gameUuid);
    }

    @Override
    public Game getGame(GameUUID gameUuid) {
        return registeredGames.get(gameUuid);
    }

}