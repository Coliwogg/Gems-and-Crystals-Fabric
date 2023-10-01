package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 5, -3, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, -4, 0, new FabricItemSettings()));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 3, -2.4f, new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 1.5f, -3, new FabricItemSettings()));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPPHIRE, 1, -2.8f, new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new AxeItem(ModToolMaterial.SAPPHIRE, 5, -3, new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, -4, 0, new FabricItemSettings()));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterial.EMERALD, 3, -2.4f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterial.EMERALD, 1.5f, -3, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterial.EMERALD, 1, -2.8f, new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterial.EMERALD, 5, -3, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterial.EMERALD, -3, 0, new FabricItemSettings()));
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword", new SwordItem(ModToolMaterial.TOPAZ, 3, -2.4f, new FabricItemSettings()));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel", new ShovelItem(ModToolMaterial.TOPAZ, 2, -3, new FabricItemSettings()));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe", new PickaxeItem(ModToolMaterial.TOPAZ, 1, -2.8f, new FabricItemSettings()));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe", new AxeItem(ModToolMaterial.TOPAZ, 6, -3.1f, new FabricItemSettings()));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe", new HoeItem(ModToolMaterial.TOPAZ, -2, -1, new FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(ModToolMaterial.AMETHYST, 2, -2.4f, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(ModToolMaterial.AMETHYST, 1.5f, -3, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new PickaxeItem(ModToolMaterial.AMETHYST, 1, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", new AxeItem(ModToolMaterial.AMETHYST, 5, -3.1f, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", new HoeItem(ModToolMaterial.AMETHYST, -2, -1, new FabricItemSettings()));
    public static final Item QUARTZ_SWORD = registerItem("quartz_sword", new SwordItem(ModToolMaterial.QUARTZ, 3, -2.4f, new FabricItemSettings()));
    public static final Item QUARTZ_SHOVEL = registerItem("quartz_shovel", new ShovelItem(ModToolMaterial.QUARTZ, 2, -3, new FabricItemSettings()));
    public static final Item QUARTZ_PICKAXE = registerItem("quartz_pickaxe", new PickaxeItem(ModToolMaterial.QUARTZ, 1, -2.8f, new FabricItemSettings()));
    public static final Item QUARTZ_AXE = registerItem("quartz_axe", new AxeItem(ModToolMaterial.QUARTZ, 6, -3.2f, new FabricItemSettings()));
    public static final Item QUARTZ_HOE = registerItem("quartz_hoe", new HoeItem(ModToolMaterial.QUARTZ, -1, -2, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterial.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet", new ArmorItem(ModArmorMaterial.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate", new ArmorItem(ModArmorMaterial.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings", new ArmorItem(ModArmorMaterial.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots", new ArmorItem(ModArmorMaterial.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet", new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate", new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings", new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots", new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet", new ArmorItem(ModArmorMaterial.QUARTZ, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate", new ArmorItem(ModArmorMaterial.QUARTZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings", new ArmorItem(ModArmorMaterial.QUARTZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots", new ArmorItem(ModArmorMaterial.QUARTZ, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor", new HorseArmorItem(13, "ruby", new FabricItemSettings()));
    public static final Item SAPPHIRE_HORSE_ARMOR = registerItem("sapphire_horse_armor", new HorseArmorItem(13, "sapphire", new FabricItemSettings()));
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor", new HorseArmorItem(13, "emerald", new FabricItemSettings()));
    public static final Item TOPAZ_HORSE_ARMOR = registerItem("topaz_horse_armor", new HorseArmorItem(13, "topaz", new FabricItemSettings()));
    public static final Item AMETHYST_HORSE_ARMOR = registerItem("amethyst_horse_armor", new HorseArmorItem(13, "amethyst", new FabricItemSettings()));
    public static final Item QUARTZ_HORSE_ARMOR = registerItem("quartz_horse_armor", new HorseArmorItem(13, "quartz", new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(SAPPHIRE);
        entries.add(TOPAZ);
    }

    private static void addItemsToIngredientToolGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY_SHOVEL);
        entries.add(RUBY_PICKAXE);
        entries.add(RUBY_AXE);
        entries.add(RUBY_HOE);
        entries.add(SAPPHIRE_SHOVEL);
        entries.add(SAPPHIRE_PICKAXE);
        entries.add(SAPPHIRE_AXE);
        entries.add(SAPPHIRE_HOE);
        entries.add(EMERALD_SHOVEL);
        entries.add(EMERALD_PICKAXE);
        entries.add(EMERALD_AXE);
        entries.add(EMERALD_HOE);
        entries.add(TOPAZ_SHOVEL);
        entries.add(TOPAZ_PICKAXE);
        entries.add(TOPAZ_AXE);
        entries.add(TOPAZ_HOE);
        entries.add(AMETHYST_SHOVEL);
        entries.add(AMETHYST_PICKAXE);
        entries.add(AMETHYST_AXE);
        entries.add(AMETHYST_HOE);
        entries.add(QUARTZ_SHOVEL);
        entries.add(QUARTZ_PICKAXE);
        entries.add(QUARTZ_AXE);
        entries.add(QUARTZ_HOE);
    }

    private static void addItemsToIngredientCombatGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY_SWORD);
        entries.add(SAPPHIRE_SWORD);
        entries.add(EMERALD_SWORD);
        entries.add(TOPAZ_SWORD);
        entries.add(AMETHYST_SWORD);
        entries.add(QUARTZ_SWORD);
        entries.add(RUBY_AXE);
        entries.add(SAPPHIRE_AXE);
        entries.add(EMERALD_AXE);
        entries.add(TOPAZ_AXE);
        entries.add(AMETHYST_AXE);
        entries.add(QUARTZ_AXE);
        entries.add(ModItems.RUBY_HELMET);
        entries.add(ModItems.RUBY_CHESTPLATE);
        entries.add(ModItems.RUBY_LEGGINGS);
        entries.add(ModItems.RUBY_BOOTS);
        entries.add(ModItems.SAPPHIRE_HELMET);
        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
        entries.add(ModItems.SAPPHIRE_LEGGINGS);
        entries.add(ModItems.SAPPHIRE_BOOTS);
        entries.add(ModItems.EMERALD_HELMET);
        entries.add(ModItems.EMERALD_CHESTPLATE);
        entries.add(ModItems.EMERALD_LEGGINGS);
        entries.add(ModItems.EMERALD_BOOTS);
        entries.add(ModItems.TOPAZ_HELMET);
        entries.add(ModItems.TOPAZ_CHESTPLATE);
        entries.add(ModItems.TOPAZ_LEGGINGS);
        entries.add(ModItems.TOPAZ_BOOTS);
        entries.add(ModItems.AMETHYST_HELMET);
        entries.add(ModItems.AMETHYST_CHESTPLATE);
        entries.add(ModItems.AMETHYST_LEGGINGS);
        entries.add(ModItems.AMETHYST_BOOTS);
        entries.add(ModItems.QUARTZ_HELMET);
        entries.add(ModItems.QUARTZ_CHESTPLATE);
        entries.add(ModItems.QUARTZ_LEGGINGS);
        entries.add(ModItems.QUARTZ_BOOTS);
        entries.add(ModItems.RUBY_HORSE_ARMOR);
        entries.add(ModItems.SAPPHIRE_HORSE_ARMOR);
        entries.add(ModItems.EMERALD_HORSE_ARMOR);
        entries.add(ModItems.TOPAZ_HORSE_ARMOR);
        entries.add(ModItems.AMETHYST_HORSE_ARMOR);
        entries.add(ModItems.QUARTZ_HORSE_ARMOR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GemsAndCrystals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GemsAndCrystals.LOGGER.info("Registering Mod Items for " + GemsAndCrystals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientToolGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientCombatGroup);
    }
}
