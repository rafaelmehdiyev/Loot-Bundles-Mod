package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CopperLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        items.put(Items.COPPER_ORE, 5);            // Commonly obtained
        items.put(Items.RAW_COPPER, 6);            // Common raw material
        items.put(Items.RAW_COPPER_BLOCK, 3);      // Less common but valuable
        items.put(Items.COPPER_INGOT, 7);          // Common crafted material
        items.put(Items.COPPER_BLOCK, 3);          // Less common block
        items.put(Items.CHISELED_COPPER, 2);      // Rare decorative block
        items.put(Items.COPPER_GRATE, 2);          // Rare decorative item
        items.put(Items.CUT_COPPER, 2);            // Slightly less common block
        items.put(Items.CUT_COPPER_SLAB, 2);       // Slightly less common block
        items.put(Items.CUT_COPPER_STAIRS, 2);     // Slightly less common block
        items.put(Items.COPPER_DOOR, 2);           // Rare item
        items.put(Items.COPPER_TRAPDOOR, 2);       // Rare item
        items.put(Items.COPPER_BULB, 2);           // Special decorative item
        items.put(Items.LIGHTNING_ROD, 2);         // Useful but rare

        return items;
    }
}
