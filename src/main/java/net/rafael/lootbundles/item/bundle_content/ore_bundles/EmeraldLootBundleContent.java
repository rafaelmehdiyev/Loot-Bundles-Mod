package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class EmeraldLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials
        items.put(Items.EMERALD_ORE, 3);    // Rare ore
        items.put(Items.EMERALD, 6);         // Valuable gem
        items.put(Items.EMERALD_BLOCK, 2);   // High-value block

        return items;
    }
}
