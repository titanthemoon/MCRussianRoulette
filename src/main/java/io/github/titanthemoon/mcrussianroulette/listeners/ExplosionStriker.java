package io.github.titanthemoon.mcrussianroulette.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Set;

public class ExplosionStriker implements Listener {

    @EventHandler
    public void explosionStriker(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();
        player.getInventory().getItemInMainHand();
        if (player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Explosion Star")) {
                if (player.getInventory().getItemInMainHand().getType() == Material.FIREWORK_STAR) {
                    player.getWorld().createExplosion(player.getTargetBlock((Set<Material>) null, 200).getLocation(), 7, true);
                }
            }
        }
    }
}
