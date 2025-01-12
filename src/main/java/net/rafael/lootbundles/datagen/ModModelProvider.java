package net.rafael.lootbundles.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.rafael.lootbundles.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COAL_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_GOLD_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_DEBRIS_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUARTZ_LOOT_BUNDLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COMMON_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNCOMMON_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RARE_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EPIC_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEGENDARY_LOOT_BUNDLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COW_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIG_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHEEP_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSHROOM_LOOT_BUNDLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERMAN_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPIDER_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DROWNED_LOOT_BUNDLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ZOMBIE_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SKELETON_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREEPER_LOOT_BUNDLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZE_LOOT_BUNDLE, Models.GENERATED);

    }
}
