package io.github.titanthemoon.mcrussianroulette.commands;

import io.github.titanthemoon.mcrussianroulette.MessagesPrefix;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RRCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        switch (args.length) {
            case 0:

                sender.sendMessage(MessagesPrefix.ERR_PREFIX + "Please specify more arguments!");

                break;
            case 1:
                // add stuff
                break;
        }
        return false;
    }
}
