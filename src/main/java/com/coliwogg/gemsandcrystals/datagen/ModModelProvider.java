package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModArmorMaterials;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class ModModelProvider extends FabricModelProvider {
    private static final PropertyDispatch<VariantMutator> ROTATIONS_COLUMN_WITH_FACING =
            PropertyDispatch.modify(BlockStateProperties.FACING)
                    .select(Direction.DOWN, BlockModelGenerators.X_ROT_180)
                    .select(Direction.UP, BlockModelGenerators.NOP).select(Direction.NORTH, BlockModelGenerators.X_ROT_90)
                    .select(Direction.SOUTH, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_180))
                    .select(Direction.WEST, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_270))
                    .select(Direction.EAST, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_90));

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.RUBY_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.SAPPHIRE_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.EMERALD_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.TOPAZ_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.AMETHYST_SPEAR);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(ModItems.QUARTZ_SPEAR);

        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_HELMET, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_CHESTPLATE, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_LEGGINGS, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.RUBY_BOOTS, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_HELMET, ModArmorMaterials.SAPPHIRE_KEY, itemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_CHESTPLATE, ModArmorMaterials.SAPPHIRE_KEY, itemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_LEGGINGS, ModArmorMaterials.SAPPHIRE_KEY, itemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.SAPPHIRE_BOOTS, ModArmorMaterials.SAPPHIRE_KEY, itemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.EMERALD_HELMET, ModArmorMaterials.EMERALD_KEY, itemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.EMERALD_CHESTPLATE, ModArmorMaterials.EMERALD_KEY, itemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.EMERALD_LEGGINGS, ModArmorMaterials.EMERALD_KEY, itemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.EMERALD_BOOTS, ModArmorMaterials.EMERALD_KEY, itemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_HELMET, ModArmorMaterials.TOPAZ_KEY, itemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_CHESTPLATE, ModArmorMaterials.TOPAZ_KEY, itemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_LEGGINGS, ModArmorMaterials.TOPAZ_KEY, itemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.TOPAZ_BOOTS, ModArmorMaterials.TOPAZ_KEY, itemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.AMETHYST_HELMET, ModArmorMaterials.AMETHYST_KEY, itemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AMETHYST_CHESTPLATE, ModArmorMaterials.AMETHYST_KEY, itemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AMETHYST_LEGGINGS, ModArmorMaterials.AMETHYST_KEY, itemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.AMETHYST_BOOTS, ModArmorMaterials.AMETHYST_KEY, itemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.generateTrimmableItem(ModItems.QUARTZ_HELMET, ModArmorMaterials.QUARTZ_KEY, itemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.QUARTZ_CHESTPLATE, ModArmorMaterials.QUARTZ_KEY, itemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.QUARTZ_LEGGINGS, ModArmorMaterials.QUARTZ_KEY, itemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.QUARTZ_BOOTS, ModArmorMaterials.QUARTZ_KEY, itemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerators.declareCustomModelItem(ModBlocks.QUARTZ_CLUSTER.asItem());
        itemModelGenerators.declareCustomModelItem(ModBlocks.LARGE_QUARTZ_BUD.asItem());
        itemModelGenerators.declareCustomModelItem(ModBlocks.MEDIUM_QUARTZ_BUD.asItem());
        itemModelGenerators.declareCustomModelItem(ModBlocks.SMALL_QUARTZ_BUD.asItem());

        itemModelGenerators.generateFlatItem(ModItems.RUBY_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SAPPHIRE_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EMERALD_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TOPAZ_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.AMETHYST_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.QUARTZ_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.TOPAZ_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_TOPAZ_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.AMETHYST_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_AMETHYST_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.QUARTZ_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_QUARTZ_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_QUARTZ);

        createQuartzCluster(blockModelGenerators, ModBlocks.QUARTZ_CLUSTER);
        createQuartzCluster(blockModelGenerators, ModBlocks.LARGE_QUARTZ_BUD);
        createQuartzCluster(blockModelGenerators, ModBlocks.MEDIUM_QUARTZ_BUD);
        createQuartzCluster(blockModelGenerators, ModBlocks.SMALL_QUARTZ_BUD);
    }

    private void createQuartzCluster(BlockModelGenerators blockModels, Block clusterBlock) {
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CROSS.create(clusterBlock, TextureMapping.cross(clusterBlock), blockModels.modelOutput));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(clusterBlock, model).with(ROTATIONS_COLUMN_WITH_FACING));
    }
}
