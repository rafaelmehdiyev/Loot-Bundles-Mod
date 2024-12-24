package net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class SpiderLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Items dropped by Spider with assigned weights
        items.put(Items.STRING, 5);               // Common item used for crafting, especially for bows
        items.put(Items.SPIDER_EYE, 7);            // Useful for brewing potions
        items.put(Items.FERMENTED_SPIDER_EYE, 2);  // Rare variant of Spider Eye used in brewing
        items.put(Items.COBWEB, 4);                // Block that can be used for traps or decorative purposes

        return items;
    }
}
