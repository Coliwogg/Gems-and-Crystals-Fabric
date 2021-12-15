package com.coliwogg.gemsandcrystals;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.config.ModConfigs;
import com.coliwogg.gemsandcrystals.item.ModItems;
import com.coliwogg.gemsandcrystals.world.gen.OreGeneration;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GemsAndCrystals implements ModInitializer {

    public static final String MOD_ID = "gemsandcrystals";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LogManager.getLogger("gemsandcrystals");

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        ModConfigs.registerConfigs();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        OreGeneration.registerOreGeneration();
    }
}
