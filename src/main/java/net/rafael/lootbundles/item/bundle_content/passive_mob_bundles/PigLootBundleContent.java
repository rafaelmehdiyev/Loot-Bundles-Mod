package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class PigLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.PORKCHOP,
                        Items.COOKED_PORKCHOP,
                        Items.CARROT_ON_A_STICK,
                        Items.CARROT
                )
        );
    }
}
