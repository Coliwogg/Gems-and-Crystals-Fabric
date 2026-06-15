package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class ModArmorMaterials {

    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"));
    public static final ResourceKey<EquipmentAsset> SAPPHIRE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"));
    public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"));
    public static final ResourceKey<EquipmentAsset> TOPAZ_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"));
    public static final ResourceKey<EquipmentAsset> AMETHYST_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"));
    public static final ResourceKey<EquipmentAsset> QUARTZ_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"));

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(37,
            ArmorMaterials.makeDefense(3, 6, 8, 3, 11),
            10, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3f, 0.25f, ModTags.Items.RUBY_REPAIR, RUBY_KEY);

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(28,
            ArmorMaterials.makeDefense(3, 5, 7, 3, 10),
            25, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2f, 0, ModTags.Items.SAPPHIRE_REPAIR, SAPPHIRE_KEY);

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(22,
            ArmorMaterials.makeDefense(2, 5, 6, 3, 9),
            20, SoundEvents.ARMOR_EQUIP_DIAMOND,
            1f, 0, ModTags.Items.EMERALD_REPAIR, EMERALD_KEY);

    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(16,
            ArmorMaterials.makeDefense(2, 4, 5, 2, 7),
            14, SoundEvents.ARMOR_EQUIP_GENERIC,
            1f, 0, ModTags.Items.TOPAZ_REPAIR, TOPAZ_KEY);

    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(12,
            ArmorMaterials.makeDefense(1, 3, 4, 2, 5),
            18, SoundEvents.ARMOR_EQUIP_GENERIC,
            0, 0, ModTags.Items.AMETHYST_REPAIR, AMETHYST_KEY);

    public static final ArmorMaterial QUARTZ_ARMOR_MATERIAL = new ArmorMaterial(6,
            ArmorMaterials.makeDefense(2, 3, 5, 2, 6),
            8, SoundEvents.ARMOR_EQUIP_GENERIC,
            0, 0, ModTags.Items.QUARTZ_REPAIR, QUARTZ_KEY);
}
