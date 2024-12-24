package net.rafael.lootbundles.item.bundle_content.ore_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class RedstoneLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Materials with weights
        items.put(Items.REDSTONE_ORE, 5);         // Rare ore found deep in the world
        items.put(Items.REDSTONE_BLOCK, 4);       // Compact redstone storage block
        items.put(Items.REDSTONE, 6);             // Basic redstone dust
        items.put(Items.REDSTONE_TORCH, 3);       // Redstone powered light source

        // Tools and mechanisms with weights
        items.put(Items.CLOCK, 2);                // Clock, useful for time tracking
        items.put(Items.COMPASS, 2);              // Compass, helps in navigation
        items.put(Items.CRAFTER, 1);              // Crafting tool
        items.put(Items.DETECTOR_RAIL, 3);        // Rail detector used in minecart systems
        items.put(Items.DISPENSER, 3);            // Dispenser for automating actions
        items.put(Items.OBSERVER, 4);             // Observer used for detecting block changes
        items.put(Items.PISTON, 3);               // Piston for mechanical movement
        items.put(Items.REDSTONE_LAMP, 3);        // Lamp powered by redstone
        items.put(Items.REPEATER, 2);             // Repeater used to extend redstone signals
        items.put(Items.COMPARATOR, 2);           // Comparator for advanced redstone logic

        return items;
    }
}
