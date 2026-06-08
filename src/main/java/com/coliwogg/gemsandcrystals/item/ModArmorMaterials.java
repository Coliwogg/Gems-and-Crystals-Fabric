package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {

    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> RUBY_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(GemsAndCrystals.MOD_ID, "ruby"));
    public static final RegistryKey<EquipmentAsset> SAPPHIRE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"));
    public static final RegistryKey<EquipmentAsset> EMERALD_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(GemsAndCrystals.MOD_ID, "emerald"));
    public static final RegistryKey<EquipmentAsset> TOPAZ_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(GemsAndCrystals.MOD_ID, "topaz"));
    public static final RegistryKey<EquipmentAsset> AMETHYST_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"));
    public static final RegistryKey<EquipmentAsset> QUARTZ_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(GemsAndCrystals.MOD_ID, "quartz"));

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(37, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0f,0.25f, ModTags.Items.RUBY_REPAIR, RUBY_KEY);

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(28, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 7);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 10);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0f,0.0f, ModTags.Items.SAPPHIRE_REPAIR, SAPPHIRE_KEY);

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(22, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 9);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.0f,0.0f, ModTags.Items.EMERALD_REPAIR, EMERALD_KEY);

    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(16, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 7);
    }), 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,1.0f,0.0f, ModTags.Items.TOPAZ_REPAIR, TOPAZ_KEY);

    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(12, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 1);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 4);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 5);
    }), 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0f,0f, ModTags.Items.AMETHYST_REPAIR, AMETHYST_KEY);

    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(6, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 3);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 6);
    }), 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0f,0f, ModTags.Items.QUARTZ_REPAIR, QUARTZ_KEY);
}
