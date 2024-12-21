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

    public LootBundleItem(Set<Item> itemList,int maxItemCount,Settings settings) {
        super(settings);
        this.itemList = itemList;
        this.maxItemCount = maxItemCount;
    }

    private final Set<Item> itemList;
    private final int maxItemCount;


    // A static Random object for better performance (one instance for the entire class)
    private static final Random RANDOM = new Random();


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

    // Method to give loot to the player
    private void giveLootToPlayer(PlayerEntity player) {
        // Get a random list of loot items
        List<ItemStack> loot = getRandomLoot();

        // Give each item to the player
        for (ItemStack lootItem : loot) {
            player.giveItemStack(lootItem);
        }
    }

    private @NotNull List<ItemStack> getRandomLoot() {
        List<Item> allItems = new ArrayList<>(itemList.stream().toList());
        Collections.shuffle(allItems, RANDOM); // Shuffle the list to ensure randomness

        // Randomize the number of items to give, for example between 1 and maxItemCount
        int numItems = RANDOM.nextInt(maxItemCount) + 1;

        // Get the first 'numItems' from the shuffled list
        List<ItemStack> lootItems = new ArrayList<>();
        for (int i = 0; i < numItems; i++) {
            Item randomItem = allItems.get(i);

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
