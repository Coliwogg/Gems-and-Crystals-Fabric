package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

public class OreGeneration {

    public static final RuleTest STONE_RULE = new BlockMatchRuleTest(Blocks.STONE);
    public static final RuleTest DEEPSLATE_RULE = new BlockMatchRuleTest(Blocks.DEEPSLATE);
    public static final RuleTest ANDESITE_RULE = new BlockMatchRuleTest(Blocks.ANDESITE);
    public static final RuleTest DIORITE_RULE = new BlockMatchRuleTest(Blocks.DIORITE);
    public static final RuleTest GRANITE_RULE = new BlockMatchRuleTest(Blocks.GRANITE);
    public static final RuleTest TUFF_RULE = new BlockMatchRuleTest(Blocks.TUFF);

    private static void generateOres() {
        for (OreType ore : OreType.values()) {
            if (ore.getGenerateOreToggle()) {

                List<OreFeatureConfig.Target> ORES = List.of(
                        OreFeatureConfig.createTarget(STONE_RULE, ore.getBlock().getDefaultState()),
                        OreFeatureConfig.createTarget(DEEPSLATE_RULE, ore.getDeepslateBlock().getDefaultState()),
                        OreFeatureConfig.createTarget(ANDESITE_RULE, ore.getAndesiteBlock().getDefaultState()),
                        OreFeatureConfig.createTarget(DIORITE_RULE, ore.getDioriteBlock().getDefaultState()),
                        OreFeatureConfig.createTarget(GRANITE_RULE, ore.getGraniteBlock().getDefaultState()),
                        OreFeatureConfig.createTarget(TUFF_RULE, ore.getTuffBlock().getDefaultState())
                );

                ConfiguredFeature<?, ?> ORE_TYPE = Feature.ORE.configure(new OreFeatureConfig(ORES, ore.getVeinSize()));

                PlacedFeature ORE_PLACED_FEATURE = ORE_TYPE.withPlacement(
                        modifiersWithCount(ore.getVeinCount(), HeightRangePlacementModifier.trapezoid(YOffset.fixed(ore.getMinHeight()), YOffset.fixed(ore.getMaxHeight())))
                );

                registerOre(ore.getBlock(), ORE_TYPE, ORE_PLACED_FEATURE);
            }
        }
    }

    private static void registerOre(Block ore, ConfiguredFeature<?, ?> configuredFeature, PlacedFeature placedFeature) {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(GemsAndCrystals.MOD_ID, ore.getTranslationKey()), configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(GemsAndCrystals.MOD_ID, ore.getTranslationKey()), placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(GemsAndCrystals.MOD_ID, ore.getTranslationKey())));
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    public static void registerOreGeneration() {
        GemsAndCrystals.LOGGER.info("Registering OreGeneration for " + GemsAndCrystals.MOD_ID);
        generateOres();
    }

}
