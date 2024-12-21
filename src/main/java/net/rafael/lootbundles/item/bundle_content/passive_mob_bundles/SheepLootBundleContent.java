package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class SheepLootBundleContent {
    public static HashSet<Item> getItems() {
        return new HashSet<>(
                Set.of(
                        Items.WHITE_WOOL,
                        Items.BLACK_WOOL,
                        Items.BLUE_WOOL,
                        Items.BROWN_WOOL,
                        Items.CYAN_WOOL,
                        Items.GRAY_WOOL,
                        Items.GREEN_WOOL,
                        Items.LIGHT_BLUE_WOOL,
                        Items.LIGHT_GRAY_WOOL,
                        Items.LIME_WOOL,
                        Items.MAGENTA_WOOL,
                        Items.ORANGE_WOOL,
                        Items.PINK_WOOL,
                        Items.PURPLE_WOOL,
                        Items.RED_WOOL,
                        Items.YELLOW_WOOL,
                        Items.COOKED_MUTTON,
                        Items.MUTTON
                )
        );
    }
}


