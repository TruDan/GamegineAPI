package com.stealthyone.mcb.gamegine.signs;

import com.stealthyone.mcb.gamegine.games.Game;

public class SignType {

    private Game owner;
    private String name;
    private SignUUID uuid;
    private Class<? extends GameSign> sign;

    public SignType(Game owner, String name, Class<? extends GameSign> sign) {
        this.owner = owner;
        this.name = name;
        this.uuid = new SignUUID(this);
    }

    public SignUUID getUuid() {
        return uuid;
    }

    public Game getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

}