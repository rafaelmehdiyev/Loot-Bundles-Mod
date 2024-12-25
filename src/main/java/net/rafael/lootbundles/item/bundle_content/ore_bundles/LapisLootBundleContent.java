package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class LapisLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.LAPIS_ORE, 6);           // Rare ore
        items.put(Items.LAPIS_LAZULI, 6);        // Common material
        items.put(Items.LAPIS_BLOCK, 2);         // High-value block
        items.put(Items.BLUE_DYE, 6);            // Common dye
        items.put(Items.EXPERIENCE_BOTTLE, 2);   // Valuable item for experience

        return items;
    }
}
