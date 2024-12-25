package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class ChickenLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.CHICKEN, 2);
        items.put(Items.COOKED_CHICKEN, 2);
        items.put(Items.FEATHER, 3);
        items.put(Items.EGG, 5);
        return items;
    }
}