package com.stealthyone.mcb.gamegine.api.selections;

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

    public com.stealthyone.mcb.gamegine.api.selections.Selection getPlayerSelection(String playerName);

    public com.stealthyone.mcb.gamegine.api.selections.Selection getPlayerSelection(Player player);

    public com.stealthyone.mcb.gamegine.api.selections.Selection createPlayerSelection(Player player);

    public com.stealthyone.mcb.gamegine.api.selections.Selection getConsoleSelection();

    public com.stealthyone.mcb.gamegine.api.selections.Selection createConsoleSelection();

}