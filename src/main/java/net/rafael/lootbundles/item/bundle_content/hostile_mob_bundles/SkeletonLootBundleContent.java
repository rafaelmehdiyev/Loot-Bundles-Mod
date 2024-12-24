package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class SkeletonLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Items dropped by Skeleton with assigned weights
        items.put(Items.BONE, 7);    // Common drop from Skeletons
        items.put(Items.ARROW, 5);    // Common drop, especially when killed with a bow
        items.put(Items.BOW, 2);      // Rare drop, skeletons can drop bows with varying durability

        return items;
    }
}
