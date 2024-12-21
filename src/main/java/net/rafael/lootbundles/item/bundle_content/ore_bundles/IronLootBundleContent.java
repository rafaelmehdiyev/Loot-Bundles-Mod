package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class IronLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        // Materials
                        Items.IRON_ORE,
                        Items.RAW_IRON,
                        Items.RAW_IRON_BLOCK,
                        Items.IRON_INGOT,
                        Items.IRON_NUGGET,
                        Items.IRON_BLOCK,
                        
                        // Armor
                        Items.IRON_HELMET,
                        Items.IRON_CHESTPLATE,
                        Items.IRON_LEGGINGS,
                        Items.IRON_BOOTS,
                        Items.IRON_HORSE_ARMOR,
                        
                        // Tools
                        Items.IRON_SWORD,
                        Items.IRON_SHOVEL,
                        Items.IRON_PICKAXE,
                        Items.IRON_AXE,
                        Items.IRON_HOE,
                        Items.FLINT_AND_STEEL,
                        Items.SHEARS,
                        Items.SHIELD,
                        
                        // Building
                        Items.IRON_BARS,
                        Items.IRON_DOOR,
                        Items.IRON_TRAPDOOR,
                        
                        Items.BLAST_FURNACE,
                        Items.BUCKET,
                        Items.CAULDRON,
                        Items.CHAIN,
                        Items.HOPPER,
                        Items.MINECART,
                        Items.RAIL,
                        Items.TRIPWIRE_HOOK,
                        
                        // Stations
                        Items.SMITHING_TABLE,
                        Items.STONECUTTER
                )
        );
    }
}

