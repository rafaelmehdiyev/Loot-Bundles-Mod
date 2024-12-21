package net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class SpiderLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.STRING,
                        Items.SPIDER_EYE,
                        Items.FERMENTED_SPIDER_EYE,
                        Items.COBWEB
                )
        );
    }
}
