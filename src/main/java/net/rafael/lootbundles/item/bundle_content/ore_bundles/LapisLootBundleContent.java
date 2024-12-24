package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class LapisLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.LAPIS_ORE, 4);           // Rare ore
        items.put(Items.LAPIS_LAZULI, 5);        // Common material
        items.put(Items.LAPIS_BLOCK, 3);         // High-value block
        items.put(Items.BLUE_DYE, 2);            // Common dye
        items.put(Items.EXPERIENCE_BOTTLE, 6);   // Valuable item for experience

        return items;
    }
}
