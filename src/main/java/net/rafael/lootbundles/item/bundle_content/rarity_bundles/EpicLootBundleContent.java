package net.rafael.lootbundles.item.bundle_content.rarity_bundles;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

import java.util.HashSet;
import java.util.stream.Collectors;

public class EpicLootBundleContent {
    public static HashSet<Item> getItems(){
        return Registries.ITEM.stream()
                .filter(item -> item.getDefaultStack().getRarity() == Rarity.EPIC)
                .collect(Collectors.toCollection(HashSet::new));
    }
}

