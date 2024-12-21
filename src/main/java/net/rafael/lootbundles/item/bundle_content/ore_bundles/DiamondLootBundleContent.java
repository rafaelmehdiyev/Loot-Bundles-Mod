package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class DiamondLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        // Materials
                        Items.DIAMOND_ORE,
                        Items.DIAMOND,
                        Items.DIAMOND_BLOCK,

                        // Armor
                        Items.DIAMOND_HELMET,
                        Items.DIAMOND_CHESTPLATE,
                        Items.DIAMOND_LEGGINGS,
                        Items.DIAMOND_BOOTS,
                        Items.DIAMOND_HORSE_ARMOR,

                        // Tools
                        Items.DIAMOND_SWORD,
                        Items.DIAMOND_SHOVEL,
                        Items.DIAMOND_PICKAXE,
                        Items.DIAMOND_AXE,
                        Items.DIAMOND_HOE
                )
        );
    }
}


