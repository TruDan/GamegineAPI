package com.stealthyone.mcb.gamegine.config;

import com.stealthyone.mcb.gamegine.Gamegine;
import com.stealthyone.mcb.gamegine.games.Game;
import com.stealthyone.mcb.gamegine.games.GameUUID;
import com.stealthyone.mcb.stbukkitlib.lib.storage.YamlFileManager;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

public class GameConfigYaml implements GameConfig {

    private GameUUID gameUuid;

    private YamlFileManager file;

    /* Config values */
    private boolean gameEnabled = false;

    public GameConfigYaml(Game game) {
        this(game, game.getOwner().getDataFolder() + File.separator + "GameConfig_" + game.getName() + ".yml");
    }

    public GameConfigYaml(Game game, String filePath) {
        gameUuid = game.getUuid();
        file = new YamlFileManager(filePath);
    }

    @Override
    public Game getOwner() {
        return Gamegine.getGame(gameUuid);
    }

    @Override
    public void loadConfig() {
        FileConfiguration config = file.getConfig();
        gameEnabled = config.getBoolean("Enabled", gameEnabled);
    }

    @Override
    public void saveConfig() {
        FileConfiguration config = file.getConfig();
        config.set("Enabled", gameEnabled);
        file.saveFile();
    }

    @Override
    public boolean isGameEnabled() {
        return gameEnabled;
    }

    @Override
    public void setGameEnabled(boolean state) {
        if (gameEnabled != state) {
            gameEnabled = state;
        }
    }

}