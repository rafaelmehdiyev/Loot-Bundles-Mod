package net.rafael.lootbundles.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rafael.lootbundles.RafaelsLootBundles;

import java.util.Collection;
import java.util.List;

public class ModItemGroups {

    // <editor-fold desc="Ore Bundles">
    public static final Collection<ItemStack> Ore_Bundles = List.of(
            new ItemStack(ModItems.COAL_LOOT_BUNDLE),
            new ItemStack(ModItems.COPPER_LOOT_BUNDLE),
            new ItemStack(ModItems.IRON_LOOT_BUNDLE),
            new ItemStack(ModItems.LAPIS_LOOT_BUNDLE),
            new ItemStack(ModItems.GOLD_LOOT_BUNDLE),
            new ItemStack(ModItems.NETHER_GOLD_LOOT_BUNDLE),
            new ItemStack(ModItems.REDSTONE_LOOT_BUNDLE),
            new ItemStack(ModItems.DIAMOND_LOOT_BUNDLE),
            new ItemStack(ModItems.EMERALD_LOOT_BUNDLE),
            new ItemStack(ModItems.ANCIENT_DEBRIS_LOOT_BUNDLE),
            new ItemStack(ModItems.QUARTZ_LOOT_BUNDLE)
    );
    // </editor-fold>

    // <editor-fold desc="Rarity Bundles">
    public static final Collection<ItemStack> Rarity_Bundles = List.of(
            new ItemStack(ModItems.COMMON_LOOT_BUNDLE),
            new ItemStack(ModItems.UNCOMMON_LOOT_BUNDLE),
            new ItemStack(ModItems.RARE_LOOT_BUNDLE),
            new ItemStack(ModItems.EPIC_LOOT_BUNDLE),
            new ItemStack(ModItems.LEGENDARY_LOOT_BUNDLE)
    );
    // </editor-fold>

    // <editor-fold desc="Passive Mob Bundles">
    public static final Collection<ItemStack> Passive_Mob_Bundles = List.of(
            new ItemStack(ModItems.COW_LOOT_BUNDLE),
            new ItemStack(ModItems.PIG_LOOT_BUNDLE),
            new ItemStack(ModItems.SHEEP_LOOT_BUNDLE),
            new ItemStack(ModItems.CHICKEN_LOOT_BUNDLE),
            new ItemStack(ModItems.MOOSHROOM_LOOT_BUNDLE)
    );
    // </editor-fold>

    // <editor-fold desc="Neutral Mob Loot Bundle">
    public static final Collection<ItemStack> Neutral_Mob_Bundles = List.of(
            new ItemStack(ModItems.ENDERMAN_LOOT_BUNDLE),
            new ItemStack(ModItems.SPIDER_LOOT_BUNDLE),
            new ItemStack(ModItems.DROWNED_LOOT_BUNDLE)
    );
    // </editor-fold>

    // <editor-fold desc="Hostile Mob Loot Bundle">
    public static final Collection<ItemStack> Hostile_Mob_Bundles = List.of(
            new ItemStack(ModItems.ZOMBIE_LOOT_BUNDLE),
            new ItemStack(ModItems.SKELETON_LOOT_BUNDLE),
            new ItemStack(ModItems.CREEPER_LOOT_BUNDLE),
            new ItemStack(ModItems.BLAZE_LOOT_BUNDLE)
    );
    // </editor-fold>

    public static final ItemGroup LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID, "loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.DIAMOND_LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels-loot-bundles.loot_bundles"))
                    .entries((displayContext, entries) -> {
                        entries.addAll(Ore_Bundles);
                        entries.addAll(Rarity_Bundles);
                        entries.addAll(Passive_Mob_Bundles);
                        entries.addAll(Neutral_Mob_Bundles);
                        entries.addAll(Hostile_Mob_Bundles);
                    })
                    .build());

    public static final ItemGroup ORE_LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID, "ore_loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COAL_LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels-loot-bundles.ore_loot_bundles"))
                    .entries((displayContext, entries) -> entries.addAll(Ore_Bundles))
                    .build());

    public static final ItemGroup RARITY_LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID, "rarity_loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COMMON_LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels-loot-bundles.rarity_loot_bundles"))
                    .entries((displayContext, entries) -> entries.addAll(Rarity_Bundles))
                    .build());

    public static final ItemGroup PASSIVE_MOB_LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID, "passive_mob_loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COW_LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels-loot-bundles.passive_mob_loot_bundles"))
                    .entries((displayContext, entries) -> entries.addAll(Passive_Mob_Bundles))
                    .build());

    public static final ItemGroup NEUTRAL_MOB_LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID, "neutral_mob_loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ENDERMAN_LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels-loot-bundles.neutral_mob_loot_bundles"))
                    .entries((displayContext, entries) -> entries.addAll(Neutral_Mob_Bundles))
                    .build());

    public static final ItemGroup HOSTILE_MOB_LOOT_BUNDLES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaelsLootBundles.MOD_ID, "hostile_mob_loot_bundles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ZOMBIE_LOOT_BUNDLE))
                    .displayName(Text.translatable("itemgroup.rafaels-loot-bundles.hostile_mob_loot_bundles"))
                    .entries((displayContext, entries) -> entries.addAll(Hostile_Mob_Bundles))
                    .build());

    public static void registerItemGroups() {
        RafaelsLootBundles.LOGGER.info("Registering Item Groups for " + RafaelsLootBundles.MOD_ID);
    }
}