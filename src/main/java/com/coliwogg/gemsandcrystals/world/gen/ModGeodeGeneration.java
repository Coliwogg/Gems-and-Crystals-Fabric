package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModGeodeGeneration {
    public static void generateGeodes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.STONY_PEAKS, Biomes.JAGGED_PEAKS, Biomes.FROZEN_PEAKS, Biomes.WINDSWEPT_HILLS, Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.STONY_SHORE, Biomes.TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.MEADOW), GenerationStep.Decoration.LOCAL_MODIFICATIONS, ModPlacedFeatures.QUARTZ_GEODE_PLACED_KEY);
    }
}