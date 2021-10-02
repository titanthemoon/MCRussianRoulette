package io.github.titanthemoon.mcrussianroulette;

import io.github.titanthemoon.mcrussianroulette.commands.GetRRBowCommand;
import io.github.titanthemoon.mcrussianroulette.commands.RandomItemCommand;
import io.github.titanthemoon.mcrussianroulette.listeners.RRBowFireListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCRussianRoulette extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new RRBowFireListener(), this);

        this.getCommand("getrrbow").setExecutor(new GetRRBowCommand());
        this.getCommand("getrrkit").setExecutor(new RandomItemCommand());

    }

    @Override
    public void onDisable() {}
}
