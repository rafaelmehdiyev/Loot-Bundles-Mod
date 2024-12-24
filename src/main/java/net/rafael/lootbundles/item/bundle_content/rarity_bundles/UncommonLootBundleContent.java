package net.rafael.lootbundles.item.bundle_content.rarity_bundles;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

import java.util.HashMap;
import java.util.Map;

public class UncommonLootBundleContent {
    public static Map<Item, Integer> getItems(){
        Map<Item, Integer> items = new HashMap<>();

        // Filter items with Rarity.UNCOMMON and assign an integer value (e.g., weight or probability)
        Registries.ITEM.stream()
                .filter(item -> item.getDefaultStack().getRarity() == Rarity.UNCOMMON)
                .forEach(item -> items.put(item, 1));  // Replace '1' with your desired value for probability or weight

        return items;
    }
}