package com.stealthyone.mcb.gamegine.signs;

import com.stealthyone.mcb.gamegine.games.Game;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.List;

public abstract class GameSign {

    private Game owner;
    private Location location;

    public GameSign(Game owner, Location location) {
        this.owner = owner;
        this.location = location;
    }

    /**
     * Called when the sign updates.
     *
     * @param lines Lines to set on the sign in the world.
     */
    public abstract void updateSign(List<String> lines);

    /**
     * Called when a player interacts with this sign.
     *
     * @param event PlayerInteractEvent instance.
     */
    public abstract void onPlayerInteract(PlayerInteractEvent event);

}