package io.github.titanthemoon.mcrussianroulette.commands;

import io.github.titanthemoon.mcrussianroulette.Items;
import io.github.titanthemoon.mcrussianroulette.MessagesPrefix;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LightningItemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Items.giveItem(Items.getLightningItem(), player);
        player.sendMessage(MessagesPrefix.RR_PREFIX + "Here is your Lightning Rod!");

        return false;
    }
}
