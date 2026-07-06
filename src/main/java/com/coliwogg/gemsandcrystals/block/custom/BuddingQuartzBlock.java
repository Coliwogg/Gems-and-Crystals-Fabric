package com.coliwogg.gemsandcrystals.block.custom;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;

public class BuddingQuartzBlock extends Block {
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingQuartzBlock(final BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected void randomTick(final BlockState state, final ServerLevel level, final BlockPos pos, final RandomSource random) {
        if (random.nextInt(5) == 0) {
            Direction growDirection = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos growPos = pos.relative(growDirection);
            BlockState relativeState = level.getBlockState(growPos);
            Block nextStage = null;
            if (canClusterGrowAtState(relativeState)) {
                nextStage = ModBlocks.SMALL_QUARTZ_BUD;
            } else if (relativeState.is(ModBlocks.SMALL_QUARTZ_BUD) && relativeState.getValue(BlockStateProperties.FACING) == growDirection) {
                nextStage = ModBlocks.MEDIUM_QUARTZ_BUD;
            } else if (relativeState.is(ModBlocks.MEDIUM_QUARTZ_BUD) && relativeState.getValue(BlockStateProperties.FACING) == growDirection) {
                nextStage = ModBlocks.LARGE_QUARTZ_BUD;
            } else if (relativeState.is(ModBlocks.LARGE_QUARTZ_BUD) && relativeState.getValue(BlockStateProperties.FACING) == growDirection) {
                nextStage = ModBlocks.QUARTZ_CLUSTER;
            }

            if (nextStage != null) {
                BlockState targetState = (BlockState)((BlockState)nextStage.defaultBlockState().setValue(AmethystClusterBlock.FACING, growDirection)).setValue(AmethystClusterBlock.WATERLOGGED, relativeState.getFluidState().is(Fluids.WATER));
                level.setBlockAndUpdate(growPos, targetState);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState state) {
        return state.isAir() || state.is(Blocks.WATER) && state.getFluidState().isFull();
    }
}
