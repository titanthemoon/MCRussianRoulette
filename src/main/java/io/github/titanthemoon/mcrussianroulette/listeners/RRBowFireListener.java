package io.github.titanthemoon.mcrussianroulette.listeners;

import io.github.titanthemoon.mcrussianroulette.Items;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;

public class RRBowFireListener implements Listener {

    @EventHandler
    public void fireRRBow(EntityShootBowEvent event) {
        if (event.getEntity() instanceof Player) {
            Player shooter = (Player) event.getEntity();
            if (shooter.getInventory().getItemInMainHand().getType().equals(Material.BOW))
                if(shooter.getInventory().getItemInMainHand().getItemMeta().hasLore())
                    if (shooter.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Russian Roulette Bow")) {

                        Entity proj = event.getProjectile();

                        // Spin the Barrel
                        if (Math.floor(Math.random() * 6) != 1) {
                            proj.remove();
                            Items.giveItem(new ItemStack(Material.ARROW, 1), shooter);
                        }
                    }
        }
    }
}
