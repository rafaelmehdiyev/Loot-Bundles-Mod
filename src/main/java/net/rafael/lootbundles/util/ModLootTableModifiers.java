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

    // Stores loot bundle information for both mobs and chests
    private static final Map<String, LootBundleInfo> ENTITY_LOOT_BUNDLES = new HashMap<>();
    private static final Map<String, LootBundleInfo> CHEST_LOOT_BUNDLES = new HashMap<>();
    private static final Map<String, LootBundleInfo> ORE_LOOT_BUNDLES = new HashMap<>();

    static {

        //<editor-fold desc="Entity Bundles">
        registerEntityLoot("zombie", ModItems.ZOMBIE_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("skeleton", ModItems.SKELETON_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("creeper", ModItems.CREEPER_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("blaze", ModItems.BLAZE_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("spider", ModItems.SPIDER_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("enderman", ModItems.ENDERMAN_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("drowned", ModItems.DROWNED_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("cow", ModItems.COW_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("pig", ModItems.PIG_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("sheep", ModItems.SHEEP_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("chicken", ModItems.CHICKEN_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("mooshroom", ModItems.MOOSHROOM_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("axolotl", ModItems.AXOLOTL_LOOT_BUNDLE, 0.25f);
        registerEntityLoot("ender_dragon", ModItems.LEGENDARY_LOOT_BUNDLE, 1.0f);
        registerEntityLoot("wither", ModItems.LEGENDARY_LOOT_BUNDLE, 1.0f);
        registerEntityLoot("iron_golem", ModItems.IRON_LOOT_BUNDLE, 0.25f);
        //</editor-fold>

        //<editor-fold desc="Ore Bundles">

        registerOreLoot("coal_ore", ModItems.COAL_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_coal_ore", ModItems.COAL_LOOT_BUNDLE, 0.30f);
        registerOreLoot("copper_ore", ModItems.COPPER_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_copper_ore", ModItems.COPPER_LOOT_BUNDLE, 0.30f);
        registerOreLoot("iron_ore", ModItems.IRON_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_iron_ore", ModItems.IRON_LOOT_BUNDLE, 0.30f);
        registerOreLoot("lapis_ore", ModItems.LAPIS_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_lapis_ore", ModItems.LAPIS_LOOT_BUNDLE, 0.30f);
        registerOreLoot("gold_ore", ModItems.GOLD_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_gold_ore", ModItems.GOLD_LOOT_BUNDLE, 0.30f);
        registerOreLoot("nether_gold_ore", ModItems.NETHER_GOLD_LOOT_BUNDLE, 0.30f);
        registerOreLoot("redstone_ore", ModItems.REDSTONE_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_redstone_ore", ModItems.REDSTONE_LOOT_BUNDLE, 0.30f);
        registerOreLoot("diamond_ore", ModItems.DIAMOND_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_diamond_ore", ModItems.DIAMOND_LOOT_BUNDLE, 0.30f);
        registerOreLoot("emerald_ore", ModItems.EMERALD_LOOT_BUNDLE, 0.30f);
        registerOreLoot("deepslate_emerald_ore", ModItems.EMERALD_LOOT_BUNDLE, 0.30f);
        registerOreLoot("ancient_debris", ModItems.ANCIENT_DEBRIS_LOOT_BUNDLE, 0.20f);
        registerOreLoot("quartz_ore", ModItems.QUARTZ_LOOT_BUNDLE, 0.30f);


        //</editor-fold>

        //<editor-fold desc="Treasure Bundles">

        // Register Common Loot Bundles
        registerChestLoot("igloo_chest", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("abandoned_mineshaft", ModItems.COMMON_LOOT_BUNDLE, 0.40f);
        registerChestLoot("ruined_portal", ModItems.COMMON_LOOT_BUNDLE, 0.18f);
        registerChestLoot("shipwreck_map", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("shipwreck_supply", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("spawn_bonus_chest", ModItems.COMMON_LOOT_BUNDLE, 0.25f);
        registerChestLoot("underwater_ruin_small", ModItems.COMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("underwater_ruin_big", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("buried_treasure", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("pillager_outpost", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("jungle_temple", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("simple_dungeon", ModItems.COMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("stronghold_corridor", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("stronghold_crossing", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("stronghold_library", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_armorer", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_butcher", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_cartographer", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_desert_house", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_fisher", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_fletcher", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_mason", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_plains_house", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_savanna_house", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_shepherd", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_snowy_house", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_taiga_house", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_tannery", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_temple", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_toolsmith", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("village/village_weaponsmith", ModItems.COMMON_LOOT_BUNDLE, 0.30f);
        registerChestLoot("trial_chambers/supply", ModItems.COMMON_LOOT_BUNDLE, 0.20f);


// Register Uncommon Loot Bundles
        registerChestLoot("abandoned_mineshaft", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("ancient_city_ice_box", ModItems.UNCOMMON_LOOT_BUNDLE, 0.12f);
        registerChestLoot("bastion_hoglin_stable", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("bastion_other", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("desert_pyramid", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("jungle_temple", ModItems.UNCOMMON_LOOT_BUNDLE, 0.12f);
        registerChestLoot("pillager_outpost", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("shipwreck_supply", ModItems.UNCOMMON_LOOT_BUNDLE, 0.12f);
        registerChestLoot("underwater_ruin_big", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("buried_treasure", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("nether_bridge", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("shipwreck_treasure", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("shipwreck_map", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("simple_dungeon", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);
        registerChestLoot("stronghold_corridor", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("stronghold_crossing", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("stronghold_library", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_armor", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_armorer", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_butcher", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_cartographer", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_desert_house", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_fisher", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_fletcher", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_mason", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_plains_house", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_savanna_house", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_shepherd", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_snowy_house", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_taiga_house", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_tannery", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_temple", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_toolsmith", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("village/village_weaponsmith", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("trial_chambers/corridor", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("trial_chambers/entrance", ModItems.UNCOMMON_LOOT_BUNDLE, 0.20f);
        registerChestLoot("trial_chambers/intersection", ModItems.UNCOMMON_LOOT_BUNDLE, 0.40f);
        registerChestLoot("trial_chambers/intersection_barrel", ModItems.UNCOMMON_LOOT_BUNDLE, 0.35f);
        registerChestLoot("trial_chambers/supply", ModItems.UNCOMMON_LOOT_BUNDLE, 0.15f);

// Register Rare Loot Bundles
        registerChestLoot("abandoned_mineshaft", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("simple_dungeon", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("ancient_city", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("bastion_bridge", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("bastion_hoglin_stable", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("bastion_other", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("nether_bridge", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("shipwreck_treasure", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("woodland_mansion", ModItems.RARE_LOOT_BUNDLE, 0.15f);
        registerChestLoot("desert_pyramid", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("stronghold_corridor", ModItems.RARE_LOOT_BUNDLE, 0.15f);
        registerChestLoot("stronghold_crossing", ModItems.RARE_LOOT_BUNDLE, 0.15f);
        registerChestLoot("stronghold_library", ModItems.RARE_LOOT_BUNDLE, 0.15f);
        registerChestLoot("underwater_ruin_big", ModItems.RARE_LOOT_BUNDLE, 0.10f);
        registerChestLoot("trial_chambers/intersection", ModItems.RARE_LOOT_BUNDLE, 0.30f);
        registerChestLoot("trial_chambers/intersection_barrel", ModItems.RARE_LOOT_BUNDLE, 0.25f);


// Register Epic Loot Bundles
        registerChestLoot("bastion_treasure", ModItems.EPIC_LOOT_BUNDLE, 0.15f);
        registerChestLoot("ancient_city", ModItems.EPIC_LOOT_BUNDLE, 0.10f);
        registerChestLoot("end_city_treasure", ModItems.EPIC_LOOT_BUNDLE, 0.15f);
        registerChestLoot("stronghold_corridor", ModItems.EPIC_LOOT_BUNDLE, 0.15f);
        registerChestLoot("stronghold_crossing", ModItems.EPIC_LOOT_BUNDLE, 0.15f);
        registerChestLoot("stronghold_library", ModItems.EPIC_LOOT_BUNDLE, 0.15f);
        registerChestLoot("woodland_mansion", ModItems.EPIC_LOOT_BUNDLE, 0.10f);
        registerChestLoot("trial_chambers/intersection", ModItems.EPIC_LOOT_BUNDLE, 0.20f);

        // Register Legendary Loot Bundles
        registerChestLoot("end_city_treasure", ModItems.LEGENDARY_LOOT_BUNDLE, 0.10f);
        //</editor-fold>
    }

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (!source.isBuiltin() || !key.getValue().getNamespace().equals("minecraft")) return;

            String path = key.getValue().getPath();
            LootBundleInfo lootInfo = null;

            if (path.startsWith("entities/")) {
                lootInfo = ENTITY_LOOT_BUNDLES.get(path.substring("entities/".length()));
            } else if (path.startsWith("chests/")) {
                lootInfo = CHEST_LOOT_BUNDLES.get(path.substring("chests/".length()));
            } else if (path.startsWith("blocks/")) {
                lootInfo = ORE_LOOT_BUNDLES.get(path.substring("blocks/".length()));
            }

            if (lootInfo != null) {
                addLootPool(tableBuilder, lootInfo.lootBundle, lootInfo.chance);
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

    private static void registerEntityLoot(String entityName, Item lootBundle, float chance) {
        ENTITY_LOOT_BUNDLES.put(entityName, new LootBundleInfo(lootBundle, chance));
    }

    private static void registerChestLoot(String chestName, Item lootBundle, float chance) {
        CHEST_LOOT_BUNDLES.put(chestName, new LootBundleInfo(lootBundle, chance));
    }

    private static void registerOreLoot(String oreName, Item lootBundle, float chance) {
        ORE_LOOT_BUNDLES.put(oreName, new LootBundleInfo(lootBundle, chance));
    }

    // Simple data holder record
    private record LootBundleInfo(Item lootBundle, float chance) { }
}
