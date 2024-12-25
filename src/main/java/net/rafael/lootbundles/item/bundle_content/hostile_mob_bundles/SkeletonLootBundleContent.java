package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class SkeletonLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        items.put(Items.BONE, 7);
        items.put(Items.ARROW, 5);
        items.put(Items.BOW, 2);

        return items;
    }
}
