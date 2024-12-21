package net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class CreeperLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.GUNPOWDER,
                        Items.TNT
                )
        );
    }
}
