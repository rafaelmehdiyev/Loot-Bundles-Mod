package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class AncientDebrisLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Assigning weights based on item rarity
        items.put(Items.ANCIENT_DEBRIS, 5);
        items.put(Items.NETHERITE_SCRAP, 4);
        items.put(Items.NETHERITE_INGOT, 3);
        items.put(Items.NETHERITE_BLOCK, 1);       // Very rare

        // Netherite armor and tools with lower weights
        items.put(Items.NETHERITE_HELMET, 2);
        items.put(Items.NETHERITE_CHESTPLATE, 2);
        items.put(Items.NETHERITE_LEGGINGS, 2);
        items.put(Items.NETHERITE_BOOTS, 2);

        items.put(Items.NETHERITE_SWORD, 2);
        items.put(Items.NETHERITE_SHOVEL, 2);
        items.put(Items.NETHERITE_PICKAXE, 2);
        items.put(Items.NETHERITE_AXE, 2);
        items.put(Items.NETHERITE_HOE, 2);

        return items;
    }
}
