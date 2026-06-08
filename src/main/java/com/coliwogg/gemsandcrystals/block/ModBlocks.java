package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.custom.BuddingQuartzBlock;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "ruby_block")))
                    .strength(5.0f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire_block")))
                    .strength(5.0f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block", new Block(
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "topaz_block")))
                    .strength(5.0f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "ruby_ore")))
                    .strength(3f)
                    .requiresTool()));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "deepslate_ruby_ore")))
                    .strength(4.5f)
                    .requiresTool()));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire_ore")))
                    .strength(3f)
                    .requiresTool()));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "deepslate_sapphire_ore")))
                    .strength(4.5f)
                    .requiresTool()));

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "topaz_ore")))
                    .strength(3f)
                    .requiresTool()));

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "deepslate_topaz_ore")))
                    .strength(4.5f)
                    .requiresTool()));

    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "amethyst_ore")))
                    .strength(3f)
                    .requiresTool()));

    public static final Block DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "deepslate_amethyst_ore")))
                    .strength(4.5f)
                    .requiresTool()));

    public static final Block QUARTZ_ORE = registerBlock("quartz_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "quartz_ore")))
                    .strength(3f)
                    .requiresTool()));

    public static final Block DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore", new ExperienceDroppingBlock(
            UniformIntProvider.create(3, 7),
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "deepslate_quartz_ore")))
                    .strength(4.5f)
                    .requiresTool()));

    public static final Block BUDDING_QUARTZ = registerBlock("budding_quartz", new BuddingQuartzBlock(
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "budding_quartz")))
                    .mapColor(MapColor.OFF_WHITE).ticksRandomly().strength(1.5F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block QUARTZ_CLUSTER = registerBlock("quartz_cluster", new AmethystClusterBlock(7.0F, 10.0F,
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "quartz_cluster")))
                    .mapColor(MapColor.OFF_WHITE).solid().nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .strength(1.5F).luminance((state) -> 5)));

    public static final Block LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud", new AmethystClusterBlock(5.0F, 10.0F,
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "large_quartz_bud")))
                    .mapColor(MapColor.OFF_WHITE).solid().nonOpaque().sounds(BlockSoundGroup.LARGE_AMETHYST_BUD)
                    .strength(1.5F).luminance((state) -> 4)));

    public static final Block MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud", new AmethystClusterBlock(4.0F, 10.0F,
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "medium_quartz_bud")))
                    .mapColor(MapColor.OFF_WHITE).solid().nonOpaque().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD)
                    .strength(1.5F).luminance((state) -> 2)));

    public static final Block SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud", new AmethystClusterBlock(3.0F, 8.0F,
            AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, "small_quartz_bud")))
                    .mapColor(MapColor.OFF_WHITE).solid().nonOpaque().sounds(BlockSoundGroup.SMALL_AMETHYST_BUD)
                    .strength(1.5F).luminance((state) -> 1)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GemsAndCrystals.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GemsAndCrystals.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GemsAndCrystals.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        GemsAndCrystals.LOGGER.info("Registering Mod Blocks for " + GemsAndCrystals.MOD_ID);
    }
}
