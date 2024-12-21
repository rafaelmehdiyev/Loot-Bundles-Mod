package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class CoalLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        Items.COAL,
                        Items.COAL_BLOCK,
                        Items.CHARCOAL,
                        Items.COAL_ORE,
                        Items.TORCH
                )
        );
    }
}

