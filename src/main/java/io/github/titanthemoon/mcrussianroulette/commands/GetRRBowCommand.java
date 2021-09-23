package io.github.titanthemoon.mcrussianroulette.commands;

import io.github.titanthemoon.mcrussianroulette.Items;
import io.github.titanthemoon.mcrussianroulette.MessagesPrefix;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GetRRBowCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage(MessagesPrefix.RR_PREFIX + "Here is the Russian Roulette Bow");
            Items.giveItem(Items.getRussianRouletteBow(), player);
        } else if (args.length == 1) {
            try {
                Player player2 = (Player) Bukkit.getPlayer(args[1]);

                Items.giveItem(Items.getRussianRouletteBow(), player);
                Items.giveItem(new ItemStack(Material.ARROW), player);

                Items.giveItem(new ItemStack(Material.ARROW), player2);
                Items.giveItem(Items.getRussianRouletteBow(), player2);

                player.sendMessage(MessagesPrefix.RR_PREFIX + "You are now fighting " + player2.getDisplayName());
                player2.sendMessage(MessagesPrefix.RR_PREFIX + "You are now fighting " + player.getDisplayName());
            } catch (Exception e) {
                player.sendMessage(MessagesPrefix.ERR_PREFIX + "Player not found!");
            }
        } else if (args.length > 1) {
            try {
                for (int i = 0; i < args.length; i++) {
                    Player target = (Player) Bukkit.getPlayer(args[i]);

                    Items.giveItem(Items.getRussianRouletteBow(), player);
                    Items.giveItem(new ItemStack(Material.ARROW), player);

                    Items.giveItem(new ItemStack(Material.ARROW), target);
                    Items.giveItem(Items.getRussianRouletteBow(), target);

                    player.sendMessage(MessagesPrefix.RR_PREFIX + "You are now fighting " + target.getDisplayName());
                    target.sendMessage(MessagesPrefix.RR_PREFIX + "You are now fighting " + player.getDisplayName());
                }
            } catch (Exception e) {
                player.sendMessage(MessagesPrefix.ERR_PREFIX + "One of the players could not be found!");
            }
        }

        return false;
    }
}
