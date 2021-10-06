package io.github.titanthemoon.mcrussianroulette.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Set;

public class LightningStriker implements Listener {

    @EventHandler
    public void lightningStriker(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();
        player.getInventory().getItemInMainHand();
        if (player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Lightning Rod")) {
                if (player.getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD) {
                    player.getWorld().strikeLightning(player.getTargetBlock((Set<Material>) null, 200).getLocation());
                }
            }
        }
    }
}
