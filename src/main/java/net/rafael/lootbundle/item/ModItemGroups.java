package net.rafael.lootbundle.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rafael.lootbundle.RafaelsLootBundles;

public class ModItemGroups {

    public static final ItemGroup LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID,"loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels_loot_bundles.loot_bundles"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LOOT_BUNDLE);
                    })
                    .build());
    public static void registerItemGroups() {
        RafaelsLootBundles.LOGGER.info("Registering Item Groups for "+RafaelsLootBundles.MOD_ID);
    }
}
