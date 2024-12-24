package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class ZombieLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Items dropped by Zombies with assigned weights
        items.put(Items.ROTTEN_FLESH, 7);  // Common drop
        items.put(Items.IRON_INGOT, 3);    // Less frequent drop, but still common with certain zombies
        items.put(Items.CARROT, 2);        // Occasionally dropped, especially in villages
        items.put(Items.POTATO, 2);        // Similar to carrot, less frequent but possible

        return items;
    }
}
