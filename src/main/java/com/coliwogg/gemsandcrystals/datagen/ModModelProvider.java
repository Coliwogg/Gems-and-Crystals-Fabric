package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;

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

        itemModelGenerator.registerArmor(ModItems.RUBY_HELMET, Identifier.of(GemsAndCrystals.MOD_ID, "ruby"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "ruby")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.RUBY_CHESTPLATE, Identifier.of(GemsAndCrystals.MOD_ID, "ruby"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "ruby")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.RUBY_LEGGINGS, Identifier.of(GemsAndCrystals.MOD_ID, "ruby"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "ruby")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.RUBY_BOOTS, Identifier.of(GemsAndCrystals.MOD_ID, "ruby"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "ruby")).build(), EquipmentSlot.FEET);

        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_HELMET, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_CHESTPLATE, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_LEGGINGS, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_BOOTS, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire")).build(), EquipmentSlot.FEET);

        itemModelGenerator.registerArmor(ModItems.EMERALD_HELMET, Identifier.of(GemsAndCrystals.MOD_ID, "emerald"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "emerald")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.EMERALD_CHESTPLATE, Identifier.of(GemsAndCrystals.MOD_ID, "emerald"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "emerald")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.EMERALD_LEGGINGS, Identifier.of(GemsAndCrystals.MOD_ID, "emerald"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "emerald")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.EMERALD_BOOTS, Identifier.of(GemsAndCrystals.MOD_ID, "emerald"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "emerald")).build(), EquipmentSlot.FEET);

        itemModelGenerator.registerArmor(ModItems.TOPAZ_HELMET, Identifier.of(GemsAndCrystals.MOD_ID, "topaz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "topaz")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.TOPAZ_CHESTPLATE, Identifier.of(GemsAndCrystals.MOD_ID, "topaz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "topaz")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.TOPAZ_LEGGINGS, Identifier.of(GemsAndCrystals.MOD_ID, "topaz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "topaz")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.TOPAZ_BOOTS, Identifier.of(GemsAndCrystals.MOD_ID, "topaz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "topaz")).build(), EquipmentSlot.FEET);

        itemModelGenerator.registerArmor(ModItems.AMETHYST_HELMET, Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.AMETHYST_CHESTPLATE, Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.AMETHYST_LEGGINGS, Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.AMETHYST_BOOTS, Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst")).build(), EquipmentSlot.FEET);

        itemModelGenerator.registerArmor(ModItems.QUARTZ_HELMET, Identifier.of(GemsAndCrystals.MOD_ID, "quartz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "quartz")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.QUARTZ_CHESTPLATE, Identifier.of(GemsAndCrystals.MOD_ID, "quartz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "quartz")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.QUARTZ_LEGGINGS, Identifier.of(GemsAndCrystals.MOD_ID, "quartz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "quartz")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.QUARTZ_BOOTS, Identifier.of(GemsAndCrystals.MOD_ID, "quartz"), EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "quartz")).build(), EquipmentSlot.FEET);

        itemModelGenerator.register(ModItems.RUBY_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOPAZ_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUARTZ_HORSE_ARMOR, Models.GENERATED);


    }
}
