package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class LapisLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        Items.LAPIS_ORE,
                        Items.LAPIS_BLOCK,
                        Items.LAPIS_LAZULI,
                        Items.BLUE_DYE,
                        Items.EXPERIENCE_BOTTLE
                )
        );
    }
}

