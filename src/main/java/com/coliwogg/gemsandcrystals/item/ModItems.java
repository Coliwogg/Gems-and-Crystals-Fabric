package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item TOPAZ = registerItem("topaz", Item::new);

    public static final Item RUBY_SWORD = registerItem("ruby_sword", setting -> new Item(setting.sword(ModToolMaterials.RUBY, 4, -2.4f)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", setting -> new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3f, setting));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", setting -> new Item(setting.pickaxe(ModToolMaterials.RUBY, 1f, -2.8f)));
    public static final Item RUBY_AXE = registerItem("ruby_axe", setting -> new AxeItem(ModToolMaterials.RUBY, 6f, -3.2f, setting));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", setting -> new HoeItem(ModToolMaterials.RUBY, -4f, 0f, setting));
    public static final Item RUBY_SPEAR = registerItem("ruby_spear", setting -> new Item(setting.spear(ModToolMaterials.RUBY,  1.15f, 1.20f, 0.40f, 1.5f, 7.0f, 5.5f, 5.1f, 8.75f, 4.6f)));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", setting -> new Item(setting.sword(ModToolMaterials.SAPPHIRE, 3, -2.4f)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", setting -> new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3f, setting));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", setting -> new Item(setting.pickaxe(ModToolMaterials.SAPPHIRE, 1f, -2.8f)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", setting -> new AxeItem(ModToolMaterials.SAPPHIRE, 5f, -3f, setting));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", setting -> new HoeItem(ModToolMaterials.SAPPHIRE, -3f, 0f, setting));
    public static final Item SAPPHIRE_SPEAR = registerItem("sapphire_spear", setting -> new Item(setting.spear(ModToolMaterials.SAPPHIRE, 1.10f, 1.14f, 0.45f, 1.8f, 7.2f, 6.0f, 5.1f, 9.4f, 4.6f)));

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", setting -> new Item(setting.sword(ModToolMaterials.EMERALD, 3, -2.4f)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", setting -> new ShovelItem(ModToolMaterials.EMERALD, 1.5f, -3f, setting));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", setting -> new Item(setting.pickaxe(ModToolMaterials.EMERALD, 1f, -2.8f)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", setting -> new AxeItem(ModToolMaterials.EMERALD, 5f, -3f, setting));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", setting -> new HoeItem(ModToolMaterials.EMERALD, -3f, 0f, setting));
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear", setting -> new Item(setting.spear(ModToolMaterials.EMERALD, 1.05f, 1.075f, 0.50f, 2.0f, 7.5f, 6.5f, 5.1f, 10.0f, 4.6f)));

    public static final Item TOPAZ_SWORD = registerItem("topaz_sword", setting -> new Item(setting.sword(ModToolMaterials.TOPAZ, 2, -1.8f)));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel", setting -> new ShovelItem(ModToolMaterials.TOPAZ, 1.5f, -3f, setting));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe", setting -> new Item(setting.pickaxe(ModToolMaterials.TOPAZ, 1f, -2.8f)));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe", setting -> new AxeItem(ModToolMaterials.TOPAZ, 4f, -2.9f, setting));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe", setting -> new HoeItem(ModToolMaterials.TOPAZ, -2f, -1f, setting));
    public static final Item TOPAZ_SPEAR = registerItem("topaz_spear", setting -> new Item(setting.spear(ModToolMaterials.TOPAZ, 1.02f, 1.02f, 0.55f, 2.2f, 7.6f, 6.5f, 5.1f, 10.2f, 4.6f)));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", setting -> new Item(setting.sword(ModToolMaterials.AMETHYST, 2, -2.4f)));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", setting -> new ShovelItem(ModToolMaterials.AMETHYST, 1.5f, -3f, setting));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", setting -> new Item(setting.pickaxe(ModToolMaterials.AMETHYST, 1f, -2.8f)));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", setting -> new AxeItem(ModToolMaterials.AMETHYST, 5f, -3.1f, setting));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", setting -> new HoeItem(ModToolMaterials.AMETHYST, -2f, -1f, setting));
    public static final Item AMETHYST_SPEAR = registerItem("amethyst_spear", setting -> new Item(setting.spear(ModToolMaterials.AMETHYST, 1.00f, 1.00f, 0.57f, 2.3f, 7.6f, 6.5f, 5.1f, 10.5f, 4.6f)));

    public static final Item QUARTZ_SWORD = registerItem("quartz_sword", setting -> new Item(setting.sword(ModToolMaterials.QUARTZ, 3, -2.4f)));
    public static final Item QUARTZ_SHOVEL = registerItem("quartz_shovel", setting -> new ShovelItem(ModToolMaterials.QUARTZ, 1.5f, -3f, setting));
    public static final Item QUARTZ_PICKAXE = registerItem("quartz_pickaxe", setting -> new Item(setting.pickaxe(ModToolMaterials.QUARTZ, 1f, -2.8f)));
    public static final Item QUARTZ_AXE = registerItem("quartz_axe", setting -> new AxeItem(ModToolMaterials.QUARTZ, 5f, -3.2f, setting));
    public static final Item QUARTZ_HOE = registerItem("quartz_hoe", setting -> new HoeItem(ModToolMaterials.QUARTZ, -2f, -3f, setting));
    public static final Item QUARTZ_SPEAR = registerItem("quartz_spear", setting -> new Item(setting.spear(ModToolMaterials.QUARTZ, 0.95f, 0.95f, 0.62f, 2.4f, 7.8f, 6.6f, 5.1f, 11.0f, 4.6f)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", setting -> new Item(setting.armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", setting -> new Item(setting.armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", setting -> new Item(setting.armor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, EquipmentType.BOOTS)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", setting -> new Item(setting.armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", setting -> new Item(setting.armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", setting -> new Item(setting.armor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, EquipmentType.BOOTS)));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", setting -> new Item(setting.armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", setting -> new Item(setting.armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", setting -> new Item(setting.armor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, EquipmentType.BOOTS)));

    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet", setting -> new Item(setting.armor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings", setting -> new Item(setting.armor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots", setting -> new Item(setting.armor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, EquipmentType.BOOTS)));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet", setting -> new Item(setting.armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings", setting -> new Item(setting.armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots", setting -> new Item(setting.armor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, EquipmentType.BOOTS)));

    public static final Item QUARTZ_HELMET = registerItem("quartz_helmet", setting -> new Item(setting.armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.HELMET)));
    public static final Item QUARTZ_CHESTPLATE = registerItem("quartz_chestplate", setting -> new Item(setting.armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
    public static final Item QUARTZ_LEGGINGS = registerItem("quartz_leggings", setting -> new Item(setting.armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
    public static final Item QUARTZ_BOOTS = registerItem("quartz_boots", setting -> new Item(setting.armor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL, EquipmentType.BOOTS)));

    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL)));
    public static final Item SAPPHIRE_HORSE_ARMOR = registerItem("sapphire_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL)));
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL)));
    public static final Item TOPAZ_HORSE_ARMOR = registerItem("topaz_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL)));
    public static final Item AMETHYST_HORSE_ARMOR = registerItem("amethyst_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL)));
    public static final Item QUARTZ_HORSE_ARMOR = registerItem("quartz_horse_armor", setting -> new Item(setting.horseArmor(ModArmorMaterials.QUARTZ_ARMOR_MATERIAL)));

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
        entries.add(RUBY_SPEAR);
        entries.add(SAPPHIRE_SPEAR);
        entries.add(EMERALD_SPEAR);
        entries.add(TOPAZ_SPEAR);
        entries.add(AMETHYST_SPEAR);
        entries.add(QUARTZ_SPEAR);
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

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(GemsAndCrystals.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GemsAndCrystals.MOD_ID, name)))));
    }

    public static void registerModItems() {
        GemsAndCrystals.LOGGER.info("Registering Mod Items for " + GemsAndCrystals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientToolGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientCombatGroup);
    }
}
