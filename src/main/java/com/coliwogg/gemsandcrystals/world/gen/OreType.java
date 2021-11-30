package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.config.ModConfigs;
import net.minecraft.block.Block;

public enum OreType {
    RUBY(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModConfigs.RUBY_MIN_HEIGHT, ModConfigs.RUBY_MAX_HEIGHT, ModConfigs.RUBY_VEIN_COUNT, ModConfigs.GENERATE_RUBY),
    SAPPHIRE(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModConfigs.SAPPHIRE_MIN_HEIGHT, ModConfigs.SAPPHIRE_MAX_HEIGHT, ModConfigs.SAPPHIRE_VEIN_COUNT, ModConfigs.GENERATE_SAPPHIRE),
    TOPAZ(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE, ModConfigs.TOPAZ_MIN_HEIGHT, ModConfigs.TOPAZ_MAX_HEIGHT, ModConfigs.TOPAZ_VEIN_COUNT, ModConfigs.GENERATE_TOPAZ),
    AMETHYST(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE, ModConfigs.AMETHYST_MIN_HEIGHT, ModConfigs.AMETHYST_MAX_HEIGHT, ModConfigs.AMETHYST_VEIN_COUNT, ModConfigs.GENERATE_AMETHYST),
    QUARTZ(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE, ModConfigs.QUARTZ_MIN_HEIGHT, ModConfigs.QUARTZ_MAX_HEIGHT, ModConfigs.QUARTZ_VEIN_COUNT, ModConfigs.GENERATE_QUARTZ);

    private final Block block;
    private final Block deepslateBlock;
    private final int minHeight;
    private final int maxHeight;
    private final int veinCount;
    private final boolean generateOreToggle;

    OreType(Block block, Block deepslateBlock, int minHeight, int maxHeight, int veinCount, boolean generateOreToggle) {
        this.block = block;
        this.deepslateBlock = deepslateBlock;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinCount = veinCount;
        this.generateOreToggle = generateOreToggle;
    }

    public Block getBlock() {
        return block;
    }

    public Block getDeepslateBlock() {
        return deepslateBlock;
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
