package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class RedstoneLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        Items.REDSTONE_ORE,
                        Items.REDSTONE_BLOCK,
                        Items.REDSTONE,
                        Items.REDSTONE_TORCH,

                        Items.CLOCK,
                        Items.COMPASS,
                        Items.CRAFTER,
                        Items.DETECTOR_RAIL,
                        Items.DISPENSER,
                        Items.OBSERVER,
                        Items.PISTON,
                        Items.REDSTONE_LAMP,
                        Items.REPEATER,
                        Items.COMPARATOR
                )
        );
    }
}
