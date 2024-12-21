package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class CopperLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        Items.COPPER_ORE,
                        Items.RAW_COPPER,
                        Items.RAW_COPPER_BLOCK,
                        Items.COPPER_INGOT,
                        Items.COPPER_BLOCK,
                        Items.CHISELED_COPPER,
                        Items.COPPER_GRATE,
                        Items.CUT_COPPER,
                        Items.CUT_COPPER_SLAB,
                        Items.CUT_COPPER_STAIRS,
                        Items.COPPER_DOOR,
                        Items.COPPER_TRAPDOOR,
                        Items.COPPER_BULB,
                        Items.LIGHTNING_ROD
                )
        );
    }
}

