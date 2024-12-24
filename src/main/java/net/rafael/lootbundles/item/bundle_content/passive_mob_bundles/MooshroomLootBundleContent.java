package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class MooshroomLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.COOKED_BEEF, 2);      // Weight of 2
        items.put(Items.LEATHER, 3);          // Weight of 3
        items.put(Items.MILK_BUCKET, 1);      // Weight of 1
        items.put(Items.BEEF, 4);             // Weight of 4
        items.put(Items.RED_MUSHROOM, 5);     // Weight of 5
        items.put(Items.MUSHROOM_STEW, 2);    // Weight of 2
        return items;
    }
}
