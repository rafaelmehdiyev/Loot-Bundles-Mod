package net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class SpiderLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        items.put(Items.STRING, 7);
        items.put(Items.SPIDER_EYE, 5);
        items.put(Items.FERMENTED_SPIDER_EYE, 2);
        items.put(Items.COBWEB, 1);
        return items;
    }
}
