package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.creativemodetab.ModCreativeModeTabs;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.coliwogg.gemsandcrystals.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemsAndCrystals implements ModInitializer {
    public static final String MOD_ID = "gemsandcrystals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

	}

	public static Identifier identifier(String path) {
		return Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, path);
	}
}