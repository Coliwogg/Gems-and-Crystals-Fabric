package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> RUBY_ARMOR_MATERIAL = registerArmorMaterial("ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RUBY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "ruby"))), 0, 0));

    public static final RegistryEntry<ArmorMaterial> SAPPHIRE_ARMOR_MATERIAL = registerArmorMaterial("sapphire",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"))), 2.5f, 0.1f));

    public static final RegistryEntry<ArmorMaterial> EMERALD_ARMOR_MATERIAL = registerArmorMaterial("emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 32, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.EMERALD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "emerald"))), 1.5f, 0.1f));

    public static final RegistryEntry<ArmorMaterial> TOPAZ_ARMOR_MATERIAL = registerArmorMaterial("topaz",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 4);
            }), 22, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(ModItems.TOPAZ),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "topaz"))), 0f, 0f));

    public static final RegistryEntry<ArmorMaterial> AMETHYST_ARMOR_MATERIAL = registerArmorMaterial("amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 32, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(Items.AMETHYST_SHARD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"))), 0f, 0f));

    public static final RegistryEntry<ArmorMaterial> QUARTZ_ARMOR_MATERIAL = registerArmorMaterial("quartz",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 4);
            }), 32, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, () -> Ingredient.ofItems(Items.QUARTZ),
                    List.of(new ArmorMaterial.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "quartz"))), 0f, 0f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(GemsAndCrystals.MOD_ID, name), material.get());
    }
}
