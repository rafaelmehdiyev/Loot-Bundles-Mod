package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class QuartzLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        // Materials
                        Items.NETHER_QUARTZ_ORE,
                        Items.QUARTZ,

                        // Regular
                        Items.QUARTZ_BLOCK,
                        Items.QUARTZ_STAIRS,
                        Items.QUARTZ_SLAB,

                        // Block Variants
                        Items.QUARTZ_PILLAR,
                        Items.QUARTZ_BRICKS,
                        Items.CHISELED_QUARTZ_BLOCK,

                        // Smooth
                        Items.SMOOTH_QUARTZ,
                        Items.SMOOTH_QUARTZ_SLAB,
                        Items.SMOOTH_QUARTZ_STAIRS
                )
        );
    }
}
