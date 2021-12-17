package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.config.ModConfigs;
import net.minecraft.block.Block;

public enum OreType {
    RUBY(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.ANDESITE_RUBY_ORE, ModBlocks.DIORITE_RUBY_ORE, ModBlocks.GRANITE_RUBY_ORE, ModBlocks.TUFF_RUBY_ORE, ModConfigs.RUBY_MIN_HEIGHT, ModConfigs.RUBY_MAX_HEIGHT, ModConfigs.RUBY_VEIN_COUNT, ModConfigs.RUBY_VEIN_SIZE, ModConfigs.GENERATE_RUBY),
    SAPPHIRE(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModBlocks.ANDESITE_SAPPHIRE_ORE, ModBlocks.DIORITE_SAPPHIRE_ORE, ModBlocks.GRANITE_SAPPHIRE_ORE, ModBlocks.TUFF_SAPPHIRE_ORE, ModConfigs.SAPPHIRE_MIN_HEIGHT, ModConfigs.SAPPHIRE_MAX_HEIGHT, ModConfigs.SAPPHIRE_VEIN_COUNT, ModConfigs.SAPPHIRE_VEIN_SIZE, ModConfigs.GENERATE_SAPPHIRE),
    TOPAZ(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE, ModBlocks.ANDESITE_TOPAZ_ORE, ModBlocks.DIORITE_TOPAZ_ORE, ModBlocks.GRANITE_TOPAZ_ORE, ModBlocks.TUFF_TOPAZ_ORE, ModConfigs.TOPAZ_MIN_HEIGHT, ModConfigs.TOPAZ_MAX_HEIGHT, ModConfigs.TOPAZ_VEIN_COUNT, ModConfigs.TOPAZ_VEIN_SIZE, ModConfigs.GENERATE_TOPAZ),
    AMETHYST(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE, ModBlocks.ANDESITE_AMETHYST_ORE, ModBlocks.DIORITE_AMETHYST_ORE, ModBlocks.GRANITE_AMETHYST_ORE, ModBlocks.TUFF_AMETHYST_ORE, ModConfigs.AMETHYST_MIN_HEIGHT, ModConfigs.AMETHYST_MAX_HEIGHT, ModConfigs.AMETHYST_VEIN_COUNT, ModConfigs.AMETHYST_VEIN_SIZE, ModConfigs.GENERATE_AMETHYST),
    QUARTZ(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE, ModBlocks.ANDESITE_QUARTZ_ORE, ModBlocks.DIORITE_QUARTZ_ORE, ModBlocks.GRANITE_QUARTZ_ORE, ModBlocks.TUFF_QUARTZ_ORE, ModConfigs.QUARTZ_MIN_HEIGHT, ModConfigs.QUARTZ_MAX_HEIGHT, ModConfigs.QUARTZ_VEIN_COUNT, ModConfigs.QUARTZ_VEIN_SIZE, ModConfigs.GENERATE_QUARTZ);

    private final Block block;
    private final Block deepslateBlock;
    private final Block andesiteBlock;
    private final Block dioriteBlock;
    private final Block graniteBlock;
    private final Block tuffBlock;
    private final int minHeight;
    private final int maxHeight;
    private final int veinCount;
    private final int veinSize;
    private final boolean generateOreToggle;

    OreType(Block block, Block deepslateBlock, Block andesiteBlock, Block dioriteBlock, Block graniteBlock, Block tuffBlock, int minHeight, int maxHeight, int veinCount, int veinSize, boolean generateOreToggle) {
        this.block = block;
        this.deepslateBlock = deepslateBlock;
        this.andesiteBlock = andesiteBlock;
        this.dioriteBlock = dioriteBlock;
        this.graniteBlock = graniteBlock;
        this.tuffBlock = tuffBlock;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinCount = veinCount;
        this.veinSize = veinSize;
        this.generateOreToggle = generateOreToggle;
    }

    public Block getBlock() {
        return block;
    }

    public Block getDeepslateBlock() {
        return deepslateBlock;
    }

    public Block getAndesiteBlock() {
        return andesiteBlock;
    }

    public Block getDioriteBlock() {
        return dioriteBlock;
    }

    public Block getGraniteBlock() {
        return graniteBlock;
    }

    public Block getTuffBlock() {
        return tuffBlock;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinCount() {
        return veinCount;
    }

    public int getVeinSize() {
        return veinSize;
    }

    public boolean getGenerateOreToggle() {
        return generateOreToggle;
    }


    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
