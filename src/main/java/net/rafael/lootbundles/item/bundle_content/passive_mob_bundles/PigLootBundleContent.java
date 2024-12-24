package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class PigLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.PORKCHOP, 5);            // Weight of 5
        items.put(Items.COOKED_PORKCHOP, 3);     // Weight of 3
        items.put(Items.CARROT_ON_A_STICK, 1);  // Weight of 1
        items.put(Items.CARROT, 4);             // Weight of 4
        return items;
    }
}
