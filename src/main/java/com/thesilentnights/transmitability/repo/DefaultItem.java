package com.thesilentnights.transmitability.repo;

import com.thesilentnights.transmitability.util.ColorFormat;
import io.papermc.paper.enchantments.EnchantmentRarity;
import io.papermc.paper.inventory.ItemRarity;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class DefaultItem {
    public static ItemStack defaultItem;

    public static void init(){
        defaultItem = new ItemStack(Material.DIAMOND_SHOVEL);
        defaultItem.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        defaultItem.addUnsafeEnchantment(Enchantment.MENDING,100);
        ItemMeta itemMeta = defaultItem.getItemMeta();
        itemMeta.setDisplayName(ColorFormat.format("TpShovel"));
    }
}
