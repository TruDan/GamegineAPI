package com.stealthyone.mcb.gamegine.signs;

public class SignUUID {

    private String signUuid;

    public SignUUID(SignType sign) {
        signUuid = sign.getOwner().getUuid().toString() + "$" + sign.getName();
    }

    @Override
    public String toString() {
        return signUuid;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SignUUID && (obj == this || ((SignUUID) obj).signUuid.equals(this.signUuid));
    }

}