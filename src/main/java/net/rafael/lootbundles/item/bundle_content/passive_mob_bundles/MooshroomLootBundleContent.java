package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.Map;

public class MooshroomLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = CowLootBundleContent.getItems();
        items.put(Items.RED_MUSHROOM, 5);
        items.put(Items.MUSHROOM_STEW, 2);
        return items;
    }
}
