package net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class DrownedLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.ROTTEN_FLESH, 7);
        items.put(Items.COPPER_INGOT, 3);
        items.put(Items.NAUTILUS_SHELL, 1);
        items.put(Items.TRIDENT, 1);
        items.put(Items.FISHING_ROD,2);
        return items;
    }
}
