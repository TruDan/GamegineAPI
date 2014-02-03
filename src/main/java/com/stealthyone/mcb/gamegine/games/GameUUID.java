package com.stealthyone.mcb.gamegine.games;

public class GameUUID {

    private String gameUuid;

    public GameUUID(Game game) {
        gameUuid = game.getOwner().getName() + ":" + game.getName();
    }

    @Override
    public String toString() {
        return gameUuid;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof GameUUID && (obj == this || ((GameUUID) obj).gameUuid.equals(this.gameUuid));
    }

}