package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class IronLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.IRON_ORE, 5);            // Rare ore
        items.put(Items.RAW_IRON, 5);            // Raw iron
        items.put(Items.RAW_IRON_BLOCK, 3);      // Raw iron block
        items.put(Items.IRON_INGOT, 6);          // Common ingot
        items.put(Items.IRON_NUGGET, 6);         // Small amount of iron
        items.put(Items.IRON_BLOCK, 1);          // High-value block

        // Armor
        items.put(Items.IRON_HELMET, 2);         // Armor piece
        items.put(Items.IRON_CHESTPLATE, 2);     // Armor piece
        items.put(Items.IRON_LEGGINGS, 2);       // Armor piece
        items.put(Items.IRON_BOOTS, 2);          // Armor piece
        items.put(Items.IRON_HORSE_ARMOR,2);    // Horse armor

        // Tools
        items.put(Items.IRON_SWORD, 2);          // Iron tool
        items.put(Items.IRON_SHOVEL, 2);         // Iron tool
        items.put(Items.IRON_PICKAXE, 2);        // Iron tool
        items.put(Items.IRON_AXE, 2);            // Iron tool
        items.put(Items.IRON_HOE, 2);            // Iron tool
        items.put(Items.FLINT_AND_STEEL, 3);     // Iron tool
        items.put(Items.SHEARS, 3);              // Iron tool
        items.put(Items.SHIELD, 2);              // Iron tool

        // Building
        items.put(Items.IRON_BARS, 4);           // Building material
        items.put(Items.IRON_DOOR, 4);           // Building material
        items.put(Items.IRON_TRAPDOOR, 4);       // Building material
        items.put(Items.BLAST_FURNACE, 4);       // Building station
        items.put(Items.BUCKET, 2);              // Useful item
        items.put(Items.CAULDRON, 4);            // Useful item
        items.put(Items.CHAIN, 4);              // Building material
        items.put(Items.HOPPER, 2);              // Building material
        items.put(Items.MINECART, 3);            // Building material
        items.put(Items.RAIL, 3);                // Building material
        items.put(Items.TRIPWIRE_HOOK, 4);       // Building material

        // Stations
        items.put(Items.SMITHING_TABLE, 6);      // Crafting station
        items.put(Items.STONECUTTER, 5);         // Crafting station

        return items;
    }
}
