package io.github.titanthemoon.mcrussianroulette;

import io.github.titanthemoon.mcrussianroulette.commands.ExplosionItemCommand;
import io.github.titanthemoon.mcrussianroulette.commands.GetRRBowCommand;
import io.github.titanthemoon.mcrussianroulette.commands.LightningItemCommand;
import io.github.titanthemoon.mcrussianroulette.commands.RandomItemCommand;
import io.github.titanthemoon.mcrussianroulette.listeners.ExplosionStriker;
import io.github.titanthemoon.mcrussianroulette.listeners.LightningStriker;
import io.github.titanthemoon.mcrussianroulette.listeners.RRBowFireListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MCRussianRoulette extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new RRBowFireListener(), this);
        getServer().getPluginManager().registerEvents(new LightningStriker(), this);
        getServer().getPluginManager().registerEvents(new ExplosionStriker(), this);

        Objects.requireNonNull(this.getCommand("getrrbow")).setExecutor(new GetRRBowCommand());
        Objects.requireNonNull(this.getCommand("getrrkit")).setExecutor(new RandomItemCommand());
        Objects.requireNonNull(this.getCommand("getlightningitem")).setExecutor(new LightningItemCommand());
        Objects.requireNonNull(this.getCommand("getexplosionstar")).setExecutor(new ExplosionItemCommand());

    }

    @Override
    public void onDisable() {}
}
