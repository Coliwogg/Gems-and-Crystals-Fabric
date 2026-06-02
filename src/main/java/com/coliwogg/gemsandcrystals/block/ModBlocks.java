package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
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
