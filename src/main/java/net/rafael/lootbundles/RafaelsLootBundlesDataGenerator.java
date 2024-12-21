package net.rafael.lootbundles;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.rafael.lootbundles.datagen.ModItemTagProvider;
import net.rafael.lootbundles.datagen.ModLootTableProvider;
import net.rafael.lootbundles.datagen.ModModelProvider;
import net.rafael.lootbundles.datagen.ModRecipeProvider;

public class RafaelsLootBundlesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		//pack.addProvider(ModItemTagProvider::new);
		//pack.addProvider(ModLootTableProvider::new);
		//pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
