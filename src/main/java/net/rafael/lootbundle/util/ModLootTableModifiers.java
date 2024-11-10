package net.rafael.lootbundle.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.rafael.lootbundle.item.ModItems;

import java.util.Random;

public class ModLootTableModifiers {

    // Method to modify loot tables
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            // Check if the source is built-in and if the loot table is for an entity (mob)
            if (source.isBuiltin() && key.getValue().getNamespace().equals("minecraft") && key.getValue().getPath().startsWith("entities/")) {

                // Random chance for loot bundle drop (25% chance)
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F)) // 1 roll for each mob
                        .with(ItemEntry.builder(ModItems.LOOT_BUNDLE)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F))) // 1 loot bundle
                                .conditionally(RandomChanceLootCondition.builder(0.25f))); // 25% chance for loot bundle drop

                // Add the loot pool to the loot table
                tableBuilder.pool(poolBuilder.build());
            }
        });
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
                    // Check if the source is built-in and if the loot table is for a chest
                    if (source.isBuiltin() && key.getValue().getNamespace().equals("minecraft")) {
                        // Check if the loot table is related to a chest, like mineshaft, village, etc.
                        if (key.getValue().getPath().startsWith("chests/")) {

                            // Create a new loot pool for the loot bundle
                            LootPool.Builder poolBuilder = LootPool.builder()
                                    .rolls(ConstantLootNumberProvider.create(1.0F)) // 1 roll for each chest
                                    .with(ItemEntry.builder(ModItems.LOOT_BUNDLE)
                                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F))) // 1 loot bundle
                                            .conditionally(RandomChanceLootCondition.builder(0.25f))); // 25% chance for loot bundle drop

                            // Add the loot pool to the chest loot table
                            tableBuilder.pool(poolBuilder.build());
                        }
                    }
                }
        );
    }


}
