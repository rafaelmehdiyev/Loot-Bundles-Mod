package net.rafael.lootbundles.item.bundle_content.rarity_bundles;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

import java.util.HashMap;
import java.util.Map;

public class CommonLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Filter common items and assign them a default quantity (e.g., 1)
        Registries.ITEM.stream()
                .filter(item -> item.getDefaultStack().getRarity() == Rarity.COMMON)
                .forEach(item -> items.put(item, 1)); // Assign a default quantity of 1

        return items;
    }
}
