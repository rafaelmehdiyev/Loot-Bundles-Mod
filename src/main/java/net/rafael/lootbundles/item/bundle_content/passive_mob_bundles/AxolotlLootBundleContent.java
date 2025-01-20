package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class AxolotlLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();
        items.put(Items.TROPICAL_FISH, 2);
        items.put(Items.PUFFERFISH, 2);
        items.put(Items.COD, 2);
        items.put(Items.SALMON, 2);
        return items;
    }
}
