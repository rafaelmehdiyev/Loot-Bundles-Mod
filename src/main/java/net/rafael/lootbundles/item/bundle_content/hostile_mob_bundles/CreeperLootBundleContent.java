package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CreeperLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Items dropped by Creeper with assigned weights
        items.put(Items.GUNPOWDER, 8);  // Common item dropped by Creepers, essential for crafting TNT and Fire Charges
        items.put(Items.TNT, 2);         // Rare item, used for explosions

        return items;
    }
}
