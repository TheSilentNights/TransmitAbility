package com.thesilentnights.transmitability.repo;

import com.thesilentnights.transmitability.util.ColorFormatter;
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
        itemMeta.setDisplayName(ColorFormatter.format("TpShovel"));
    }
}
