package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class AncientDebrisLootBundleContent {
    public static HashSet<Item> getItems(){
        return new HashSet<>(
                Set.of(
                        Items.ANCIENT_DEBRIS,
                        Items.NETHERITE_SCRAP,
                        Items.NETHERITE_INGOT,
                        Items.NETHERITE_BLOCK,
                        Items.NETHERITE_HELMET,
                        Items.NETHERITE_CHESTPLATE,
                        Items.NETHERITE_LEGGINGS,
                        Items.NETHERITE_BOOTS,
                        Items.NETHERITE_SWORD,
                        Items.NETHERITE_SHOVEL,
                        Items.NETHERITE_PICKAXE,
                        Items.NETHERITE_AXE,
                        Items.NETHERITE_HOE
                        
                )
        );
    }
}
