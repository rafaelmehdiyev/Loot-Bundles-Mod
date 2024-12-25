package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CowLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.COOKED_BEEF, 2);
        items.put(Items.LEATHER, 3);
        items.put(Items.MILK_BUCKET, 1);
        items.put(Items.BEEF, 4);
        return items;
    }
}
