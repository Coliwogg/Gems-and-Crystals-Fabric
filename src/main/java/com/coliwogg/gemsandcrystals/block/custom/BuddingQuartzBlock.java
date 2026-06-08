package com.coliwogg.gemsandcrystals.block.custom;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingQuartzBlock extends Block {
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingQuartzBlock(Settings settings) {
        super(settings);
    }

    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = ModBlocks.SMALL_QUARTZ_BUD;
            } else if (blockState.isOf(ModBlocks.SMALL_QUARTZ_BUD) && blockState.get(Properties.FACING) == direction) {
                block = ModBlocks.MEDIUM_QUARTZ_BUD;
            } else if (blockState.isOf(ModBlocks.MEDIUM_QUARTZ_BUD) && blockState.get(Properties.FACING) == direction) {
                block = ModBlocks.LARGE_QUARTZ_BUD;
            } else if (blockState.isOf(ModBlocks.LARGE_QUARTZ_BUD) && blockState.get(Properties.FACING) == direction) {
                block = ModBlocks.QUARTZ_CLUSTER;
            }

            if (block != null) {
                BlockState newState = block.getDefaultState().with(Properties.FACING, direction).with(Properties.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                world.setBlockState(blockPos, newState);
            }

        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}
