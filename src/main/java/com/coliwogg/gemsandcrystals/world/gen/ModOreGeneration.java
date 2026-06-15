package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_LARGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SNOWY_PLAINS, Biomes.ICE_SPIKES, Biomes.SNOWY_TAIGA, Biomes.GROVE, Biomes.SNOWY_SLOPES, Biomes.FROZEN_PEAKS,  Biomes.JAGGED_PEAKS, Biomes.FROZEN_OCEAN, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.FROZEN_RIVER, Biomes.SNOWY_BEACH), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SNOWY_PLAINS, Biomes.ICE_SPIKES, Biomes.SNOWY_TAIGA, Biomes.GROVE, Biomes.SNOWY_SLOPES, Biomes.FROZEN_PEAKS,  Biomes.JAGGED_PEAKS, Biomes.FROZEN_OCEAN, Biomes.COLD_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_FROZEN_OCEAN, Biomes.FROZEN_RIVER, Biomes.SNOWY_BEACH), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SAPPHIRE_ORE_LARGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DESERT, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA, Biomes.BADLANDS, Biomes.ERODED_BADLANDS, Biomes.WOODED_BADLANDS, Biomes.MEADOW, Biomes.CHERRY_GROVE, Biomes.STONY_PEAKS, Biomes.WARM_OCEAN, Biomes.LUKEWARM_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TOPAZ_ORE_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DESERT, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA, Biomes.BADLANDS, Biomes.ERODED_BADLANDS, Biomes.WOODED_BADLANDS, Biomes.MEADOW, Biomes.CHERRY_GROVE, Biomes.STONY_PEAKS, Biomes.WARM_OCEAN, Biomes.LUKEWARM_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.TOPAZ_ORE_LARGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DEEP_DARK, Biomes.DRIPSTONE_CAVES, Biomes.LUSH_CAVES, Biomes.STONY_SHORE, Biomes.MUSHROOM_FIELDS, Biomes.DARK_FOREST, Biomes.PALE_GARDEN), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.AMETHYST_ORE_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.STONY_PEAKS, Biomes.JAGGED_PEAKS, Biomes.FROZEN_PEAKS, Biomes.WINDSWEPT_HILLS, Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.STONY_SHORE, Biomes.TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.MEADOW), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.STONY_PEAKS, Biomes.JAGGED_PEAKS, Biomes.FROZEN_PEAKS, Biomes.WINDSWEPT_HILLS, Biomes.WINDSWEPT_GRAVELLY_HILLS, Biomes.STONY_SHORE, Biomes.TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA, Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.MEADOW), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_LARGE_PLACED_KEY);
    }
}
