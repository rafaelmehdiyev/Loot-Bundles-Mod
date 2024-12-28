package net.rafael.lootbundles.item.bundle_content.rarity_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EpicLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Define a blacklist of items to exclude
        Set<Item> blacklist = new HashSet<>();

        // <editor-fold desc="Items">

        // Foods
        blacklist.add(Items.ENCHANTED_GOLDEN_APPLE);

        // Other Tools
        blacklist.add(Items.DEBUG_STICK);

        // Transportation Items
        blacklist.add(Items.COMMAND_BLOCK_MINECART);

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

        // End Blocks
//        blacklist.add(Items.ENDER_CHEST);
//        blacklist.add(Items.BLACK_SHULKER_BOX);
//        blacklist.add(Items.BLUE_SHULKER_BOX);
//        blacklist.add(Items.BROWN_SHULKER_BOX);
//        blacklist.add(Items.CYAN_SHULKER_BOX);
//        blacklist.add(Items.GRAY_SHULKER_BOX);
//        blacklist.add(Items.GREEN_SHULKER_BOX);
//        blacklist.add(Items.LIGHT_BLUE_SHULKER_BOX);
//        blacklist.add(Items.LIGHT_GRAY_SHULKER_BOX);
//        blacklist.add(Items.LIME_SHULKER_BOX);
//        blacklist.add(Items.MAGENTA_SHULKER_BOX);
//        blacklist.add(Items.ORANGE_SHULKER_BOX);
//        blacklist.add(Items.PINK_SHULKER_BOX);
//        blacklist.add(Items.PURPLE_SHULKER_BOX);
//        blacklist.add(Items.RED_SHULKER_BOX);
//        blacklist.add(Items.SHULKER_BOX);
//        blacklist.add(Items.WHITE_SHULKER_BOX);
//        blacklist.add(Items.YELLOW_SHULKER_BOX);

        // Crafting Blocks
//        blacklist.add(Items.ENCHANTING_TABLE);

        // Other Blocks
//        blacklist.add(Items.BEACON);
//        blacklist.add(Items.CONDUIT);


        // </editor-fold>

        // Iterate through all registered items and add them to the map if they are not in the blacklist
        Registries.ITEM.stream()
                .filter(item -> !blacklist.contains(item)) // Exclude items in the blacklist
                .forEach(item -> items.put(item, 1)); // Assign a default weight of 1

        return items;
    }
}
