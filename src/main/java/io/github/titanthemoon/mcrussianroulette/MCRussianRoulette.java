package io.github.titanthemoon.mcrussianroulette;

import io.github.titanthemoon.mcrussianroulette.commands.GetRRBowCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCRussianRoulette extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("getrrbow").setExecutor(new GetRRBowCommand());

    }

    @Override
    public void onDisable() {

    }
}
