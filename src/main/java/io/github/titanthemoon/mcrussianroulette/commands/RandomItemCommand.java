package io.github.titanthemoon.mcrussianroulette.commands;

import io.github.titanthemoon.mcrussianroulette.Items;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RandomItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        int[] randomNum = new int[11];

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) Math.floor(Math.random() * 6);
        }

        player.getInventory().clear();
        // Yandere Dev Moment
        if (randomNum[0] == 0 || randomNum[0] == 1) {
            Items.giveItem(new ItemStack(Material.WOODEN_SWORD), player);
        } else if (randomNum[0] == 2 || randomNum[0] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_SWORD), player);
        } else if (randomNum[0] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_SWORD), player);
        } else if (randomNum[0] == 5) {
            Items.giveItem(Items.getGodSword(), player);
        }

        if (randomNum[1] == 0 || randomNum[1] == 1) {
            Items.giveItem(new ItemStack(Material.WOODEN_PICKAXE), player);
        } else if (randomNum[1] == 2 || randomNum[1] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_PICKAXE), player);
        } else if (randomNum[1] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_PICKAXE), player);
        } else if (randomNum[1] == 5) {
            Items.giveItem(Items.getGodPickaxe(), player);
        }

        if (randomNum[2] == 0 || randomNum[2] == 1) {
            Items.giveItem(new ItemStack(Material.WOODEN_AXE), player);
        } else if (randomNum[2] == 2 || randomNum[2] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_AXE), player);
        } else if (randomNum[2] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_AXE), player);
        } else if (randomNum[2] == 5) {
            Items.giveItem(Items.getGodAxe(), player);
        }

        if (randomNum[3] == 0 || randomNum[3] == 1) {
            Items.giveItem(new ItemStack(Material.WOODEN_SHOVEL), player);
        } else if (randomNum[3] == 2 || randomNum[3] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_SHOVEL), player);
        } else if (randomNum[3] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_SHOVEL), player);
        } else if (randomNum[3] == 5) {
            Items.giveItem(Items.getGodShovel(), player);
        }

        Items.giveItem(Items.getRussianRouletteBow(), player);

        // More Yandere Dev Moments
        if (randomNum[4] == 0 || randomNum[4] == 1) {
            Items.giveItem(new ItemStack(Material.LEATHER_HELMET), player);
        } else if (randomNum[3] == 2 || randomNum[3] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_HELMET), player);
        } else if (randomNum[3] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_HELMET), player);
        } else if (randomNum[3] == 5) {
            Items.giveItem(Items.getGodHelmet(), player);
        }

        if (randomNum[5] == 0 || randomNum[5] == 1) {
            Items.giveItem(new ItemStack(Material.LEATHER_CHESTPLATE), player);
        } else if (randomNum[5] == 2 || randomNum[5] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_CHESTPLATE), player);
        } else if (randomNum[5] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_CHESTPLATE), player);
        } else if (randomNum[5] == 5) {
            Items.giveItem(Items.getGodChestPlate(), player);
        }

        if (randomNum[6] == 0 || randomNum[6] == 1) {
            Items.giveItem(new ItemStack(Material.LEATHER_LEGGINGS), player);
        } else if (randomNum[6] == 2 || randomNum[6] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_LEGGINGS), player);
        } else if (randomNum[6] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_LEGGINGS), player);
        } else if (randomNum[6] == 5) {
            Items.giveItem(Items.getGodLeggings(), player);
        }

        if (randomNum[7] == 0 || randomNum[7] == 1) {
            Items.giveItem(new ItemStack(Material.LEATHER_BOOTS), player);
        } else if (randomNum[7] == 2 || randomNum[7] == 3) {
            Items.giveItem(new ItemStack(Material.IRON_BOOTS), player);
        } else if (randomNum[7] == 4) {
            Items.giveItem(new ItemStack(Material.DIAMOND_BOOTS), player);
        } else if (randomNum[7] == 5) {
            Items.giveItem(Items.getGodBoots(), player);
        }

        switch (randomNum[8]) {
            case (0):
                Items.giveItem(new ItemStack(Material.SAND, 64 * randomNum[9]), player);
                break;
            case (1):
                Items.giveItem(new ItemStack(Material.DIRT, 64 * randomNum[9]), player);
                break;
            case (2):
                Items.giveItem(new ItemStack(Material.OAK_PLANKS, 64 * randomNum[9]), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.STONE, 64 * randomNum[9]), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.OBSIDIAN, 64 * randomNum[9]), player);
                break;
            case (5):
                Items.giveItem(new ItemStack(Material.BEDROCK, 64 * randomNum[9]), player);
                break;
        }

        switch (randomNum[10]) {
            case (0):
                Items.giveItem(new ItemStack(Material.POISONOUS_POTATO, 64), player);
                break;
            case (1):
                Items.giveItem(new ItemStack(Material.CAKE, 64), player);
                break;
            case (2):
                Items.giveItem(new ItemStack(Material.BEETROOT, 64), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.COOKED_BEEF, 64), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.GOLDEN_APPLE, 64), player);
                break;
            case (5):
                Items.giveItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64), player);
                break;
        }

        return false;
    }
}
