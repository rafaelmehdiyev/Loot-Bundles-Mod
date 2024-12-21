package net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class EndermanLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.ENDER_PEARL,
                        Items.ENDER_EYE
                )
        );
    }
}

