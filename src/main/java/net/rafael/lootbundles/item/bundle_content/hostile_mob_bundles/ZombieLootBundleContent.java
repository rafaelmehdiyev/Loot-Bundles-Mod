package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class ZombieLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.ROTTEN_FLESH,
                        Items.IRON_INGOT,
                        Items.CARROT,
                        Items.POTATO
                )
        );
    }
}

