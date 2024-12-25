package net.rafael.lootbundles.item.bundle_content.passive_mob_bundles;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class SheepLootBundleContent {
    public static Map<Item, Integer> getItems() {
        Map<Item, Integer> items = new HashMap<>();

        // Wool items with equal weight
        items.put(Items.WHITE_WOOL, 3);
        items.put(Items.BLACK_WOOL, 1);
        items.put(Items.BLUE_WOOL, 1);
        items.put(Items.BROWN_WOOL, 1);
        items.put(Items.CYAN_WOOL, 1);
        items.put(Items.GRAY_WOOL, 1);
        items.put(Items.GREEN_WOOL, 1);
        items.put(Items.LIGHT_BLUE_WOOL, 1);
        items.put(Items.LIGHT_GRAY_WOOL, 1);
        items.put(Items.LIME_WOOL, 1);
        items.put(Items.MAGENTA_WOOL, 1);
        items.put(Items.ORANGE_WOOL, 1);
        items.put(Items.PINK_WOOL, 1);
        items.put(Items.PURPLE_WOOL, 1);
        items.put(Items.RED_WOOL, 1);
        items.put(Items.YELLOW_WOOL, 1);

        items.put(Items.COOKED_MUTTON, 3);
        items.put(Items.MUTTON, 5);

        return items;
    }
}
