package io.github.titanthemoon.mcrussianroulette;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Items {
    public void giveItem(ItemStack item, Player user)  {
        if (user.getInventory().firstEmpty() == -1) {
            Location loc = user.getLocation();
            World world = user.getWorld();

            world.dropItemNaturally(loc, item);
        } else {
            user.getInventory().addItem(item);
        }
    }
}
