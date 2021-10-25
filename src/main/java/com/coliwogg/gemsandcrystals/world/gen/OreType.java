package com.coliwogg.gemsandcrystals.world.gen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.block.Block;

public enum OreType {
    RUBY(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, 4, 15, 4, true);
    ;
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
