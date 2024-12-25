package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class PigLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.PORKCHOP, 5);
        items.put(Items.COOKED_PORKCHOP, 2);
        items.put(Items.CARROT_ON_A_STICK, 1);
        items.put(Items.CARROT, 3);
        return items;
    }
}
