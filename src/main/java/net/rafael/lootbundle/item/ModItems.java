package net.rafael.lootbundle.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rafael.lootbundle.RafaelsLootBundles;
import net.rafael.lootbundle.item.custom.LootBundleItem;

public class ModItems {

    public static final Item LOOT_BUNDLE = registerItem("loot_bundle",
            new LootBundleItem(new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RafaelsLootBundles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RafaelsLootBundles.LOGGER.info("Registering Mod Items for "+RafaelsLootBundles.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
