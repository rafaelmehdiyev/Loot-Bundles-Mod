package net.rafael.lootbundles.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class LootBundleItem extends Item {

    private final Map<Item, Integer> itemWeights; // Item and its weight
    private final int maxItemCount;

    private static final Random RANDOM = new Random();

    public LootBundleItem(Map<Item, Integer> itemWeights, int maxItemCount, Settings settings) {
        super(settings);
        this.itemWeights = itemWeights;
        this.maxItemCount = Math.min(maxItemCount, 5);
    }

    @Override
    public TypedActionResult<ItemStack> use(@NotNull World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            // Call the loot generation method and give items to the player
            giveLootToPlayer(player);

            // Remove one Loot Bundle from the player's hand
            player.getStackInHand(hand).decrement(1);
        }

        return TypedActionResult.success(player.getStackInHand(hand));
    }

    private void giveLootToPlayer(PlayerEntity player) {
        List<ItemStack> loot = getRandomLoot();
        for (ItemStack lootItem : loot) {
            player.giveItemStack(lootItem);
        }
    }

    private @NotNull List<ItemStack> getRandomLoot() {
        // Prepare a weighted list
        List<Item> weightedItems = new ArrayList<>();
        for (Map.Entry<Item, Integer> entry : itemWeights.entrySet()) {
            Item item = entry.getKey();
            int weight = entry.getValue();

            // Add the item to the list multiple times based on its weight
            for (int i = 0; i < weight; i++) {
                weightedItems.add(item);
            }
        }

        // Shuffle the weighted list for randomness
        Collections.shuffle(weightedItems, RANDOM);

        // Randomize the number of items to give
        int numItems = RANDOM.nextInt(maxItemCount) + 1;

        // Generate loot items
        List<ItemStack> lootItems = new ArrayList<>();
        for (int i = 0; i < numItems; i++) {
            // Pick a random item from the weighted list
            Item randomItem = weightedItems.get(RANDOM.nextInt(weightedItems.size()));

            // Check if the item is stackable
            boolean isStackable = randomItem.getMaxCount() > 1;

            // For stackable items, generate a random quantity between 1 and 10
            if (isStackable) {
                int quantity = RANDOM.nextInt(10) + 1;
                lootItems.add(new ItemStack(randomItem, quantity));
            } else {
                // For non-stackable items, add only 1 item
                lootItems.add(new ItemStack(randomItem, 1));
            }
        }

        return lootItems;
    }
}
