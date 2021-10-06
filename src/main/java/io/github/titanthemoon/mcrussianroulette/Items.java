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

    public static void giveItem(ItemStack item, Player user)  {
        if (user.getInventory().firstEmpty() == -1) {
            Location loc = user.getLocation();
            World world = user.getWorld();

            world.dropItemNaturally(loc, item);
        } else {
            user.getInventory().addItem(item);
        }
    }

    public static ItemStack getRussianRouletteBow() {

        ItemStack rrBow = new ItemStack(Material.BOW);
        ItemMeta rrBowMeta = rrBow.getItemMeta();

        assert rrBowMeta != null;
        rrBowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cRussian Roulette Bow"));

        List<String> subtitle = new ArrayList<String>();
        subtitle.add("");
        subtitle.add("SPIN THE BARREL");
        rrBowMeta.setLore(subtitle);

        rrBowMeta.setUnbreakable(true);
        rrBowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 4096, true);
        rrBowMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        rrBowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        rrBow.setItemMeta(rrBowMeta);

        return rrBow;
    }

    public static ItemStack getGodSword() {
        ItemStack godSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta godSwordMeta = godSword.getItemMeta();

        assert godSwordMeta != null;
        godSwordMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Sword"));

        godSwordMeta.setUnbreakable(true);
        godSwordMeta.addEnchant(Enchantment.DAMAGE_ALL, 14, true);
        godSwordMeta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
        godSwordMeta.addEnchant(Enchantment.SWEEPING_EDGE, 9, true);
        godSwordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godSwordMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godSword.setItemMeta(godSwordMeta);

        return godSword;
    }

    public static ItemStack getGodPickaxe() {
        ItemStack godPickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta godPickaxeMeta = godPickaxe.getItemMeta();

        assert godPickaxeMeta != null;
        godPickaxeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Pickaxe"));

        godPickaxeMeta.setUnbreakable(true);
        godPickaxeMeta.addEnchant(Enchantment.DIG_SPEED, 35, true);
        godPickaxeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godPickaxeMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godPickaxe.setItemMeta(godPickaxeMeta);

        return godPickaxe;
    }

    public static ItemStack getGodAxe() {
        ItemStack godAxe = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta godAxeMeta = godAxe.getItemMeta();

        assert godAxeMeta != null;
        godAxeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Axe"));

        godAxeMeta.setUnbreakable(true);
        godAxeMeta.addEnchant(Enchantment.DIG_SPEED, 35, true);
        godAxeMeta.addEnchant(Enchantment.DAMAGE_ALL, 9, true);
        godAxeMeta.addEnchant(Enchantment.FIRE_ASPECT, 9, true);
        godAxeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godAxeMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godAxe.setItemMeta(godAxeMeta);

        return godAxe;
    }

    public static ItemStack getGodShovel() {
        ItemStack godShovel = new ItemStack(Material.DIAMOND_SHOVEL);
        ItemMeta godShovelMeta = godShovel.getItemMeta();

        assert godShovelMeta != null;
        godShovelMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Shovel"));

        godShovelMeta.setUnbreakable(true);
        godShovelMeta.addEnchant(Enchantment.DIG_SPEED, 35, true);
        godShovelMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godShovelMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godShovel.setItemMeta(godShovelMeta);

        return godShovel;
    }

    public static ItemStack getGodHelmet() {
        ItemStack godHelmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta godHelmetMeta = godHelmet.getItemMeta();

        assert godHelmetMeta != null;
        godHelmetMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Helmet"));

        godHelmetMeta.setUnbreakable(true);
        godHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
        godHelmetMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 9, true);
        godHelmetMeta.addEnchant(Enchantment.PROTECTION_FIRE, 9, true);
        godHelmetMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 9, true);
        godHelmetMeta.addEnchant(Enchantment.OXYGEN, 4, true);
        godHelmetMeta.addEnchant(Enchantment.WATER_WORKER, 4, true);
        godHelmetMeta.addEnchant(Enchantment.THORNS, 4, true);
        godHelmetMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godHelmetMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godHelmet.setItemMeta(godHelmetMeta);

        return godHelmet;
    }

    public static ItemStack getGodChestPlate() {
        ItemStack godChestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta godChestPlateMeta = godChestPlate.getItemMeta();

        assert godChestPlateMeta != null;
        godChestPlateMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Chestplate"));

        godChestPlateMeta.setUnbreakable(true);
        godChestPlateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
        godChestPlateMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 9, true);
        godChestPlateMeta.addEnchant(Enchantment.PROTECTION_FIRE, 9, true);
        godChestPlateMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 9, true);
        godChestPlateMeta.addEnchant(Enchantment.THORNS, 4, true);
        godChestPlateMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godChestPlateMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godChestPlate.setItemMeta(godChestPlateMeta);

        return godChestPlate;
    }

    public static ItemStack getGodLeggings() {
        ItemStack godLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta godLeggingMeta = godLeggings.getItemMeta();

        assert godLeggingMeta != null;
        godLeggingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Leggings"));

        godLeggingMeta.setUnbreakable(true);
        godLeggingMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
        godLeggingMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 9, true);
        godLeggingMeta.addEnchant(Enchantment.PROTECTION_FIRE, 9, true);
        godLeggingMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 9, true);
        godLeggingMeta.addEnchant(Enchantment.THORNS, 4, true);
        godLeggingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godLeggingMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godLeggings.setItemMeta(godLeggingMeta);

        return godLeggings;
    }

    public static ItemStack getGodBoots() {
        ItemStack godBoots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta godBootsMeta = godBoots.getItemMeta();

        assert godBootsMeta != null;
        godBootsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGod Boots"));

        godBootsMeta.setUnbreakable(true);
        godBootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
        godBootsMeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 9, true);
        godBootsMeta.addEnchant(Enchantment.PROTECTION_FIRE, 9, true);
        godBootsMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 9, true);
        godBootsMeta.addEnchant(Enchantment.DEPTH_STRIDER, 4, true);
        godBootsMeta.addEnchant(Enchantment.PROTECTION_FALL, 9, true);
        godBootsMeta.addEnchant(Enchantment.THORNS, 4, true);
        godBootsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        godBootsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        godBoots.setItemMeta(godBootsMeta);

        return godBoots;
    }

    public static ItemStack getLightningItem() {

        ItemStack lightningRod = new ItemStack(Material.BLAZE_ROD);
        ItemMeta lightMeta = lightningRod.getItemMeta();

        assert lightMeta != null;
        lightMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Lightning Rod");
        List<String> lightLore = new ArrayList<String>();

        lightLore.add("");
        lightLore.add(ChatColor.GOLD + "Right Click to Strike Once");
        lightLore.add(ChatColor.GOLD + "Left Click to Spam Lightning");
        lightMeta.setLore(lightLore);

        lightMeta.addEnchant(Enchantment.DURABILITY, 1000, true);
        lightMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lightMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        lightningRod.setItemMeta(lightMeta);

        return lightningRod;
    }

    public static ItemStack getExplosionItem() {

        ItemStack explosionStar = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta boomMeta = explosionStar.getItemMeta();

        assert boomMeta != null;
        boomMeta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Explosion Star");
        List<String> boomLore = new ArrayList<String>();

        boomLore.add("");
        boomLore.add(ChatColor.GOLD + "Right Click to Explode Once");
        boomLore.add(ChatColor.GOLD + "Left Click to Spam Explosions");
        boomMeta.setLore(boomLore);

        boomMeta.addEnchant(Enchantment.DURABILITY, 1000, true);
        boomMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        boomMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        explosionStar.setItemMeta(boomMeta);

        return explosionStar;

    }


}
