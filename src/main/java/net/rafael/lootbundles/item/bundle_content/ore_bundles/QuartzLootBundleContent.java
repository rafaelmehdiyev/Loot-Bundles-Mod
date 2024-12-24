package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class QuartzLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.NETHER_QUARTZ_ORE, 5);   // Rare ore found in the Nether
        items.put(Items.QUARTZ, 4);               // Common material
        items.put(Items.QUARTZ_BLOCK, 3);         // Block variant of Quartz
        items.put(Items.QUARTZ_STAIRS, 2);        // Building material
        items.put(Items.QUARTZ_SLAB, 2);          // Building material

        // Block Variants with weights
        items.put(Items.QUARTZ_PILLAR, 3);        // Block for building
        items.put(Items.QUARTZ_BRICKS, 3);        // Decorative building block
        items.put(Items.CHISELED_QUARTZ_BLOCK, 3); // Decorative block

        // Smooth variants with weights
        items.put(Items.SMOOTH_QUARTZ, 4);        // Smooth building block
        items.put(Items.SMOOTH_QUARTZ_SLAB, 2);   // Smooth slab for building
        items.put(Items.SMOOTH_QUARTZ_STAIRS, 2); // Smooth stairs for building

        return items;
    }
}
