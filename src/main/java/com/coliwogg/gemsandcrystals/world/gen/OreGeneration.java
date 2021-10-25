package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class OreGeneration {

    private static void generateOres() {
        for (OreType ore : OreType.values()) {
            if (ore.getGenerateOreToggle()) {
                ImmutableList<OreFeatureConfig.Target> ORE_TARGET_LIST =
                        ImmutableList.of(
                                OreFeatureConfig.createTarget(OreFeatureConfig.Rules.STONE_ORE_REPLACEABLES,
                                        ore.getBlock().getDefaultState()),
                                OreFeatureConfig.createTarget(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                                        ore.getDeepslateBlock().getDefaultState()));

                ConfiguredFeature<?, ?> ORE = Feature.REPLACE_SINGLE_BLOCK
                        .configure(new EmeraldOreFeatureConfig(ORE_TARGET_LIST))
                        .range(new RangeDecoratorConfig(
                                UniformHeightProvider.create(
                                        YOffset.aboveBottom(ore.getMinHeight()),
                                        YOffset.fixed(ore.getMaxHeight()))))
                        .spreadHorizontally()
                        .repeat(ore.getVeinCount());

                register(ore.getBlock(), ORE);
            }
        }
    }

    private static void register(Block block, ConfiguredFeature<?, ?> ORE) {
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier(GemsAndCrystals.MOD_ID, block.getTranslationKey()));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getValue(), ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public static void registerOreGeneration() {
        GemsAndCrystals.LOGGER.info("Registering OreGeneration for " + GemsAndCrystals.MOD_ID);
        generateOres();
    }

}
