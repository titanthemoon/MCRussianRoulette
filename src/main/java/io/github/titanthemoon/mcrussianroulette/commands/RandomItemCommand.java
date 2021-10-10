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

        int[] randomNum = new int[12];

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) Math.floor(Math.random() * 6);
        }

        player.getInventory().clear();

        switch (randomNum[0]) {
            case (2):
                Items.giveItem(new ItemStack(Material.WOODEN_SWORD), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_SWORD), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_SWORD), player);
                break;
            case (5):
                Items.giveItem(Items.getGodSword(), player);
                break;
        }

        switch (randomNum[1]) {
            case (2):
                Items.giveItem(new ItemStack(Material.WOODEN_PICKAXE), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_PICKAXE), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_PICKAXE), player);
                break;
            case (5):
                Items.giveItem(Items.getGodPickaxe(), player);
                break;
        }

        switch (randomNum[2]) {
            case (2):
                Items.giveItem(new ItemStack(Material.WOODEN_AXE), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_AXE), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_AXE), player);
                break;
            case (5):
                Items.giveItem(Items.getGodAxe(), player);
                break;
        }

        switch (randomNum[3]) {
            case (2):
                Items.giveItem(new ItemStack(Material.WOODEN_SHOVEL), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_SHOVEL), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_SHOVEL), player);
                break;
            case (5):
                Items.giveItem(Items.getGodShovel(), player);
                break;
        }

        Items.giveItem(Items.getRussianRouletteBow(), player);

        switch (randomNum[4]) {
            case (2):
                Items.giveItem(new ItemStack(Material.LEATHER_HELMET), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_HELMET), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_HELMET), player);
                break;
            case (5):
                Items.giveItem(Items.getGodHelmet(), player);
                break;
        }

        switch (randomNum[5]) {
            case (2):
                Items.giveItem(new ItemStack(Material.LEATHER_CHESTPLATE), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_CHESTPLATE), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_CHESTPLATE), player);
                break;
            case (5):
                Items.giveItem(Items.getGodChestPlate(), player);
                break;
        }

        switch (randomNum[6]) {
            case (2):
                Items.giveItem(new ItemStack(Material.LEATHER_LEGGINGS), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_LEGGINGS), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_LEGGINGS), player);
                break;
            case (5):
                Items.giveItem(Items.getGodLeggings(), player);
                break;
        }

        switch (randomNum[7]) {
            case (2):
                Items.giveItem(new ItemStack(Material.LEATHER_BOOTS), player);
                break;
            case (3):
                Items.giveItem(new ItemStack(Material.IRON_BOOTS), player);
                break;
            case (4):
                Items.giveItem(new ItemStack(Material.DIAMOND_BOOTS), player);
                break;
            case (5):
                Items.giveItem(Items.getGodBoots(), player);
                break;
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

        switch (randomNum[11]) {
            case (4):
                Items.giveItem(Items.getLightningItem(), player);
                break;
            case (5):
                Items.giveItem(Items.getExplosionItem(), player);
                break;
        }

        return false;
    }
}
