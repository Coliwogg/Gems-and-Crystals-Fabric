package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.RUBY_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SAPPHIRE_ORE))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TOPAZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_AMETHYST_ORE))
                .add(ModBlocks.getRK(ModBlocks.QUARTZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_QUARTZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_QUARTZ))
                .add(ModBlocks.getRK(ModBlocks.QUARTZ_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.LARGE_QUARTZ_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_QUARTZ_BUD))
                .add(ModBlocks.getRK(ModBlocks.SMALL_QUARTZ_BUD));

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.getRK(ModBlocks.RUBY_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SAPPHIRE_ORE));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.TOPAZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_TOPAZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_AMETHYST_ORE))
                .add(ModBlocks.getRK(ModBlocks.QUARTZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_QUARTZ_ORE))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_QUARTZ));
    }
}
