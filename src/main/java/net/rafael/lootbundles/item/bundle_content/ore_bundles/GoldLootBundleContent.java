package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class GoldLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.GOLD_ORE, 5);          // Rare ore
        items.put(Items.RAW_GOLD, 5);          // Raw gold, valuable
        items.put(Items.RAW_GOLD_BLOCK, 2);    // Raw gold block
        items.put(Items.GOLD_INGOT, 6);        // Common gold ingot
        items.put(Items.GOLD_NUGGET, 6);       // Small amount of gold
        items.put(Items.GOLD_BLOCK, 2);        // High-value block

        // Armor
        items.put(Items.GOLDEN_HELMET, 3);     // Armor piece
        items.put(Items.GOLDEN_CHESTPLATE, 3); // Armor piece
        items.put(Items.GOLDEN_LEGGINGS, 3);   // Armor piece
        items.put(Items.GOLDEN_BOOTS, 3);      // Armor piece
        items.put(Items.GOLDEN_HORSE_ARMOR, 2); // Horse armor

        // Tools
        items.put(Items.GOLDEN_SWORD, 3);     // Golden tool
        items.put(Items.GOLDEN_SHOVEL, 3);    // Golden tool
        items.put(Items.GOLDEN_PICKAXE, 3);   // Golden tool
        items.put(Items.GOLDEN_AXE, 3);       // Golden tool
        items.put(Items.GOLDEN_HOE, 3);       // Golden tool

        // Building
        items.put(Items.GOLDEN_APPLE, 2);     // Special building item
        items.put(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, 5); // Building item
        items.put(Items.POWERED_RAIL, 5);     // Building item

        return items;
    }
}
