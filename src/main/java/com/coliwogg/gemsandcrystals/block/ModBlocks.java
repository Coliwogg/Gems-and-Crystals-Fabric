package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE;
    public static final Block DEEPSLATE_RUBY_ORE;
    public static final Block ANDESITE_RUBY_ORE;
    public static final Block DIORITE_RUBY_ORE;
    public static final Block GRANITE_RUBY_ORE;
    public static final Block TUFF_RUBY_ORE;
    public static final Block SAPPHIRE_ORE;
    public static final Block DEEPSLATE_SAPPHIRE_ORE;
    public static final Block ANDESITE_SAPPHIRE_ORE;
    public static final Block DIORITE_SAPPHIRE_ORE;
    public static final Block GRANITE_SAPPHIRE_ORE;
    public static final Block TUFF_SAPPHIRE_ORE;
    public static final Block TOPAZ_ORE;
    public static final Block DEEPSLATE_TOPAZ_ORE;
    public static final Block ANDESITE_TOPAZ_ORE;
    public static final Block DIORITE_TOPAZ_ORE;
    public static final Block GRANITE_TOPAZ_ORE;
    public static final Block TUFF_TOPAZ_ORE;
    public static final Block AMETHYST_ORE;
    public static final Block DEEPSLATE_AMETHYST_ORE;
    public static final Block ANDESITE_AMETHYST_ORE;
    public static final Block DIORITE_AMETHYST_ORE;
    public static final Block GRANITE_AMETHYST_ORE;
    public static final Block TUFF_AMETHYST_ORE;
    public static final Block QUARTZ_ORE;
    public static final Block DEEPSLATE_QUARTZ_ORE;
    public static final Block ANDESITE_QUARTZ_ORE;
    public static final Block DIORITE_QUARTZ_ORE;
    public static final Block GRANITE_QUARTZ_ORE;
    public static final Block TUFF_QUARTZ_ORE;
    public static final Block RUBY_BLOCK;
    public static final Block SAPPHIRE_BLOCK;
    public static final Block TOPAZ_BLOCK;

    static {
        RUBY_ORE = registerBlock("ruby_ore",
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)
                        , UniformIntProvider.create(3, 7)));
        DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
                new OreBlock(FabricBlockSettings.copyOf(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F)
                        .sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
        ANDESITE_RUBY_ORE = registerBlock("andesite_ruby_ore",
                new OreBlock(FabricBlockSettings.copyOf(RUBY_ORE).mapColor(MapColor.STONE_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
        DIORITE_RUBY_ORE = registerBlock("diorite_ruby_ore",
                new OreBlock(FabricBlockSettings.copyOf(RUBY_ORE).mapColor(MapColor.OFF_WHITE).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
        GRANITE_RUBY_ORE = registerBlock("granite_ruby_ore",
                new OreBlock(FabricBlockSettings.copyOf(RUBY_ORE).mapColor(MapColor.DIRT_BROWN).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
        TUFF_RUBY_ORE = registerBlock("tuff_ruby_ore",
                new OreBlock(FabricBlockSettings.copyOf(RUBY_ORE).mapColor(MapColor.TERRACOTTA_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.TUFF), UniformIntProvider.create(3, 7)));
        SAPPHIRE_ORE = registerBlock("sapphire_ore",
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)
                        , UniformIntProvider.create(3, 7)));
        DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
                new OreBlock(FabricBlockSettings.copyOf(SAPPHIRE_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F)
                        .sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
        ANDESITE_SAPPHIRE_ORE = registerBlock("andesite_sapphire_ore",
                new OreBlock(FabricBlockSettings.copyOf(SAPPHIRE_ORE).mapColor(MapColor.STONE_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
        DIORITE_SAPPHIRE_ORE = registerBlock("diorite_sapphire_ore",
                new OreBlock(FabricBlockSettings.copyOf(SAPPHIRE_ORE).mapColor(MapColor.OFF_WHITE).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
        GRANITE_SAPPHIRE_ORE = registerBlock("granite_sapphire_ore",
                new OreBlock(FabricBlockSettings.copyOf(SAPPHIRE_ORE).mapColor(MapColor.DIRT_BROWN).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
        TUFF_SAPPHIRE_ORE = registerBlock("tuff_sapphire_ore",
                new OreBlock(FabricBlockSettings.copyOf(SAPPHIRE_ORE).mapColor(MapColor.TERRACOTTA_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.TUFF), UniformIntProvider.create(3, 7)));
        TOPAZ_ORE = registerBlock("topaz_ore",
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)
                        , UniformIntProvider.create(2, 5)));
        DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
                new OreBlock(FabricBlockSettings.copyOf(TOPAZ_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F)
                        .sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 5)));
        ANDESITE_TOPAZ_ORE = registerBlock("andesite_topaz_ore",
                new OreBlock(FabricBlockSettings.copyOf(TOPAZ_ORE).mapColor(MapColor.STONE_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        DIORITE_TOPAZ_ORE = registerBlock("diorite_topaz_ore",
                new OreBlock(FabricBlockSettings.copyOf(TOPAZ_ORE).mapColor(MapColor.OFF_WHITE).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        GRANITE_TOPAZ_ORE = registerBlock("granite_topaz_ore",
                new OreBlock(FabricBlockSettings.copyOf(TOPAZ_ORE).mapColor(MapColor.DIRT_BROWN).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        TUFF_TOPAZ_ORE = registerBlock("tuff_topaz_ore",
                new OreBlock(FabricBlockSettings.copyOf(TOPAZ_ORE).mapColor(MapColor.TERRACOTTA_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.TUFF), UniformIntProvider.create(2, 5)));
        AMETHYST_ORE = registerBlock("amethyst_ore",
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)
                        , UniformIntProvider.create(2, 5)));
        DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore",
                new OreBlock(FabricBlockSettings.copyOf(AMETHYST_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F)
                        .sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 5)));
        ANDESITE_AMETHYST_ORE = registerBlock("andesite_amethyst_ore",
                new OreBlock(FabricBlockSettings.copyOf(AMETHYST_ORE).mapColor(MapColor.STONE_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        DIORITE_AMETHYST_ORE = registerBlock("diorite_amethyst_ore",
                new OreBlock(FabricBlockSettings.copyOf(AMETHYST_ORE).mapColor(MapColor.OFF_WHITE).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        GRANITE_AMETHYST_ORE = registerBlock("granite_amethyst_ore",
                new OreBlock(FabricBlockSettings.copyOf(AMETHYST_ORE).mapColor(MapColor.DIRT_BROWN).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        TUFF_AMETHYST_ORE = registerBlock("tuff_amethyst_ore",
                new OreBlock(FabricBlockSettings.copyOf(AMETHYST_ORE).mapColor(MapColor.TERRACOTTA_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.TUFF), UniformIntProvider.create(2, 5)));
        QUARTZ_ORE = registerBlock("quartz_ore",
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)
                        , UniformIntProvider.create(2, 5)));
        DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
                new OreBlock(FabricBlockSettings.copyOf(QUARTZ_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F)
                        .sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(2, 5)));
        ANDESITE_QUARTZ_ORE = registerBlock("andesite_quartz_ore",
                new OreBlock(FabricBlockSettings.copyOf(QUARTZ_ORE).mapColor(MapColor.STONE_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        DIORITE_QUARTZ_ORE = registerBlock("diorite_quartz_ore",
                new OreBlock(FabricBlockSettings.copyOf(QUARTZ_ORE).mapColor(MapColor.OFF_WHITE).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        GRANITE_QUARTZ_ORE = registerBlock("granite_quartz_ore",
                new OreBlock(FabricBlockSettings.copyOf(QUARTZ_ORE).mapColor(MapColor.DIRT_BROWN).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.STONE), UniformIntProvider.create(2, 5)));
        TUFF_QUARTZ_ORE = registerBlock("tuff_quartz_ore",
                new OreBlock(FabricBlockSettings.copyOf(QUARTZ_ORE).mapColor(MapColor.TERRACOTTA_GRAY).strength(3.0F, 3.0F)
                        .sounds(BlockSoundGroup.TUFF), UniformIntProvider.create(2, 5)));
        RUBY_BLOCK = registerBlock("ruby_block",
                new Block(FabricBlockSettings.of(Material.METAL, MapColor.BRIGHT_RED).requiresTool().strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)));
        SAPPHIRE_BLOCK = registerBlock("sapphire_block",
                new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLUE).requiresTool().strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)));
        TOPAZ_BLOCK = registerBlock("topaz_block",
                new Block(FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(GemsAndCrystals.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(GemsAndCrystals.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
    }

    public static void registerModBlocks() {
        GemsAndCrystals.LOGGER.info("Registering ModBlocks for " + GemsAndCrystals.MOD_ID);
    }

}
