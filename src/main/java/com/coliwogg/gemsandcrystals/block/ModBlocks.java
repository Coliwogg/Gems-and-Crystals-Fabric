package com.coliwogg.gemsandcrystals.block;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE;
    public static final Block RUBY_BLOCK;

    static {
        RUBY_ORE = registerBlock("ruby_ore",
                new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)
                        .breakByTool(FabricToolTags.PICKAXES, 2), UniformIntProvider.create(3, 7)));
        RUBY_BLOCK = registerBlock("ruby_block",
                new Block(FabricBlockSettings.of(Material.METAL, MapColor.BRIGHT_RED).requiresTool().strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 2)));
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
