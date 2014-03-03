package com.stealthyone.mcb.gamegine.games.instances;

public class GameInstanceUUID {

    private String instanceId;
    private String gameInstanceUuid;

    public GameInstanceUUID(GameInstance instance) {
        instanceId = instance.getId();
        gameInstanceUuid = instance.getOwner().getUniqueId() + "#" + instance.getId();
    }

    @Override
    public String toString() {
        return gameInstanceUuid;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof GameInstanceUUID && (obj == this || ((GameInstanceUUID) obj).gameInstanceUuid.equals(this.gameInstanceUuid));
    }

    public String getInstanceId() {
        return instanceId;
    }

}