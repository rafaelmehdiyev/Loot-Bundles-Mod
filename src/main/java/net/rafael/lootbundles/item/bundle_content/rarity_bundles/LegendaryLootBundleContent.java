package net.rafael.lootbundles.item.bundle_content.rarity_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Rarity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LegendaryLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Define a blacklist of items to exclude
        Set<Item> blacklist = new HashSet<>();

        // <editor-fold desc="Items">

        // Foods
        blacklist.add(Items.GOLDEN_CARROT);
        blacklist.add(Items.GOLDEN_APPLE);
        blacklist.add(Items.ENCHANTED_GOLDEN_APPLE);
        blacklist.add(Items.CHORUS_FRUIT);

        // Netherite Armor
        blacklist.add(Items.NETHERITE_HELMET);
        blacklist.add(Items.NETHERITE_CHESTPLATE);
        blacklist.add(Items.NETHERITE_LEGGINGS);
        blacklist.add(Items.NETHERITE_BOOTS);
        // Diamond Armor
        blacklist.add(Items.DIAMOND_HELMET);
        blacklist.add(Items.DIAMOND_CHESTPLATE);
        blacklist.add(Items.DIAMOND_LEGGINGS);
        blacklist.add(Items.DIAMOND_BOOTS);
        // Iron Armor
        blacklist.add(Items.IRON_HELMET);
        blacklist.add(Items.IRON_CHESTPLATE);
        blacklist.add(Items.IRON_LEGGINGS);
        blacklist.add(Items.IRON_BOOTS);
        // Chainmail Armor
        blacklist.add(Items.CHAINMAIL_HELMET);
        blacklist.add(Items.CHAINMAIL_CHESTPLATE);
        blacklist.add(Items.CHAINMAIL_LEGGINGS);
        blacklist.add(Items.CHAINMAIL_BOOTS);
        // Other Armors
        blacklist.add(Items.TURTLE_HELMET);
        blacklist.add(Items.DIAMOND_HORSE_ARMOR);
        blacklist.add(Items.GOLDEN_HORSE_ARMOR);
        blacklist.add(Items.IRON_HORSE_ARMOR);
        blacklist.add(Items.WOLF_ARMOR);

        // Netherite Tools
        blacklist.add(Items.NETHERITE_SWORD);
        blacklist.add(Items.NETHERITE_PICKAXE);
        blacklist.add(Items.NETHERITE_AXE);
        blacklist.add(Items.NETHERITE_SHOVEL);
        blacklist.add(Items.NETHERITE_HOE);
        // Diamond tools
        blacklist.add(Items.DIAMOND_SWORD);
        blacklist.add(Items.DIAMOND_PICKAXE);
        blacklist.add(Items.DIAMOND_AXE);
        blacklist.add(Items.DIAMOND_SHOVEL);
        blacklist.add(Items.DIAMOND_HOE);
        // Iron tools
        blacklist.add(Items.IRON_SWORD);
        blacklist.add(Items.IRON_PICKAXE);
        blacklist.add(Items.IRON_AXE);
        blacklist.add(Items.IRON_SHOVEL);
        blacklist.add(Items.IRON_HOE);
        // Golden tools
        blacklist.add(Items.GOLDEN_SWORD);
        blacklist.add(Items.GOLDEN_PICKAXE);
        blacklist.add(Items.GOLDEN_AXE);
        blacklist.add(Items.GOLDEN_SHOVEL);
        blacklist.add(Items.GOLDEN_HOE);
        // Buckets
        blacklist.add(Items.BUCKET);
        blacklist.add(Items.WATER_BUCKET);
        blacklist.add(Items.LAVA_BUCKET);
        blacklist.add(Items.MILK_BUCKET);
        blacklist.add(Items.AXOLOTL_BUCKET);
        blacklist.add(Items.PUFFERFISH_BUCKET);
        blacklist.add(Items.SALMON_BUCKET);
        blacklist.add(Items.COD_BUCKET);
        blacklist.add(Items.TROPICAL_FISH_BUCKET);
        blacklist.add(Items.POWDER_SNOW_BUCKET);
        // Other Tools
        blacklist.add(Items.DEBUG_STICK);
        blacklist.add(Items.ENCHANTED_BOOK);
        blacklist.add(Items.NAME_TAG);
        blacklist.add(Items.SADDLE);
        blacklist.add(Items.LEAD);
        blacklist.add(Items.RECOVERY_COMPASS);
        blacklist.add(Items.TOTEM_OF_UNDYING);
        blacklist.add(Items.SHIELD);

        // Materials
        blacklist.add(Items.BLAZE_POWDER);
        blacklist.add(Items.BLAZE_ROD);
        blacklist.add(Items.BREEZE_ROD);
        blacklist.add(Items.COCOA_BEANS);
        blacklist.add(Items.DIAMOND);
        blacklist.add(Items.DRAGON_BREATH);
        blacklist.add(Items.ECHO_SHARD);
        blacklist.add(Items.EMERALD);
        blacklist.add(Items.ENDER_EYE);
        blacklist.add(Items.GHAST_TEAR);
        blacklist.add(Items.GLISTERING_MELON_SLICE);
        blacklist.add(Items.GOLD_INGOT);
        blacklist.add(Items.GOLD_NUGGET);
        blacklist.add(Items.HEART_OF_THE_SEA);
        blacklist.add(Items.IRON_INGOT);
        blacklist.add(Items.MAGMA_CREAM);
        blacklist.add(Items.NAUTILUS_SHELL);
        blacklist.add(Items.NETHERITE_INGOT);
        blacklist.add(Items.NETHERITE_SCRAP);
        blacklist.add(Items.NETHER_STAR);
        blacklist.add(Items.PHANTOM_MEMBRANE);
        blacklist.add(Items.PRISMARINE_CRYSTALS);
        blacklist.add(Items.PRISMARINE_SHARD);
        blacklist.add(Items.POPPED_CHORUS_FRUIT);
        blacklist.add(Items.RAW_GOLD);
        blacklist.add(Items.RAW_IRON);
        blacklist.add(Items.SHULKER_SHELL);
        blacklist.add(Items.SLIME_BALL);
        blacklist.add(Items.ARMADILLO_SCUTE);
        blacklist.add(Items.TURTLE_SCUTE);
        blacklist.add(Items.TRIAL_KEY);
        blacklist.add(Items.OMINOUS_TRIAL_KEY);
        blacklist.add(Items.TRIAL_SPAWNER);
        blacklist.add(Items.VAULT);
        blacklist.add(Items.WIND_CHARGE);
        blacklist.add(Items.HEAVY_CORE);


        // Transportation Items
        blacklist.add(Items.COMMAND_BLOCK_MINECART);
        blacklist.add(Items.ELYTRA);

        // Potions
        blacklist.add(Items.POTION);
        blacklist.add(Items.SPLASH_POTION);
        blacklist.add(Items.LINGERING_POTION);

        // Mob Eggs
        blacklist.add(Items.ALLAY_SPAWN_EGG);
        blacklist.add(Items.ARMADILLO_SPAWN_EGG);
        blacklist.add(Items.AXOLOTL_SPAWN_EGG);
        blacklist.add(Items.BAT_SPAWN_EGG);
        blacklist.add(Items.BEE_SPAWN_EGG);
        blacklist.add(Items.BLAZE_SPAWN_EGG);
        blacklist.add(Items.BREEZE_SPAWN_EGG);
        blacklist.add(Items.BOGGED_SPAWN_EGG);
        blacklist.add(Items.CAT_SPAWN_EGG);
        blacklist.add(Items.CAMEL_SPAWN_EGG);
        blacklist.add(Items.CAVE_SPIDER_SPAWN_EGG);
        blacklist.add(Items.CHICKEN_SPAWN_EGG);
        blacklist.add(Items.COD_SPAWN_EGG);
        blacklist.add(Items.COW_SPAWN_EGG);
        blacklist.add(Items.CREEPER_SPAWN_EGG);
        blacklist.add(Items.DOLPHIN_SPAWN_EGG);
        blacklist.add(Items.DONKEY_SPAWN_EGG);
        blacklist.add(Items.DROWNED_SPAWN_EGG);
        blacklist.add(Items.ELDER_GUARDIAN_SPAWN_EGG);
        blacklist.add(Items.ENDERMAN_SPAWN_EGG);
        blacklist.add(Items.ENDERMITE_SPAWN_EGG);
        blacklist.add(Items.ENDER_DRAGON_SPAWN_EGG);
        blacklist.add(Items.EVOKER_SPAWN_EGG);
        blacklist.add(Items.FOX_SPAWN_EGG);
        blacklist.add(Items.FROG_SPAWN_EGG);
        blacklist.add(Items.GHAST_SPAWN_EGG);
        blacklist.add(Items.GLOW_SQUID_SPAWN_EGG);
        blacklist.add(Items.GOAT_SPAWN_EGG);
        blacklist.add(Items.GUARDIAN_SPAWN_EGG);
        blacklist.add(Items.HOGLIN_SPAWN_EGG);
        blacklist.add(Items.HORSE_SPAWN_EGG);
        blacklist.add(Items.HUSK_SPAWN_EGG);
        blacklist.add(Items.IRON_GOLEM_SPAWN_EGG);
        blacklist.add(Items.LLAMA_SPAWN_EGG);
        blacklist.add(Items.MAGMA_CUBE_SPAWN_EGG);
        blacklist.add(Items.MOOSHROOM_SPAWN_EGG);
        blacklist.add(Items.MULE_SPAWN_EGG);
        blacklist.add(Items.OCELOT_SPAWN_EGG);
        blacklist.add(Items.PANDA_SPAWN_EGG);
        blacklist.add(Items.PARROT_SPAWN_EGG);
        blacklist.add(Items.PHANTOM_SPAWN_EGG);
        blacklist.add(Items.PIG_SPAWN_EGG);
        blacklist.add(Items.PIGLIN_SPAWN_EGG);
        blacklist.add(Items.PIGLIN_BRUTE_SPAWN_EGG);
        blacklist.add(Items.PILLAGER_SPAWN_EGG);
        blacklist.add(Items.POLAR_BEAR_SPAWN_EGG);
        blacklist.add(Items.PUFFERFISH_SPAWN_EGG);
        blacklist.add(Items.RABBIT_SPAWN_EGG);
        blacklist.add(Items.RAVAGER_SPAWN_EGG);
        blacklist.add(Items.SALMON_SPAWN_EGG);
        blacklist.add(Items.TURTLE_SPAWN_EGG);
        blacklist.add(Items.SHEEP_SPAWN_EGG);
        blacklist.add(Items.SHULKER_SPAWN_EGG);
        blacklist.add(Items.SILVERFISH_SPAWN_EGG);
        blacklist.add(Items.SKELETON_HORSE_SPAWN_EGG);
        blacklist.add(Items.SKELETON_SPAWN_EGG);
        blacklist.add(Items.SLIME_SPAWN_EGG);
        blacklist.add(Items.SNOW_GOLEM_SPAWN_EGG);
        blacklist.add(Items.SNIFFER_EGG);
        blacklist.add(Items.SPIDER_SPAWN_EGG);
        blacklist.add(Items.SQUID_SPAWN_EGG);
        blacklist.add(Items.STRAY_SPAWN_EGG);
        blacklist.add(Items.STRIDER_SPAWN_EGG);
        blacklist.add(Items.TADPOLE_SPAWN_EGG);
        blacklist.add(Items.TRADER_LLAMA_SPAWN_EGG);
        blacklist.add(Items.TROPICAL_FISH_SPAWN_EGG);
        blacklist.add(Items.VEX_SPAWN_EGG);
        blacklist.add(Items.VILLAGER_SPAWN_EGG);
        blacklist.add(Items.VINDICATOR_SPAWN_EGG);
        blacklist.add(Items.WANDERING_TRADER_SPAWN_EGG);
        blacklist.add(Items.WARDEN_SPAWN_EGG);
        blacklist.add(Items.WITCH_SPAWN_EGG);
        blacklist.add(Items.WITHER_SKELETON_SPAWN_EGG);
        blacklist.add(Items.WITHER_SPAWN_EGG);
        blacklist.add(Items.WOLF_SPAWN_EGG);
        blacklist.add(Items.ZOGLIN_SPAWN_EGG);
        blacklist.add(Items.ZOMBIE_HORSE_SPAWN_EGG);
        blacklist.add(Items.ZOMBIE_SPAWN_EGG);
        blacklist.add(Items.ZOMBIE_VILLAGER_SPAWN_EGG);
        blacklist.add(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG);

        // Trims
        blacklist.add(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE);
        blacklist.add(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);

        // </editor-fold>

        // <editor-fold desc="Blocks">

        // Creative Blocks
        blacklist.add(Items.BARRIER);
        blacklist.add(Items.COMMAND_BLOCK);
        blacklist.add(Items.CHAIN_COMMAND_BLOCK);
        blacklist.add(Items.REPEATING_COMMAND_BLOCK);
        blacklist.add(Items.STRUCTURE_BLOCK);
        blacklist.add(Items.JIGSAW);
        blacklist.add(Items.BEDROCK);
        blacklist.add(Items.END_PORTAL_FRAME);
        blacklist.add(Items.STRUCTURE_VOID);

        // Dirt Blocks
        blacklist.add(Items.MYCELIUM);

        // Head Blocks
        blacklist.add(Items.PLAYER_HEAD);
        blacklist.add(Items.CREEPER_HEAD);
        blacklist.add(Items.ZOMBIE_HEAD);
        blacklist.add(Items.SKELETON_SKULL);
        blacklist.add(Items.WITHER_SKELETON_SKULL);

        // Ore and Minerals
        // Iron Blocks
        blacklist.add(Items.IRON_BLOCK);
        blacklist.add(Items.RAW_IRON_BLOCK);
        blacklist.add(Items.IRON_ORE);

// Gold Blocks
        blacklist.add(Items.GOLD_BLOCK);
        blacklist.add(Items.RAW_GOLD_BLOCK);
        blacklist.add(Items.DEEPSLATE_GOLD_ORE);
        blacklist.add(Items.GOLD_ORE);

// Diamond Blocks
        blacklist.add(Items.DEEPSLATE_DIAMOND_ORE);
        blacklist.add(Items.DIAMOND_BLOCK);
        blacklist.add(Items.DIAMOND_ORE);

// Emerald Blocks
        blacklist.add(Items.DEEPSLATE_EMERALD_ORE);
        blacklist.add(Items.EMERALD_BLOCK);
        blacklist.add(Items.EMERALD_ORE);

// Obsidian Blocks
        blacklist.add(Items.CRYING_OBSIDIAN);
        blacklist.add(Items.OBSIDIAN);


        // Mob Blocks
        blacklist.add(Items.SPAWNER);
        blacklist.add(Items.SCULK);
        blacklist.add(Items.SCULK_CATALYST);
        blacklist.add(Items.SCULK_SENSOR);
        blacklist.add(Items.SCULK_VEIN);

        // Nether Blocks
        blacklist.add(Items.NETHER_WART);
        blacklist.add(Items.NETHER_WART_BLOCK);
        blacklist.add(Items.NETHERITE_BLOCK);

        // End Blocks
        blacklist.add(Items.ENDER_CHEST);
        blacklist.add(Items.BLACK_SHULKER_BOX);
        blacklist.add(Items.BLUE_SHULKER_BOX);
        blacklist.add(Items.BROWN_SHULKER_BOX);
        blacklist.add(Items.CYAN_SHULKER_BOX);
        blacklist.add(Items.GRAY_SHULKER_BOX);
        blacklist.add(Items.GREEN_SHULKER_BOX);
        blacklist.add(Items.LIGHT_BLUE_SHULKER_BOX);
        blacklist.add(Items.LIGHT_GRAY_SHULKER_BOX);
        blacklist.add(Items.LIME_SHULKER_BOX);
        blacklist.add(Items.MAGENTA_SHULKER_BOX);
        blacklist.add(Items.ORANGE_SHULKER_BOX);
        blacklist.add(Items.PINK_SHULKER_BOX);
        blacklist.add(Items.PURPLE_SHULKER_BOX);
        blacklist.add(Items.RED_SHULKER_BOX);
        blacklist.add(Items.SHULKER_BOX);
        blacklist.add(Items.WHITE_SHULKER_BOX);
        blacklist.add(Items.YELLOW_SHULKER_BOX);

        // Crafting Blocks
        blacklist.add(Items.ENCHANTING_TABLE);

        // Other Blocks
        blacklist.add(Items.BEACON);
        blacklist.add(Items.CONDUIT);


        // </editor-fold>

        // Iterate through all registered items and add them to the map if they are not in the blacklist
        Registries.ITEM.stream()
                .filter(item -> !blacklist.contains(item)) // Exclude items in the blacklist
                .forEach(item -> items.put(item, 1)); // Assign a default weight of 1

        return items;
    }
}
