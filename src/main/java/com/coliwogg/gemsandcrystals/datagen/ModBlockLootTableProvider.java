package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.RUBY_BLOCK);
        dropSelf(ModBlocks.SAPPHIRE_BLOCK);
        dropSelf(ModBlocks.TOPAZ_BLOCK);
        add(ModBlocks.RUBY_ORE, createOreDrop(ModBlocks.RUBY_ORE, ModItems.RUBY));
        add(ModBlocks.DEEPSLATE_RUBY_ORE, createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        add(ModBlocks.SAPPHIRE_ORE, createOreDrop(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        add(ModBlocks.TOPAZ_ORE, createOreDrop(ModBlocks.TOPAZ_ORE, ModItems.TOPAZ));
        add(ModBlocks.DEEPSLATE_TOPAZ_ORE, createOreDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE, ModItems.TOPAZ));
        add(ModBlocks.AMETHYST_ORE, createOreDrop(ModBlocks.AMETHYST_ORE, Items.AMETHYST_SHARD));
        add(ModBlocks.DEEPSLATE_AMETHYST_ORE, createOreDrop(ModBlocks.DEEPSLATE_AMETHYST_ORE, Items.AMETHYST_SHARD));
        add(ModBlocks.QUARTZ_ORE, createOreDrop(ModBlocks.QUARTZ_ORE, Items.QUARTZ));
        add(ModBlocks.DEEPSLATE_QUARTZ_ORE, createOreDrop(ModBlocks.DEEPSLATE_QUARTZ_ORE, Items.QUARTZ));
        add(ModBlocks.BUDDING_QUARTZ, noDrop());
        add(ModBlocks.SMALL_QUARTZ_BUD, noDrop());
        add(ModBlocks.MEDIUM_QUARTZ_BUD, noDrop());
        add(ModBlocks.LARGE_QUARTZ_BUD, noDrop());
        add(ModBlocks.QUARTZ_CLUSTER, createSilkTouchDispatchTable(
                ModBlocks.QUARTZ_CLUSTER,
                applyExplosionDecay(
                        ModBlocks.QUARTZ_CLUSTER,
                        LootItem.lootTableItem(Items.QUARTZ)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2)))))
        );

    }
}
