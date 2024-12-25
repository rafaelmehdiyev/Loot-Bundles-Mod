package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class ZombieLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.ROTTEN_FLESH, 7);
        items.put(Items.IRON_INGOT, 3);
        items.put(Items.CARROT, 2);
        items.put(Items.POTATO, 2);
        return items;
    }
}
