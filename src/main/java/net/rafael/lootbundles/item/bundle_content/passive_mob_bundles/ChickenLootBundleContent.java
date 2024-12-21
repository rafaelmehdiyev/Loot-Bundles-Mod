package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class ChickenLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.CHICKEN,
                        Items.COOKED_CHICKEN,
                        Items.FEATHER,
                        Items.EGG
                )
        );
    }
}


