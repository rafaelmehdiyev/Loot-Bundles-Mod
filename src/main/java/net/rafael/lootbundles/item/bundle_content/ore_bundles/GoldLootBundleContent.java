package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class GoldLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        // Materials
                        Items.GOLD_ORE,
                        Items.RAW_GOLD,
                        Items.RAW_GOLD_BLOCK,
                        Items.GOLD_INGOT,
                        Items.GOLD_NUGGET,
                        Items.GOLD_BLOCK,

                        // Armor
                        Items.GOLDEN_HELMET,
                        Items.GOLDEN_CHESTPLATE,
                        Items.GOLDEN_LEGGINGS,
                        Items.GOLDEN_BOOTS,
                        Items.GOLDEN_HORSE_ARMOR,

                        // Tools
                        Items.GOLDEN_SWORD,
                        Items.GOLDEN_SHOVEL,
                        Items.GOLDEN_PICKAXE,
                        Items.GOLDEN_AXE,
                        Items.GOLDEN_HOE,

                        // Building
                        Items.GOLDEN_APPLE,

                        Items.LIGHT_WEIGHTED_PRESSURE_PLATE,
                        Items.POWERED_RAIL
                )
        );
    }
}
