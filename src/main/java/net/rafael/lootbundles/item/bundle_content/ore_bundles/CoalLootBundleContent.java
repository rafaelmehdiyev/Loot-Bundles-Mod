package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CoalLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Assigning weights based on item rarity and utility
        items.put(Items.COAL, 8);            // Commonly obtained item
        items.put(Items.COAL_BLOCK, 3);     // Less common
        items.put(Items.CHARCOAL, 5);       // More common than a block but less than coal
        items.put(Items.COAL_ORE, 2);       // Rare since it's a block
        items.put(Items.TORCH, 6);          // Useful and relatively common

        return items;
    }
}
