package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.custom.ModAxeItem;
import com.coliwogg.gemsandcrystals.item.custom.ModHoeItem;
import com.coliwogg.gemsandcrystals.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY;
    public static final Item SAPPHIRE;
    public static final Item TOPAZ;
    public static final Item RUBY_SWORD;
    public static final Item RUBY_SHOVEL;
    public static final Item RUBY_PICKAXE;
    public static final Item RUBY_AXE;
    public static final Item RUBY_HOE;
    public static final Item SAPPHIRE_SWORD;
    public static final Item SAPPHIRE_SHOVEL;
    public static final Item SAPPHIRE_PICKAXE;
    public static final Item SAPPHIRE_AXE;
    public static final Item SAPPHIRE_HOE;
    public static final Item EMERALD_SWORD;
    public static final Item EMERALD_SHOVEL;
    public static final Item EMERALD_PICKAXE;
    public static final Item EMERALD_AXE;
    public static final Item EMERALD_HOE;
    public static final Item TOPAZ_SWORD;
    public static final Item TOPAZ_SHOVEL;
    public static final Item TOPAZ_PICKAXE;
    public static final Item TOPAZ_AXE;
    public static final Item TOPAZ_HOE;
    public static final Item AMETHYST_SWORD;
    public static final Item AMETHYST_SHOVEL;
    public static final Item AMETHYST_PICKAXE;
    public static final Item AMETHYST_AXE;
    public static final Item AMETHYST_HOE;
    public static final Item QUARTZ_SWORD;
    public static final Item QUARTZ_SHOVEL;
    public static final Item QUARTZ_PICKAXE;
    public static final Item QUARTZ_AXE;
    public static final Item QUARTZ_HOE;
    public static final Item RUBY_HELMET;
    public static final Item RUBY_CHESTPLATE;
    public static final Item RUBY_LEGGINGS;
    public static final Item RUBY_BOOTS;
    public static final Item SAPPHIRE_HELMET;
    public static final Item SAPPHIRE_CHESTPLATE;
    public static final Item SAPPHIRE_LEGGINGS;
    public static final Item SAPPHIRE_BOOTS;
    public static final Item EMERALD_HELMET;
    public static final Item EMERALD_CHESTPLATE;
    public static final Item EMERALD_LEGGINGS;
    public static final Item EMERALD_BOOTS;
    public static final Item TOPAZ_HELMET;
    public static final Item TOPAZ_CHESTPLATE;
    public static final Item TOPAZ_LEGGINGS;
    public static final Item TOPAZ_BOOTS;
    public static final Item AMETHYST_HELMET;
    public static final Item AMETHYST_CHESTPLATE;
    public static final Item AMETHYST_LEGGINGS;
    public static final Item AMETHYST_BOOTS;
    public static final Item QUARTZ_HELMET;
    public static final Item QUARTZ_CHESTPLATE;
    public static final Item QUARTZ_LEGGINGS;
    public static final Item QUARTZ_BOOTS;

    static {
        RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ = registerItem("topaz", new Item(new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 3, -2.4F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_PICKAXE = registerItem("ruby_pickaxe", new ModPickaxeItem(ModToolMaterial.RUBY, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_AXE = registerItem("ruby_axe", new ModAxeItem(ModToolMaterial.RUBY, 5.0F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_HOE = registerItem("ruby_hoe", new ModHoeItem(ModToolMaterial.RUBY, -3, 0.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 3, -2.4F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new ModPickaxeItem(ModToolMaterial.SAPPHIRE, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_AXE = registerItem("sapphire_axe", new ModAxeItem(ModToolMaterial.SAPPHIRE, 5.0F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_HOE = registerItem("sapphire_hoe", new ModHoeItem(ModToolMaterial.SAPPHIRE, -3, 0.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterial.EMERALD, 3, -2.4F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterial.EMERALD, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_PICKAXE = registerItem("emerald_pickaxe", new ModPickaxeItem(ModToolMaterial.EMERALD, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_AXE = registerItem("emerald_axe", new ModAxeItem(ModToolMaterial.EMERALD, 5.0F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_HOE = registerItem("emerald_hoe", new ModHoeItem(ModToolMaterial.EMERALD, -3, 0.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_SWORD = registerItem("topaz_sword", new SwordItem(ModToolMaterial.TOPAZ, 3, -2.4F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_SHOVEL = registerItem("topaz_shovel", new ShovelItem(ModToolMaterial.TOPAZ, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_PICKAXE = registerItem("topaz_pickaxe", new ModPickaxeItem(ModToolMaterial.TOPAZ, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_AXE = registerItem("topaz_axe", new ModAxeItem(ModToolMaterial.TOPAZ, 5.5F, -3.1F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_HOE = registerItem("topaz_hoe", new ModHoeItem(ModToolMaterial.TOPAZ, -2, -1.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(ModToolMaterial.AMETHYST, 3, -2.4F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(ModToolMaterial.AMETHYST, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new ModPickaxeItem(ModToolMaterial.AMETHYST, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_AXE = registerItem("amethyst_axe", new ModAxeItem(ModToolMaterial.AMETHYST, 5.0F, -3.1F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_HOE = registerItem("amethyst_hoe", new ModHoeItem(ModToolMaterial.AMETHYST, -2, -2.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_SWORD = registerItem("quartz_sword", new SwordItem(ModToolMaterial.QUARTZ, 2, -2.4F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_SHOVEL = registerItem("quartz_shovel", new ShovelItem(ModToolMaterial.QUARTZ, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_PICKAXE = registerItem("quartz_pickaxe", new ModPickaxeItem(ModToolMaterial.QUARTZ, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_AXE = registerItem("quartz_axe", new ModAxeItem(ModToolMaterial.QUARTZ, 4.5F, -3.2F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_HOE = registerItem("quartz_hoe", new ModHoeItem(ModToolMaterial.QUARTZ, -1, -2.0F, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_HELMET = registerItem("topaz_helmet", new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_CHESTPLATE = registerItem("topaz_chestplate", new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_LEGGINGS = registerItem("topaz_leggings", new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        TOPAZ_BOOTS = registerItem("topaz_boots", new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_HELMET = registerItem("amethyst_helmet", new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate", new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_LEGGINGS = registerItem("amethyst_leggings", new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        AMETHYST_BOOTS = registerItem("amethyst_boots", new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_HELMET = registerItem("quartz_helmet", new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_CHESTPLATE = registerItem("quartz_chestplate", new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_LEGGINGS = registerItem("quartz_leggings", new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
        QUARTZ_BOOTS = registerItem("quartz_boots", new ArmorItem(ModArmorMaterial.QUARTZ, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.GEMS_AND_CRYSTALS)));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GemsAndCrystals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GemsAndCrystals.LOGGER.info("Registering ModItems for " + GemsAndCrystals.MOD_ID);
    }

}
