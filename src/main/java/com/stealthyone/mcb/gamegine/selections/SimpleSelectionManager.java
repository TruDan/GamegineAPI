package com.stealthyone.mcb.gamegine.selections;

import com.stealthyone.mcb.gamegine.GamegineProvider;
import com.stealthyone.mcb.stbukkitlib.api.Stbl;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SimpleSelectionManager implements SelectionManager {

    private GamegineProvider provider;

    private ItemStack selectionWand;

    private Selection consoleSelection;
    private Map<UUID, Selection> playerSelections = new HashMap<>(); //Player UUID, selection

    public SimpleSelectionManager(GamegineProvider provider) {
        this.provider = provider;
    }

    @Override
    public void saveSelections() {

    }

    @Override
    public void loadSelections() {

    }

    @Override
    public ItemStack getSelectionWand() {
        return selectionWand;
    }

    @Override
    public Selection getPlayerSelection(String playerName) {
        UUID uuid = Stbl.getUuidManager().getUuid(playerName);
        return uuid == null ? null : playerSelections.get(uuid);
    }

    @Override
    public Selection getPlayerSelection(Player player) {
        return null;
    }

    @Override
    public Selection createPlayerSelection(Player player) {
        return null;
    }

    @Override
    public Selection getConsoleSelection() {
        return null;
    }

    @Override
    public Selection createConsoleSelection() {
        return null;
    }

}