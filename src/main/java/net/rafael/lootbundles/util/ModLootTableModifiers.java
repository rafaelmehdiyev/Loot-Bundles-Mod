package net.rafael.lootbundles.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.rafael.lootbundles.item.ModItems;

import java.util.HashMap;
import java.util.Map;

public class ModLootTableModifiers {

    private static class LootBundleInfo {
        final Item lootBundle;
        final float chance;

        LootBundleInfo(Item lootBundle, float chance) {
            this.lootBundle = lootBundle;
            this.chance = chance;
        }
    }

    private static final Map<String, LootBundleInfo> MOB_LOOT_BUNDLES = new HashMap<>();

    static {
        MOB_LOOT_BUNDLES.put("zombie", new LootBundleInfo(ModItems.ZOMBIE_LOOT_BUNDLE, 0.25f));
        MOB_LOOT_BUNDLES.put("skeleton", new LootBundleInfo(ModItems.SKELETON_LOOT_BUNDLE, 0.30f));
        MOB_LOOT_BUNDLES.put("creeper", new LootBundleInfo(ModItems.CREEPER_LOOT_BUNDLE, 0.35f));
        MOB_LOOT_BUNDLES.put("spider", new LootBundleInfo(ModItems.SPIDER_LOOT_BUNDLE, 0.25f));
        MOB_LOOT_BUNDLES.put("enderman", new LootBundleInfo(ModItems.ENDERMAN_LOOT_BUNDLE, 0.20f));
        MOB_LOOT_BUNDLES.put("cow", new LootBundleInfo(ModItems.COW_LOOT_BUNDLE, 0.30f));
        MOB_LOOT_BUNDLES.put("pig", new LootBundleInfo(ModItems.PIG_LOOT_BUNDLE, 0.30f));
        MOB_LOOT_BUNDLES.put("sheep", new LootBundleInfo(ModItems.SHEEP_LOOT_BUNDLE, 0.25f));
        MOB_LOOT_BUNDLES.put("chicken", new LootBundleInfo(ModItems.CHICKEN_LOOT_BUNDLE, 0.40f));
        MOB_LOOT_BUNDLES.put("mooshroom", new LootBundleInfo(ModItems.MOOSHROOM_LOOT_BUNDLE, 0.20f));
    }

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && key.getValue().getNamespace().equals("minecraft") && key.getValue().getPath().startsWith("entities/")) {
                String mobName = key.getValue().getPath().substring("entities/".length());
                LootBundleInfo lootBundleInfo = MOB_LOOT_BUNDLES.get(mobName);
                if (lootBundleInfo != null) {
                    addLootPool(tableBuilder, lootBundleInfo.lootBundle, lootBundleInfo.chance);
                }
            }
        });
    }

    private static void addLootPool(LootTable.Builder tableBuilder, Item lootBundle, float chance) {
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))
                .with(ItemEntry.builder(lootBundle)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F))))
                .conditionally(RandomChanceLootCondition.builder(chance));
        tableBuilder.pool(poolBuilder.build());
    }
}