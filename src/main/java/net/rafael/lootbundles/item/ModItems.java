package net.rafael.lootbundles.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rafael.lootbundles.RafaelsLootBundles;
import net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles.CreeperLootBundleContent;
import net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles.SkeletonLootBundleContent;
import net.rafael.lootbundles.item.bundle_content.hostile_mob_bundles.ZombieLootBundleContent;
import net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles.EndermanLootBundleContent;
import net.rafael.lootbundles.item.bundle_content.neutral_mob_bundles.SpiderLootBundleContent;
import net.rafael.lootbundles.item.bundle_content.ore_bundles.*;
import net.rafael.lootbundles.item.bundle_content.rarity_bundles.*;
import net.rafael.lootbundles.item.bundle_content.passive_mob_bundles.*;
import net.rafael.lootbundles.item.custom.LootBundleItem;

public class ModItems {

    // <editor-fold desc="Ore Bundles">

    public static final Item COAL_LOOT_BUNDLE = registerItem("coal_loot_bundle",
            new LootBundleItem(CoalLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item COPPER_LOOT_BUNDLE = registerItem("copper_loot_bundle",
            new LootBundleItem(CopperLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item IRON_LOOT_BUNDLE = registerItem("iron_loot_bundle",
            new LootBundleItem(IronLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item LAPIS_LOOT_BUNDLE = registerItem("lapis_loot_bundle",
            new LootBundleItem(LapisLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item GOLD_LOOT_BUNDLE = registerItem("gold_loot_bundle",
            new LootBundleItem(GoldLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item NETHER_GOLD_LOOT_BUNDLE = registerItem("nether_gold_loot_bundle",
            new LootBundleItem(GoldLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item REDSTONE_LOOT_BUNDLE = registerItem("redstone_loot_bundle",
            new LootBundleItem(RedstoneLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item DIAMOND_LOOT_BUNDLE = registerItem("diamond_loot_bundle",
            new LootBundleItem(DiamondLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item EMERALD_LOOT_BUNDLE = registerItem("emerald_loot_bundle",
            new LootBundleItem(EmeraldLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item ANCIENT_DEBRIS_LOOT_BUNDLE = registerItem("ancient_debris_loot_bundle",
            new LootBundleItem(AncientDebrisLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item QUARTZ_LOOT_BUNDLE = registerItem("quartz_loot_bundle",
            new LootBundleItem(QuartzLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    // </editor-fold>

    // <editor-fold desc="Rarity Bundles">

    public static final Item COMMON_LOOT_BUNDLE = registerItem("common_loot_bundle",
            new LootBundleItem(CommonLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item UNCOMMON_LOOT_BUNDLE = registerItem("uncommon_loot_bundle",
            new LootBundleItem(UncommonLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item RARE_LOOT_BUNDLE = registerItem("rare_loot_bundle",
            new LootBundleItem(RareLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item EPIC_LOOT_BUNDLE = registerItem("epic_loot_bundle",
            new LootBundleItem(EpicLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item LEGENDARY_LOOT_BUNDLE = registerItem("legendary_loot_bundle",
            new LootBundleItem(LegendaryLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));


    // </editor-fold>

    // <editor-fold desc="Passive Mob Bundles">

    public static final Item CHICKEN_LOOT_BUNDLE = registerItem("chicken_loot_bundle",
            new LootBundleItem(ChickenLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item COW_LOOT_BUNDLE = registerItem("cow_loot_bundle",
            new LootBundleItem(CowLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item PIG_LOOT_BUNDLE = registerItem("pig_loot_bundle",
            new LootBundleItem(PigLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item SHEEP_LOOT_BUNDLE = registerItem("sheep_loot_bundle",
            new LootBundleItem(SheepLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item MOOSHROOM_LOOT_BUNDLE = registerItem("mooshroom_loot_bundle",
            new LootBundleItem(MooshroomLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    // </editor-fold>

    // <editor-fold desc="Neutral Mob Bundles">

    public static final Item ENDERMAN_LOOT_BUNDLE = registerItem("enderman_loot_bundle",
            new LootBundleItem(EndermanLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item SPIDER_LOOT_BUNDLE = registerItem("spider_loot_bundle",
            new LootBundleItem(SpiderLootBundleContent.getItems(),2,new Item.Settings().maxCount(16)));

    // </editor-fold>

    // <editor-fold desc="Hostile Mob Bundles">

    public static final Item ZOMBIE_LOOT_BUNDLE = registerItem("zombie_loot_bundle",
            new LootBundleItem(ZombieLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item SKELETON_LOOT_BUNDLE = registerItem("skeleton_loot_bundle",
            new LootBundleItem(SkeletonLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    public static final Item CREEPER_LOOT_BUNDLE = registerItem("creeper_loot_bundle",
            new LootBundleItem(CreeperLootBundleContent.getItems(),5,new Item.Settings().maxCount(16)));

    // </editor-fold>

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RafaelsLootBundles.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RafaelsLootBundles.LOGGER.info("Registering Mod Items for "+RafaelsLootBundles.MOD_ID );
    }
}
