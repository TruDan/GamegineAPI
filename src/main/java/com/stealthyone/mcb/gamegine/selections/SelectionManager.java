package com.stealthyone.mcb.gamegine.selections;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Represents a selection manager.
 *
 * Responsible for saving/loading selections, retrieving player selections, and getting the selection wand.
 */
public interface SelectionManager {

    public void saveSelections();

    public void loadSelections();

    public ItemStack getSelectionWand();

    public Selection getPlayerSelection(String playerName);

    public Selection getPlayerSelection(Player player);

    public Selection createPlayerSelection(Player player);

    public Selection getConsoleSelection();

    public Selection createConsoleSelection();

}