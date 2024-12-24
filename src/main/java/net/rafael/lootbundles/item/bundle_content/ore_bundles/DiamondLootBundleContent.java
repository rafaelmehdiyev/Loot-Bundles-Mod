package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class DiamondLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials
        items.put(Items.DIAMOND_ORE, 3);          // Rare ore
        items.put(Items.DIAMOND, 6);              // Common material
        items.put(Items.DIAMOND_BLOCK, 2);        // Rare block

        // Armor
        items.put(Items.DIAMOND_HELMET, 1);       // Rare armor piece
        items.put(Items.DIAMOND_CHESTPLATE, 1);   // Rare armor piece
        items.put(Items.DIAMOND_LEGGINGS, 1);     // Rare armor piece
        items.put(Items.DIAMOND_BOOTS, 1);        // Rare armor piece
        items.put(Items.DIAMOND_HORSE_ARMOR, 1);  // Rare item for horses

        // Tools
        items.put(Items.DIAMOND_SWORD, 1);        // Rare tool
        items.put(Items.DIAMOND_SHOVEL, 1);       // Rare tool
        items.put(Items.DIAMOND_PICKAXE, 1);      // Rare tool
        items.put(Items.DIAMOND_AXE, 1);          // Rare tool
        items.put(Items.DIAMOND_HOE, 1);          // Rare tool

        return items;
    }
}
