package com.coliwogg.gemsandcrystals.world;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> RUBY_ORE_SMALL_PLACED_KEY = registerKey("ruby_ore_small_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_LARGE_PLACED_KEY = registerKey("ruby_ore_large_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED_KEY = registerKey("sapphire_ore_small_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED_KEY = registerKey("sapphire_ore_large_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_SMALL_PLACED_KEY = registerKey("topaz_ore_small_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_LARGE_PLACED_KEY = registerKey("topaz_ore_large_placed");
    public static final ResourceKey<PlacedFeature> AMETHYST_ORE_SMALL_PLACED_KEY = registerKey("amethyst_ore_small_placed");
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_SMALL_PLACED_KEY = registerKey("quartz_ore_small_placed");
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE_LARGE_PLACED_KEY = registerKey("quartz_ore_large_placed");
    public static final ResourceKey<PlacedFeature> QUARTZ_GEODE_PLACED_KEY = registerKey("quartz_geode_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_SMALL_KEY),
                ModOrePlacements.commonOrePlacement(3, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(8))));
        register(context, RUBY_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_LARGE_KEY),
                ModOrePlacements.rareOrePlacement(1, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-20))));
        register(context, SAPPHIRE_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_SMALL_KEY),
                ModOrePlacements.commonOrePlacement(1, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(-10))));
        register(context, SAPPHIRE_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_LARGE_KEY),
                ModOrePlacements.rareOrePlacement(1, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-30))));
        register(context, TOPAZ_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TOPAZ_ORE_SMALL_KEY),
                ModOrePlacements.commonOrePlacement(6, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90))));
        register(context, TOPAZ_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TOPAZ_ORE_LARGE_KEY),
                ModOrePlacements.rareOrePlacement(2, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(60))));
        register(context, AMETHYST_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_AMETHYST_ORE_SMALL_KEY),
                ModOrePlacements.rareOrePlacement(2, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(-20))));
        register(context, QUARTZ_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_ORE_SMALL_KEY),
                ModOrePlacements.commonOrePlacement(5, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(48), VerticalAnchor.absolute(160))));
        register(context, QUARTZ_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_ORE_LARGE_KEY),
                ModOrePlacements.rareOrePlacement(3, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(96), VerticalAnchor.absolute(200))));
        register(context, QUARTZ_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(35), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-30), VerticalAnchor.absolute(40)),
                        BiomeFilter.biome()));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, GemsAndCrystals.identifier(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                          Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
