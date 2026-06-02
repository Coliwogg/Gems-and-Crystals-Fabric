package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static EquipmentModel RUBY = EquipmentModel.builder().addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "ruby")).build();

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(35, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.5f,0.1f, ModTags.Items.RUBY_REPAIR,
            Identifier.of(GemsAndCrystals.MOD_ID, "ruby"));

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(35, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.5f,0.1f, ModTags.Items.SAPPHIRE_REPAIR,
            Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(32, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.5f,0.1f, ModTags.Items.EMERALD_REPAIR,
            Identifier.of(GemsAndCrystals.MOD_ID, "emerald"));

    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(22, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 9);
    }), 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0f,0f, ModTags.Items.TOPAZ_REPAIR,
            Identifier.of(GemsAndCrystals.MOD_ID, "topaz"));

    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(18, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 9);
    }), 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0f,0f, ModTags.Items.AMETHYST_REPAIR,
            Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"));

    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(10, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 7);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0f,0f, ModTags.Items.QUARTZ_REPAIR,
            Identifier.of(GemsAndCrystals.MOD_ID, "quartz"));
}
