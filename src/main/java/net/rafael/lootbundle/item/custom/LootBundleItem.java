package net.rafael.lootbundle.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.*;

public class LootBundleItem extends Item {

    // A static Random object for better performance (one instance for the entire class)
    private static final Random RANDOM = new Random();

    // Set of blacklisted items
    private static final Set<Item> BLACKLIST = new HashSet<>();

    static {
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "barrier")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "structure_void")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "command_block")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "jigsaw")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "bedrock")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "spawn_egg")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "music_disc_13")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "totem_of_undying")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "elytra")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "shulker_box")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "instant_health")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "splash_potion_of_harming")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "lingering_potion")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "ender_chest")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "nether_star")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "wither_skeleton_skull")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "knowledge_book")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "recovery_compass")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "respawn_anchor")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "end_portal_frame")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "light")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "dragon_egg")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "beacon")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "heart_of_the_sea")));

        // Adding armor trims
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_sentry")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_dune")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_vex")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_coast")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_rib")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_shaper")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_tide")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_wild")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_eye")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_snaketail")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_dagger")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_pattern_raiser")));

// Adding trim materials (examples for the material types)
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_diamond")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_netherite")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_gold")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_iron")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_lapis")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_redstone")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_emerald")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "armor_trim_material_quartz")));

        // Adding Netherite Tools and Ancient Debris
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "netherite_ingot")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "ancient_debris")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "netherite_sword")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "netherite_pickaxe")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "netherite_axe")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "netherite_shovel")));
        BLACKLIST.add(Registries.ITEM.get(Identifier.of("minecraft", "netherite_hoe")));
    }


    public LootBundleItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            // Call the loot generation method and give items to the player
            giveLootToPlayer(player);

            // Remove one Loot Bundle from the player's hand
            player.getStackInHand(hand).decrement(1);
        }

        return TypedActionResult.success(player.getStackInHand(hand));
    }

    // Method to give loot to the player
    private void giveLootToPlayer(PlayerEntity player) {
        // Get a random list of loot items
        List<ItemStack> loot = getRandomLoot();

        // Give each item to the player
        for (ItemStack lootItem : loot) {
            player.giveItemStack(lootItem);
        }
    }

    private List<ItemStack> getRandomLoot() {
        List<Item> allItems = new ArrayList<>(Registries.ITEM.stream().toList());
        Collections.shuffle(allItems, RANDOM); // Shuffle the list to ensure randomness

        // Randomize the number of items to give, for example between 1 and 5
        int numItems = RANDOM.nextInt(5) + 1; // Random number between 1 and 5

        // Get the first 'numItems' from the shuffled list
        List<ItemStack> lootItems = new ArrayList<>();
        for (int i = 0; i < numItems; i++) {
            Item randomItem = allItems.get(i);

            // Skip blacklisted items
            if (BLACKLIST.contains(randomItem)) {
                continue;
            }

            // Check if the item is stackable
            boolean isStackable = randomItem.getMaxCount() > 1;

            // For stackable items, we generate a random quantity between 1 and 10
            if (isStackable) {
                int quantity = RANDOM.nextInt(10) + 1; // Random quantity between 1 and 10
                lootItems.add(new ItemStack(randomItem, quantity));
            } else {
                // For non-stackable items, we add only 1 item (no quantity variation)
                lootItems.add(new ItemStack(randomItem, 1));
            }
        }

        return lootItems;
    }

}
