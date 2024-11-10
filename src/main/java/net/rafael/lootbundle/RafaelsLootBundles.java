package net.rafael.lootbundle;

import net.fabricmc.api.ModInitializer;

import net.rafael.lootbundle.datagen.ModLootTableProvider;
import net.rafael.lootbundle.item.ModItemGroups;
import net.rafael.lootbundle.item.ModItems;
import net.rafael.lootbundle.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RafaelsLootBundles implements ModInitializer {
	public static final String MOD_ID = "rafaels-loot-bundle";

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