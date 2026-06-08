package com.coliwogg.gemsandcrystals.world;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RUBY_ORE_SMALL_PLACED_KEY = registerKey("ruby_ore_small_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_LARGE_PLACED_KEY = registerKey("ruby_ore_large_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED_KEY = registerKey("sapphire_ore_small_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED_KEY = registerKey("sapphire_ore_large_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_SMALL_PLACED_KEY = registerKey("topaz_ore_small_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_LARGE_PLACED_KEY = registerKey("topaz_ore_large_placed");
    public static final RegistryKey<PlacedFeature> AMETHYST_ORE_SMALL_PLACED_KEY = registerKey("amethyst_ore_small_placed");
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_SMALL_PLACED_KEY = registerKey("quartz_ore_small_placed");
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_LARGE_PLACED_KEY = registerKey("quartz_ore_large_placed");
    public static final RegistryKey<PlacedFeature> QUARTZ_GEODE_PLACED_KEY = registerKey("quartz_geode_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithCount(3, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(8))));
        register(context, RUBY_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_LARGE_KEY),
                ModOrePlacement.modifiersWithRarity(1, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-20))));
        register(context, SAPPHIRE_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithCount(1, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-58), YOffset.fixed(-10))));
        register(context, SAPPHIRE_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_LARGE_KEY),
                ModOrePlacement.modifiersWithRarity(1, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-30))));
        register(context, TOPAZ_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(90))));
        register(context, TOPAZ_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_LARGE_KEY),
                ModOrePlacement.modifiersWithRarity(2, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-20), YOffset.fixed(60))));
        register(context, AMETHYST_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AMETHYST_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithRarity(2, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-58), YOffset.fixed(-20))));
        register(context, QUARTZ_ORE_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_SMALL_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(48), YOffset.fixed(160))));
        register(context, QUARTZ_ORE_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_LARGE_KEY),
                ModOrePlacement.modifiersWithRarity(3, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(96), YOffset.fixed(200))));
        register(context, QUARTZ_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_GEODE_KEY),
                RarityFilterPlacementModifier.of(35), SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-30), YOffset.fixed(40)));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(GemsAndCrystals.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}
