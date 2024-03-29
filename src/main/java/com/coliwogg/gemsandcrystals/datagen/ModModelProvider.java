package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMETHYST_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AMETHYST_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_QUARTZ_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TOPAZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.EMERALD_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.EMERALD_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.EMERALD_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.EMERALD_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TOPAZ_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TOPAZ_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TOPAZ_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TOPAZ_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AMETHYST_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AMETHYST_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AMETHYST_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AMETHYST_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.QUARTZ_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.QUARTZ_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.QUARTZ_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.QUARTZ_BOOTS);

        itemModelGenerator.register(ModItems.RUBY_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUARTZ_HORSE_ARMOR, Models.GENERATED);


    }
}
