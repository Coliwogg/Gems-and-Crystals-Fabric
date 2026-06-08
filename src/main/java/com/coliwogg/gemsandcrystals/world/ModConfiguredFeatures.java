package com.coliwogg.gemsandcrystals.world;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_SMALL_KEY = registerKey("ruby_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_LARGE_KEY = registerKey("ruby_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_SMALL_KEY = registerKey("sapphire_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_LARGE_KEY = registerKey("sapphire_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_SMALL_KEY = registerKey("topaz_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_LARGE_KEY = registerKey("topaz_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETHYST_ORE_SMALL_KEY = registerKey("amethyst_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_SMALL_KEY = registerKey("quartz_ore_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_LARGE_KEY = registerKey("quartz_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_GEODE_KEY = registerKey("quartz_geode");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAmethystOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.AMETHYST_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_AMETHYST_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldQuartzOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.QUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.getDefaultState()));

        register(context, RUBY_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 4));
        register(context, RUBY_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 8));
        register(context, SAPPHIRE_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 5));
        register(context, SAPPHIRE_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 9));
        register(context, TOPAZ_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 6));
        register(context, TOPAZ_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 11));
        register(context, AMETHYST_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldAmethystOres, 3));
        register(context, QUARTZ_ORE_SMALL_KEY, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 7));
        register(context, QUARTZ_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 12));
        register(context, QUARTZ_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(
                BlockStateProvider.of(Blocks.AIR),
                BlockStateProvider.of(Blocks.DIORITE),
                BlockStateProvider.of(ModBlocks.BUDDING_QUARTZ),
                BlockStateProvider.of(Blocks.TUFF),
                BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                List.of(
                        ModBlocks.SMALL_QUARTZ_BUD.getDefaultState(),
                        ModBlocks.MEDIUM_QUARTZ_BUD.getDefaultState(),
                        ModBlocks.LARGE_QUARTZ_BUD.getDefaultState(),
                        ModBlocks.QUARTZ_CLUSTER.getDefaultState()
                ),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.7d, 2.2d, 3.0d, 4.2d),
                new GeodeCrackConfig(0.6d, 2.0d, 2),
                0.4d, 0.083d,
                true, UniformIntProvider.create(4, 7),
                UniformIntProvider.create(2, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.065d, 1));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(GemsAndCrystals.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
