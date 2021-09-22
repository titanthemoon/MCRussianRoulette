package io.github.titanthemoon.mcrussianroulette;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

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

    public ItemStack getRussianRouletteBow() {

        ItemStack rrBow = new ItemStack(Material.BOW);
        ItemMeta rrBowMeta = rrBow.getItemMeta();

        rrBowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRussian Roulette Bow"));

        List<String> subtitle = new ArrayList<String>();
        subtitle.add("");
        subtitle.add("");
        rrBowMeta.setLore(subtitle);

        rrBowMeta.setUnbreakable(true);
        rrBowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 255, true);
        rrBowMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        rrBow.setItemMeta(rrBowMeta);

        return rrBow;
    }
}
