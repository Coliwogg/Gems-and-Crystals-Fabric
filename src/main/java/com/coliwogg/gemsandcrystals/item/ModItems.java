package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item TOPAZ = registerItem("topaz", Item::new);

    public static final Item RUBY_SWORD = registerItem("ruby_sword", properties -> new Item(properties.sword(ModToolMaterials.RUBY, 4, -2.4f)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", properties -> new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3f, properties));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.RUBY, 1f, -2.8f)));
    public static final Item RUBY_AXE = registerItem("ruby_axe", properties -> new AxeItem(ModToolMaterials.RUBY, 6f, -3.2f, properties));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", properties -> new HoeItem(ModToolMaterials.RUBY, -4f, 0f, properties));
    public static final Item RUBY_SPEAR = registerItem("ruby_spear", properties -> new Item(properties.spear(ModToolMaterials.RUBY,  1.15f, 1.20f, 0.40f, 1.5f, 7.0f, 5.5f, 5.1f, 8.75f, 4.6f)));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", properties -> new Item(properties.sword(ModToolMaterials.SAPPHIRE, 3, -2.4f)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", properties -> new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3f, properties));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.SAPPHIRE, 1f, -2.8f)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", properties -> new AxeItem(ModToolMaterials.SAPPHIRE, 5f, -3f, properties));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", properties -> new HoeItem(ModToolMaterials.SAPPHIRE, -3f, 0f, properties));
    public static final Item SAPPHIRE_SPEAR = registerItem("sapphire_spear", properties -> new Item(properties.spear(ModToolMaterials.SAPPHIRE, 1.10f, 1.14f, 0.45f, 1.8f, 7.2f, 6.0f, 5.1f, 9.4f, 4.6f)));

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", properties -> new Item(properties.sword(ModToolMaterials.EMERALD, 3, -2.4f)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", properties -> new ShovelItem(ModToolMaterials.EMERALD, 1.5f, -3f, properties));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.EMERALD, 1f, -2.8f)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", properties -> new AxeItem(ModToolMaterials.EMERALD, 5f, -3f, properties));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", properties -> new HoeItem(ModToolMaterials.EMERALD, -3f, 0f, properties));
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear", properties -> new Item(properties.spear(ModToolMaterials.EMERALD, 1.05f, 1.075f, 0.50f, 2.0f, 7.5f, 6.5f, 5.1f, 10.0f, 4.6f)));

    public static final Item TOPAZ_SWORD = registerItem("topaz_sword", properties -> new Item(properties.sword(ModToolMaterials.TOPAZ, 2, -1.8f)));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel", properties -> new ShovelItem(ModToolMaterials.TOPAZ, 1.5f, -3f, properties));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.TOPAZ, 1f, -2.8f)));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe", properties -> new AxeItem(ModToolMaterials.TOPAZ, 4f, -2.9f, properties));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe", properties -> new HoeItem(ModToolMaterials.TOPAZ, -2f, -1f, properties));
    public static final Item TOPAZ_SPEAR = registerItem("topaz_spear", properties -> new Item(properties.spear(ModToolMaterials.TOPAZ, 1.02f, 1.02f, 0.55f, 2.2f, 7.6f, 6.5f, 5.1f, 10.2f, 4.6f)));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", properties -> new Item(properties.sword(ModToolMaterials.AMETHYST, 2, -2.4f)));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", properties -> new ShovelItem(ModToolMaterials.AMETHYST, 1.5f, -3f, properties));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.AMETHYST, 1f, -2.8f)));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", properties -> new AxeItem(ModToolMaterials.AMETHYST, 5f, -3.1f, properties));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", properties -> new HoeItem(ModToolMaterials.AMETHYST, -2f, -1f, properties));
    public static final Item AMETHYST_SPEAR = registerItem("amethyst_spear", properties -> new Item(properties.spear(ModToolMaterials.AMETHYST, 1.00f, 1.00f, 0.57f, 2.3f, 7.6f, 6.5f, 5.1f, 10.5f, 4.6f)));

    public static final Item QUARTZ_SWORD = registerItem("quartz_sword", properties -> new Item(properties.sword(ModToolMaterials.QUARTZ, 3, -2.4f)));
    public static final Item QUARTZ_SHOVEL = registerItem("quartz_shovel", properties -> new ShovelItem(ModToolMaterials.QUARTZ, 1.5f, -3f, properties));
    public static final Item QUARTZ_PICKAXE = registerItem("quartz_pickaxe", properties -> new Item(properties.pickaxe(ModToolMaterials.QUARTZ, 1f, -2.8f)));
    public static final Item QUARTZ_AXE = registerItem("quartz_axe", properties -> new AxeItem(ModToolMaterials.QUARTZ, 5f, -3.2f, properties));
    public static final Item QUARTZ_HOE = registerItem("quartz_hoe", properties -> new HoeItem(ModToolMaterials.QUARTZ, -2f, -3f, properties));
    public static final Item QUARTZ_SPEAR = registerItem("quartz_spear", properties -> new Item(properties.spear(ModToolMaterials.QUARTZ, 0.95f, 0.95f, 0.62f, 2.4f, 7.8f, 6.6f, 5.1f, 11.0f, 4.6f)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots", properties -> new Item(properties.humanoidArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor", properties -> new Item(properties.horseArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL)));
    public static final Item SAPPHIRE_HORSE_ARMOR = registerItem("sapphire_horse_armor", properties -> new Item(properties.horseArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL)));
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor", properties -> new Item(properties.horseArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL)));
    public static final Item TOPAZ_HORSE_ARMOR = registerItem("topaz_horse_armor", properties -> new Item(properties.horseArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL)));
    public static final Item AMETHYST_HORSE_ARMOR = registerItem("amethyst_horse_armor", properties -> new Item(properties.horseArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL)));
    public static final Item QUARTZ_HORSE_ARMOR = registerItem("quartz_horse_armor", properties -> new Item(properties.horseArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL)));

    private static void addItemsToIngredientItemGroup(FabricCreativeModeTabOutput output) {
        output.accept(RUBY);
        output.accept(SAPPHIRE);
        output.accept(TOPAZ);
    }

    private static void addItemsToIngredientToolGroup(FabricCreativeModeTabOutput output) {
        output.accept(RUBY_SHOVEL);
        output.accept(RUBY_PICKAXE);
        output.accept(RUBY_AXE);
        output.accept(RUBY_HOE);
        output.accept(SAPPHIRE_SHOVEL);
        output.accept(SAPPHIRE_PICKAXE);
        output.accept(SAPPHIRE_AXE);
        output.accept(SAPPHIRE_HOE);
        output.accept(EMERALD_SHOVEL);
        output.accept(EMERALD_PICKAXE);
        output.accept(EMERALD_AXE);
        output.accept(EMERALD_HOE);
        output.accept(TOPAZ_SHOVEL);
        output.accept(TOPAZ_PICKAXE);
        output.accept(TOPAZ_AXE);
        output.accept(TOPAZ_HOE);
        output.accept(AMETHYST_SHOVEL);
        output.accept(AMETHYST_PICKAXE);
        output.accept(AMETHYST_AXE);
        output.accept(AMETHYST_HOE);
        output.accept(QUARTZ_SHOVEL);
        output.accept(QUARTZ_PICKAXE);
        output.accept(QUARTZ_AXE);
        output.accept(QUARTZ_HOE);
    }

    private static void addItemsToIngredientCombatGroup(FabricCreativeModeTabOutput output) {
        output.accept(RUBY_SWORD);
        output.accept(SAPPHIRE_SWORD);
        output.accept(EMERALD_SWORD);
        output.accept(TOPAZ_SWORD);
        output.accept(AMETHYST_SWORD);
        output.accept(QUARTZ_SWORD);
        output.accept(RUBY_AXE);
        output.accept(SAPPHIRE_AXE);
        output.accept(EMERALD_AXE);
        output.accept(TOPAZ_AXE);
        output.accept(AMETHYST_AXE);
        output.accept(QUARTZ_AXE);
        output.accept(RUBY_SPEAR);
        output.accept(SAPPHIRE_SPEAR);
        output.accept(EMERALD_SPEAR);
        output.accept(TOPAZ_SPEAR);
        output.accept(AMETHYST_SPEAR);
        output.accept(QUARTZ_SPEAR);
        output.accept(ModItems.RUBY_HELMET);
        output.accept(ModItems.RUBY_CHESTPLATE);
        output.accept(ModItems.RUBY_LEGGINGS);
        output.accept(ModItems.RUBY_BOOTS);
        output.accept(ModItems.SAPPHIRE_HELMET);
        output.accept(ModItems.SAPPHIRE_CHESTPLATE);
        output.accept(ModItems.SAPPHIRE_LEGGINGS);
        output.accept(ModItems.SAPPHIRE_BOOTS);
        output.accept(ModItems.EMERALD_HELMET);
        output.accept(ModItems.EMERALD_CHESTPLATE);
        output.accept(ModItems.EMERALD_LEGGINGS);
        output.accept(ModItems.EMERALD_BOOTS);
        output.accept(ModItems.TOPAZ_HELMET);
        output.accept(ModItems.TOPAZ_CHESTPLATE);
        output.accept(ModItems.TOPAZ_LEGGINGS);
        output.accept(ModItems.TOPAZ_BOOTS);
        output.accept(ModItems.AMETHYST_HELMET);
        output.accept(ModItems.AMETHYST_CHESTPLATE);
        output.accept(ModItems.AMETHYST_LEGGINGS);
        output.accept(ModItems.AMETHYST_BOOTS);
        output.accept(ModItems.QUARTZ_HELMET);
        output.accept(ModItems.QUARTZ_CHESTPLATE);
        output.accept(ModItems.QUARTZ_LEGGINGS);
        output.accept(ModItems.QUARTZ_BOOTS);
        output.accept(ModItems.RUBY_HORSE_ARMOR);
        output.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
        output.accept(ModItems.EMERALD_HORSE_ARMOR);
        output.accept(ModItems.TOPAZ_HORSE_ARMOR);
        output.accept(ModItems.AMETHYST_HORSE_ARMOR);
        output.accept(ModItems.QUARTZ_HORSE_ARMOR);
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, GemsAndCrystals.identifier(name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, GemsAndCrystals.identifier(name)))));
    }

    public static void registerModItems() {
        GemsAndCrystals.LOGGER.info("Registering Mod Items for " + GemsAndCrystals.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(ModItems::addItemsToIngredientToolGroup);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(ModItems::addItemsToIngredientCombatGroup);
    }
}
