package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class GoldLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.GOLD_ORE, 3);          // Rare ore
        items.put(Items.RAW_GOLD, 5);          // Raw gold, valuable
        items.put(Items.RAW_GOLD_BLOCK, 2);    // Raw gold block
        items.put(Items.GOLD_INGOT, 6);        // Common gold ingot
        items.put(Items.GOLD_NUGGET, 4);       // Small amount of gold
        items.put(Items.GOLD_BLOCK, 2);        // High-value block

        // Armor
        items.put(Items.GOLDEN_HELMET, 4);     // Armor piece
        items.put(Items.GOLDEN_CHESTPLATE, 5); // Armor piece
        items.put(Items.GOLDEN_LEGGINGS, 4);   // Armor piece
        items.put(Items.GOLDEN_BOOTS, 4);      // Armor piece
        items.put(Items.GOLDEN_HORSE_ARMOR, 3); // Horse armor

        // Tools
        items.put(Items.GOLDEN_SWORD, 5);     // Golden tool
        items.put(Items.GOLDEN_SHOVEL, 4);    // Golden tool
        items.put(Items.GOLDEN_PICKAXE, 4);   // Golden tool
        items.put(Items.GOLDEN_AXE, 4);       // Golden tool
        items.put(Items.GOLDEN_HOE, 3);       // Golden tool

        // Building
        items.put(Items.GOLDEN_APPLE, 7);     // Special building item
        items.put(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, 2); // Building item
        items.put(Items.POWERED_RAIL, 3);     // Building item

        return items;
    }
}
