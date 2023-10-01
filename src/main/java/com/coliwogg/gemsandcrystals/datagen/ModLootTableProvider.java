package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.TOPAZ_BLOCK);

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.TOPAZ_ORE, oreDrops(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, oreDrops(ModBlocks.DEEPSLATE_TOPAZ_ORE, ModItems.TOPAZ));
        addDrop(ModBlocks.AMETHYST_ORE, oreDrops(ModBlocks.AMETHYST_ORE, Items.AMETHYST_SHARD));
        addDrop(ModBlocks.DEEPSLATE_AMETHYST_ORE, oreDrops(ModBlocks.DEEPSLATE_AMETHYST_ORE, Items.AMETHYST_SHARD));
        addDrop(ModBlocks.QUARTZ_ORE, oreDrops(ModBlocks.QUARTZ_ORE, Items.QUARTZ));
        addDrop(ModBlocks.DEEPSLATE_QUARTZ_ORE, oreDrops(ModBlocks.DEEPSLATE_QUARTZ_ORE, Items.QUARTZ));

    }
}
