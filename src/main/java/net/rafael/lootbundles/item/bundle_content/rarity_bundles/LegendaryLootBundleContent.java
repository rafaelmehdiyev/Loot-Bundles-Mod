package net.rafael.lootbundles.item.bundle_content.rarity_bundles;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

import java.util.HashMap;
import java.util.Map;

public class LegendaryLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Iterate through all registered items and add them to the map if they are not in the blacklist
        Registries.ITEM.stream()
                .forEach(item -> items.put(item, 1)); // Assign a default weight of 1

        return items;
    }
}
