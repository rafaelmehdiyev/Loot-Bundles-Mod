package net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class EndermanLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Items dropped by Enderman with assigned weights
        items.put(Items.ENDER_PEARL, 8);  // A valuable item for teleportation, commonly dropped by Endermen
        items.put(Items.ENDER_EYE, 4);    // Rare item used for crafting Eye of Ender, essential for End game progression

        return items;
    }
}
