package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CoalLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        items.put(Items.COAL, 8);
        items.put(Items.COAL_BLOCK, 2);
        items.put(Items.CHARCOAL, 8);
        items.put(Items.COAL_ORE, 6);
        items.put(Items.TORCH, 5);

        return items;
    }
}
