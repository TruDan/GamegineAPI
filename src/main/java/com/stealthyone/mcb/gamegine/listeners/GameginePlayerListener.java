package com.stealthyone.mcb.gamegine.listeners;

import com.stealthyone.mcb.gamegine.Gamegine;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Basic player listener for Gamegine. This or an alternative that provides the same functionality is REQUIRED.
 */
public class GameginePlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Gamegine.getProvider().getPlayerManager().handlePlayerJoin(e.getPlayer());
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        playerQuit(e.getPlayer());
    }

    @EventHandler
    public void onPlayerKick(PlayerKickEvent e) {
        playerQuit(e.getPlayer());
    }

    private void playerQuit(Player player) {
        Gamegine.getProvider().getPlayerManager().handlePlayerQuit(player);
    }

}