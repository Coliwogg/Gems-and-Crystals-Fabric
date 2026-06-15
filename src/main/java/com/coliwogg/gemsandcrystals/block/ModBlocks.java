package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.custom.BuddingQuartzBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(properties.strength(5f, 6f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            properties -> new Block(properties.strength(5f, 6f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            properties -> new Block(properties.strength(5f, 6f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(4.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(4.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(4.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(4.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block QUARTZ_ORE = registerBlock("quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7),
                    properties.strength(4.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block BUDDING_QUARTZ = registerBlock("budding_quartz",
            properties -> new BuddingQuartzBlock(properties.strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).mapColor(MapColor.QUARTZ).randomTicks().noOcclusion()
                    .pushReaction(PushReaction.DESTROY)));
    public static final Block QUARTZ_CLUSTER = registerBlock("quartz_cluster",
            properties -> new AmethystClusterBlock(7.0F, 10.0F, properties.strength(1.5F)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER).mapColor(MapColor.QUARTZ).forceSolidOn()
                    .noOcclusion().lightLevel(state -> 5).pushReaction(PushReaction.DESTROY)));
    public static final Block LARGE_QUARTZ_BUD = registerBlock("large_quartz_bud",
            properties -> new AmethystClusterBlock(5.0F, 10.0F, properties.strength(1.5F)
                    .requiresCorrectToolForDrops().sound(SoundType.LARGE_AMETHYST_BUD).mapColor(MapColor.QUARTZ).forceSolidOn()
                    .noOcclusion().lightLevel(state -> 4).pushReaction(PushReaction.DESTROY)));
    public static final Block MEDIUM_QUARTZ_BUD = registerBlock("medium_quartz_bud",
            properties -> new AmethystClusterBlock(4.0F, 10.0F, properties.strength(1.5F)
                    .requiresCorrectToolForDrops().sound(SoundType.MEDIUM_AMETHYST_BUD).mapColor(MapColor.QUARTZ).forceSolidOn()
                    .noOcclusion().lightLevel(state -> 2).pushReaction(PushReaction.DESTROY)));
    public static final Block SMALL_QUARTZ_BUD = registerBlock("small_quartz_bud",
            properties -> new AmethystClusterBlock(3.0F, 8.0F, properties.strength(1.5F)
                    .requiresCorrectToolForDrops().sound(SoundType.SMALL_AMETHYST_BUD).mapColor(MapColor.QUARTZ).forceSolidOn()
                    .noOcclusion().lightLevel(state -> 1).pushReaction(PushReaction.DESTROY)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        GemsAndCrystals.LOGGER.info("Registering Mod Blocks for " + GemsAndCrystals.MOD_ID);
    }
}
