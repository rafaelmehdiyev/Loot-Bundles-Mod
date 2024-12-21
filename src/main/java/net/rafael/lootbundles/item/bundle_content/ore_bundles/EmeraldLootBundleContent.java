package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class EmeraldLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        // Materials
                        Items.EMERALD_ORE,
                        Items.EMERALD,
                        Items.EMERALD_BLOCK
                )
        );
    }
}


