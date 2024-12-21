package net.rafael.lootbundles;

import net.fabricmc.api.ModInitializer;

import net.rafael.lootbundles.item.ModItemGroups;
import net.rafael.lootbundles.item.ModItems;
import net.rafael.lootbundles.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RafaelsLootBundles implements ModInitializer {
	public static final String MOD_ID = "rafaels-loot-bundles";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();
	}
}