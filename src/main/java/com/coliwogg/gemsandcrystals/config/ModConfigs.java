package com.coliwogg.gemsandcrystals.config;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    /* Ore Generation Configuration */
    public static int RUBY_MIN_HEIGHT;
    public static int RUBY_MAX_HEIGHT;
    public static int RUBY_VEIN_COUNT;
    public static int RUBY_VEIN_SIZE;
    public static boolean GENERATE_RUBY;

    public static int SAPPHIRE_MIN_HEIGHT;
    public static int SAPPHIRE_MAX_HEIGHT;
    public static int SAPPHIRE_VEIN_COUNT;
    public static int SAPPHIRE_VEIN_SIZE;
    public static boolean GENERATE_SAPPHIRE;

    public static int TOPAZ_MIN_HEIGHT;
    public static int TOPAZ_MAX_HEIGHT;
    public static int TOPAZ_VEIN_COUNT;
    public static int TOPAZ_VEIN_SIZE;
    public static boolean GENERATE_TOPAZ;

    public static int AMETHYST_MIN_HEIGHT;
    public static int AMETHYST_MAX_HEIGHT;
    public static int AMETHYST_VEIN_COUNT;
    public static int AMETHYST_VEIN_SIZE;
    public static boolean GENERATE_AMETHYST;

    public static int QUARTZ_MIN_HEIGHT;
    public static int QUARTZ_MAX_HEIGHT;
    public static int QUARTZ_VEIN_COUNT;
    public static int QUARTZ_VEIN_SIZE;
    public static boolean GENERATE_QUARTZ;

    /* Tool Material Configuration */
    public static int RUBY_MINING_LEVEL;
    public static int RUBY_ITEM_DURABILITY;
    public static float RUBY_MINING_SPEED;
    public static float RUBY_ATTACK_DAMAGE;
    public static int RUBY_ENCHANTABILITY;

    public static int SAPPHIRE_MINING_LEVEL;
    public static int SAPPHIRE_ITEM_DURABILITY;
    public static float SAPPHIRE_MINING_SPEED;
    public static float SAPPHIRE_ATTACK_DAMAGE;
    public static int SAPPHIRE_ENCHANTABILITY;

    public static int EMERALD_MINING_LEVEL;
    public static int EMERALD_ITEM_DURABILITY;
    public static float EMERALD_MINING_SPEED;
    public static float EMERALD_ATTACK_DAMAGE;
    public static int EMERALD_ENCHANTABILITY;

    public static int TOPAZ_MINING_LEVEL;
    public static int TOPAZ_ITEM_DURABILITY;
    public static float TOPAZ_MINING_SPEED;
    public static float TOPAZ_ATTACK_DAMAGE;
    public static int TOPAZ_ENCHANTABILITY;

    public static int AMETHYST_MINING_LEVEL;
    public static int AMETHYST_ITEM_DURABILITY;
    public static float AMETHYST_MINING_SPEED;
    public static float AMETHYST_ATTACK_DAMAGE;
    public static int AMETHYST_ENCHANTABILITY;

    public static int QUARTZ_MINING_LEVEL;
    public static int QUARTZ_ITEM_DURABILITY;
    public static float QUARTZ_MINING_SPEED;
    public static float QUARTZ_ATTACK_DAMAGE;
    public static int QUARTZ_ENCHANTABILITY;

    /* Armor Material Configuration */
    public static int RUBY_DURABILITY_MULTIPLIER;
    public static int RUBY_HELMET_STRENGTH;
    public static int RUBY_CHESTPLATE_STRENGTH;
    public static int RUBY_LEGGINGS_STRENGTH;
    public static int RUBY_BOOTS_STRENGTH;
    public static int RUBY_ARMOR_ENCHANTABILITY;
    public static float RUBY_TOUGHNESS;
    public static float RUBY_KNOCKBACK_RESISTANCE;

    public static int SAPPHIRE_DURABILITY_MULTIPLIER;
    public static int SAPPHIRE_HELMET_STRENGTH;
    public static int SAPPHIRE_CHESTPLATE_STRENGTH;
    public static int SAPPHIRE_LEGGINGS_STRENGTH;
    public static int SAPPHIRE_BOOTS_STRENGTH;
    public static int SAPPHIRE_ARMOR_ENCHANTABILITY;
    public static float SAPPHIRE_TOUGHNESS;
    public static float SAPPHIRE_KNOCKBACK_RESISTANCE;

    public static int EMERALD_DURABILITY_MULTIPLIER;
    public static int EMERALD_HELMET_STRENGTH;
    public static int EMERALD_CHESTPLATE_STRENGTH;
    public static int EMERALD_LEGGINGS_STRENGTH;
    public static int EMERALD_BOOTS_STRENGTH;
    public static int EMERALD_ARMOR_ENCHANTABILITY;
    public static float EMERALD_TOUGHNESS;
    public static float EMERALD_KNOCKBACK_RESISTANCE;

    public static int TOPAZ_DURABILITY_MULTIPLIER;
    public static int TOPAZ_HELMET_STRENGTH;
    public static int TOPAZ_CHESTPLATE_STRENGTH;
    public static int TOPAZ_LEGGINGS_STRENGTH;
    public static int TOPAZ_BOOTS_STRENGTH;
    public static int TOPAZ_ARMOR_ENCHANTABILITY;
    public static float TOPAZ_TOUGHNESS;
    public static float TOPAZ_KNOCKBACK_RESISTANCE;

    public static int AMETHYST_DURABILITY_MULTIPLIER;
    public static int AMETHYST_HELMET_STRENGTH;
    public static int AMETHYST_CHESTPLATE_STRENGTH;
    public static int AMETHYST_LEGGINGS_STRENGTH;
    public static int AMETHYST_BOOTS_STRENGTH;
    public static int AMETHYST_ARMOR_ENCHANTABILITY;
    public static float AMETHYST_TOUGHNESS;
    public static float AMETHYST_KNOCKBACK_RESISTANCE;

    public static int QUARTZ_DURABILITY_MULTIPLIER;
    public static int QUARTZ_HELMET_STRENGTH;
    public static int QUARTZ_CHESTPLATE_STRENGTH;
    public static int QUARTZ_LEGGINGS_STRENGTH;
    public static int QUARTZ_BOOTS_STRENGTH;
    public static int QUARTZ_ARMOR_ENCHANTABILITY;
    public static float QUARTZ_TOUGHNESS;
    public static float QUARTZ_KNOCKBACK_RESISTANCE;

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("ore_gen.ruby_ore.ruby_min_height", -80), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.ruby_ore.ruby_max_height", 16), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.ruby_ore.ruby_vein_count", 3), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.ruby_ore.ruby_vein_size", 3), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.ruby_ore.generate_ruby", true), "boolean");

        configs.addKeyValuePair(new Pair<>("ore_gen.sapphire_ore.sapphire_min_height", -80), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.sapphire_ore.sapphire_max_height", 16), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.sapphire_ore.sapphire_vein_count", 3), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.sapphire_ore.sapphire_vein_size", 3), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.sapphire_ore.generate_sapphire", true), "boolean");

        configs.addKeyValuePair(new Pair<>("ore_gen.topaz_ore.topaz_min_height", -80), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.topaz_ore.topaz_max_height", 24), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.topaz_ore.topaz_vein_count", 4), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.topaz_ore.topaz_vein_size", 4), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.topaz_ore.generate_topaz", true), "boolean");

        configs.addKeyValuePair(new Pair<>("ore_gen.amethyst_ore.amethyst_min_height", -80), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.amethyst_ore.amethyst_max_height", 32), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.amethyst_ore.amethyst_vein_count", 4), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.amethyst_ore.amethyst_vein_size", 4), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.amethyst_ore.generate_amethyst", true), "boolean");

        configs.addKeyValuePair(new Pair<>("ore_gen.quartz_ore.quartz_min_height", -80), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.quartz_ore.quartz_max_height", 48), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.quartz_ore.quartz_vein_count", 4), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.quartz_ore.quartz_vein_size", 4), "int");
        configs.addKeyValuePair(new Pair<>("ore_gen.quartz_ore.generate_quartz", true), "boolean");

        configs.addKeyValuePair(new Pair<>("tool_material.ruby.ruby_mining_level", 3), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.ruby.ruby_item_durability", 1791), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.ruby.ruby_mining_speed", 8.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.ruby.ruby_attack_damage", 3.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.ruby.ruby_enchantability", 13), "int");

        configs.addKeyValuePair(new Pair<>("tool_material.sapphire.sapphire_mining_level", 3), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.sapphire.sapphire_item_durability", 1791), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.sapphire.sapphire_mining_speed", 8.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.sapphire.sapphire_attack_damage", 3.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.sapphire.sapphire_enchantability", 13), "int");

        configs.addKeyValuePair(new Pair<>("tool_material.emerald.emerald_mining_level", 3), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.emerald.emerald_item_durability", 1561), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.emerald.emerald_mining_speed", 8.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.emerald.emerald_attack_damage", 3.0F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.emerald.emerald_enchantability", 12), "int");

        configs.addKeyValuePair(new Pair<>("tool_material.topaz.topaz_mining_level", 2), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.topaz.topaz_item_durability", 1331), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.topaz.topaz_mining_speed", 7.0F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.topaz.topaz_attack_damage", 2.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.topaz.topaz_enchantability", 11), "int");

        configs.addKeyValuePair(new Pair<>("tool_material.amethyst.amethyst_mining_level", 2), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.amethyst.amethyst_item_durability", 871), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.amethyst.amethyst_mining_speed", 7.0F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.amethyst.amethyst_attack_damage", 2.0F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.amethyst.amethyst_enchantability", 11), "int");

        configs.addKeyValuePair(new Pair<>("tool_material.quartz.quartz_mining_level", 2), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.quartz.quartz_item_durability", 551), "int");
        configs.addKeyValuePair(new Pair<>("tool_material.quartz.quartz_mining_speed", 6.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.quartz.quartz_attack_damage", 1.5F), "float");
        configs.addKeyValuePair(new Pair<>("tool_material.quartz.quartz_enchantability", 9), "int");

        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_durability_multiplier", 35), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_helmet_strength", 3), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_chestplate_strength", 8), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_leggings_strength", 6), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_boots_strength", 3), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_armor_enchantability", 13), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_toughness", 2.5F), "float");
        configs.addKeyValuePair(new Pair<>("armor_material.ruby.ruby_knockback_resistance", 0.0F), "float");

        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_durability_multiplier", 35), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_helmet_strength", 3), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_chestplate_strength", 8), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_leggings_strength", 6), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_boots_strength", 3), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_armor_enchantability", 13), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_toughness", 2.5F), "float");
        configs.addKeyValuePair(new Pair<>("armor_material.sapphire.sapphire_knockback_resistance", 0.0F), "float");

        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_durability_multiplier", 34), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_helmet_strength", 3), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_chestplate_strength", 8), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_leggings_strength", 6), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_boots_strength", 3), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_armor_enchantability", 12), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_toughness", 2.0F), "float");
        configs.addKeyValuePair(new Pair<>("armor_material.emerald.emerald_knockback_resistance", 0.0F), "float");

        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_durability_multiplier", 30), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_helmet_strength", 2), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_chestplate_strength", 6), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_leggings_strength", 5), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_boots_strength", 2), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_armor_enchantability", 11), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_toughness", 1.5F), "float");
        configs.addKeyValuePair(new Pair<>("armor_material.topaz.topaz_knockback_resistance", 0.0F), "float");

        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_durability_multiplier", 25), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_helmet_strength", 2), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_chestplate_strength", 6), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_leggings_strength", 5), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_boots_strength", 2), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_armor_enchantability", 10), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_toughness", 1.0F), "float");
        configs.addKeyValuePair(new Pair<>("armor_material.amethyst.amethyst_knockback_resistance", 0.0F), "float");

        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_durability_multiplier", 20), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_helmet_strength", 1), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_chestplate_strength", 5), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_leggings_strength", 4), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_boots_strength", 1), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_armor_enchantability", 9), "int");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_toughness", 0.0F), "float");
        configs.addKeyValuePair(new Pair<>("armor_material.quartz.quartz_knockback_resistance", 0.0F), "float");

    }

    private static void assignConfigs() {
        RUBY_MIN_HEIGHT = CONFIG.getOrDefault("ore_gen.ruby_ore.ruby_min_height", -80);
        RUBY_MAX_HEIGHT = CONFIG.getOrDefault("ore_gen.ruby_ore.ruby_max_height", 16);
        RUBY_VEIN_COUNT = CONFIG.getOrDefault("ore_gen.ruby_ore.ruby_vein_count", 3);
        RUBY_VEIN_SIZE  = CONFIG.getOrDefault("ore_gen.ruby_ore.ruby_vein_size", 3);
        GENERATE_RUBY = CONFIG.getOrDefault("ore_gen.ruby_ore.generate_ruby", true);

        SAPPHIRE_MIN_HEIGHT = CONFIG.getOrDefault("ore_gen.sapphire_ore.sapphire_min_height", -80);
        SAPPHIRE_MAX_HEIGHT = CONFIG.getOrDefault("ore_gen.sapphire_ore.sapphire_max_height", 16);
        SAPPHIRE_VEIN_COUNT = CONFIG.getOrDefault("ore_gen.sapphire_ore.sapphire_vein_count", 3);
        SAPPHIRE_VEIN_SIZE  = CONFIG.getOrDefault("ore_gen.sapphire_ore.sapphire_vein_size", 3);
        GENERATE_SAPPHIRE = CONFIG.getOrDefault("ore_gen.sapphire_ore.generate_sapphire", true);

        TOPAZ_MIN_HEIGHT = CONFIG.getOrDefault("ore_gen.topaz_ore.topaz_min_height", -80);
        TOPAZ_MAX_HEIGHT = CONFIG.getOrDefault("ore_gen.topaz_ore.topaz_max_height", 24);
        TOPAZ_VEIN_COUNT = CONFIG.getOrDefault("ore_gen.topaz_ore.topaz_vein_count", 4);
        TOPAZ_VEIN_SIZE  = CONFIG.getOrDefault("ore_gen.topaz_ore.topaz_vein_size", 4);
        GENERATE_TOPAZ = CONFIG.getOrDefault("ore_gen.topaz_ore.generate_topaz", true);

        AMETHYST_MIN_HEIGHT = CONFIG.getOrDefault("ore_gen.amethyst_ore.amethyst_min_height", -80);
        AMETHYST_MAX_HEIGHT = CONFIG.getOrDefault("ore_gen.amethyst_ore.amethyst_max_height", 32);
        AMETHYST_VEIN_COUNT = CONFIG.getOrDefault("ore_gen.amethyst_ore.amethyst_vein_count", 4);
        AMETHYST_VEIN_SIZE  = CONFIG.getOrDefault("ore_gen.amethyst_ore.amethyst_vein_size", 4);
        GENERATE_AMETHYST = CONFIG.getOrDefault("ore_gen.amethyst_ore.generate_amethyst", true);

        QUARTZ_MIN_HEIGHT = CONFIG.getOrDefault("ore_gen.quartz_ore.quartz_min_height", -80);
        QUARTZ_MAX_HEIGHT = CONFIG.getOrDefault("ore_gen.quartz_ore.quartz_max_height", 48);
        QUARTZ_VEIN_COUNT = CONFIG.getOrDefault("ore_gen.quartz_ore.quartz_vein_count", 4);
        QUARTZ_VEIN_SIZE  = CONFIG.getOrDefault("ore_gen.quartz_ore.quartz_vein_size", 4);
        GENERATE_QUARTZ = CONFIG.getOrDefault("ore_gen.quartz_ore.generate_quartz", true);

        RUBY_MINING_LEVEL = CONFIG.getOrDefault("tool_material.ruby.ruby_mining_level", 3);
        RUBY_ITEM_DURABILITY = CONFIG.getOrDefault("tool_material.ruby.ruby_item_durability", 1791);
        RUBY_MINING_SPEED = CONFIG.getOrDefault("tool_material.ruby.ruby_mining_speed", 8.5F);
        RUBY_ATTACK_DAMAGE = CONFIG.getOrDefault("tool_material.ruby.ruby_attack_damage", 3.5F);
        RUBY_ENCHANTABILITY = CONFIG.getOrDefault("tool_material.ruby.ruby_enchantability", 13);

        SAPPHIRE_MINING_LEVEL = CONFIG.getOrDefault("tool_material.sapphire.sapphire_mining_level", 3);
        SAPPHIRE_ITEM_DURABILITY = CONFIG.getOrDefault("tool_material.sapphire.sapphire_item_durability", 1791);
        SAPPHIRE_MINING_SPEED = CONFIG.getOrDefault("tool_material.sapphire.sapphire_mining_speed", 8.5F);
        SAPPHIRE_ATTACK_DAMAGE = CONFIG.getOrDefault("tool_material.sapphire.sapphire_attack_damage", 3.5F);
        SAPPHIRE_ENCHANTABILITY = CONFIG.getOrDefault("tool_material.sapphire.sapphire_enchantability", 13);

        EMERALD_MINING_LEVEL = CONFIG.getOrDefault("tool_material.emerald.emerald_mining_level", 3);
        EMERALD_ITEM_DURABILITY = CONFIG.getOrDefault("tool_material.emerald.emerald_item_durability", 1561);
        EMERALD_MINING_SPEED = CONFIG.getOrDefault("tool_material.emerald.emerald_mining_speed", 8.5F);
        EMERALD_ATTACK_DAMAGE = CONFIG.getOrDefault("tool_material.emerald.emerald_attack_damage", 3.0F);
        EMERALD_ENCHANTABILITY = CONFIG.getOrDefault("tool_material.emerald.emerald_enchantability", 12);

        TOPAZ_MINING_LEVEL = CONFIG.getOrDefault("tool_material.topaz.topaz_mining_level", 2);
        TOPAZ_ITEM_DURABILITY = CONFIG.getOrDefault("tool_material.topaz.topaz_item_durability", 1331);
        TOPAZ_MINING_SPEED = CONFIG.getOrDefault("tool_material.topaz.topaz_mining_speed", 7.0F);
        TOPAZ_ATTACK_DAMAGE = CONFIG.getOrDefault("tool_material.topaz.topaz_attack_damage", 2.5F);
        TOPAZ_ENCHANTABILITY = CONFIG.getOrDefault("tool_material.topaz.topaz_enchantability", 11);

        AMETHYST_MINING_LEVEL = CONFIG.getOrDefault("tool_material.amethyst.amethyst_mining_level", 2);
        AMETHYST_ITEM_DURABILITY = CONFIG.getOrDefault("tool_material.amethyst.amethyst_item_durability", 871);
        AMETHYST_MINING_SPEED = CONFIG.getOrDefault("tool_material.amethyst.amethyst_mining_speed", 7.0F);
        AMETHYST_ATTACK_DAMAGE = CONFIG.getOrDefault("tool_material.amethyst.amethyst_attack_damage", 2.0F);
        AMETHYST_ENCHANTABILITY = CONFIG.getOrDefault("tool_material.amethyst.amethyst_enchantability", 11);

        QUARTZ_MINING_LEVEL = CONFIG.getOrDefault("tool_material.quartz.quartz_mining_level", 2);
        QUARTZ_ITEM_DURABILITY = CONFIG.getOrDefault("tool_material.quartz.quartz_item_durability", 551);
        QUARTZ_MINING_SPEED = CONFIG.getOrDefault("tool_material.quartz.quartz_mining_speed", 6.5F);
        QUARTZ_ATTACK_DAMAGE = CONFIG.getOrDefault("tool_material.quartz.quartz_attack_damage", 1.5F);
        QUARTZ_ENCHANTABILITY = CONFIG.getOrDefault("tool_material.quartz.quartz_enchantability", 9);

        RUBY_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("armor_material.ruby.ruby_durability_multiplier", 35);
        RUBY_HELMET_STRENGTH = CONFIG.getOrDefault("armor_material.ruby.ruby_helmet_strength", 3);
        RUBY_CHESTPLATE_STRENGTH = CONFIG.getOrDefault("armor_material.ruby.ruby_chestplate_strength", 8);
        RUBY_LEGGINGS_STRENGTH = CONFIG.getOrDefault("armor_material.ruby.ruby_leggings_strength", 6);
        RUBY_BOOTS_STRENGTH = CONFIG.getOrDefault("armor_material.ruby.ruby_boots_strength", 3);
        RUBY_ARMOR_ENCHANTABILITY = CONFIG.getOrDefault("armor_material.ruby.ruby_armor_enchantability", 13);
        RUBY_TOUGHNESS = CONFIG.getOrDefault("armor_material.ruby.ruby_toughness", 2.5F);
        RUBY_KNOCKBACK_RESISTANCE = CONFIG.getOrDefault("armor_material.ruby.ruby_knockback_resistance", 0.0F);

        SAPPHIRE_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("armor_material.sapphire.sapphire_durability_multiplier", 35);
        SAPPHIRE_HELMET_STRENGTH = CONFIG.getOrDefault("armor_material.sapphire.sapphire_helmet_strength", 3);
        SAPPHIRE_CHESTPLATE_STRENGTH = CONFIG.getOrDefault("armor_material.sapphire.sapphire_chestplate_strength", 8);
        SAPPHIRE_LEGGINGS_STRENGTH = CONFIG.getOrDefault("armor_material.sapphire.sapphire_leggings_strength", 6);
        SAPPHIRE_BOOTS_STRENGTH = CONFIG.getOrDefault("armor_material.sapphire.sapphire_boots_strength", 3);
        SAPPHIRE_ARMOR_ENCHANTABILITY = CONFIG.getOrDefault("armor_material.sapphire.sapphire_armor_enchantability", 13);
        SAPPHIRE_TOUGHNESS = CONFIG.getOrDefault("armor_material.sapphire.sapphire_toughness", 2.5F);
        SAPPHIRE_KNOCKBACK_RESISTANCE = CONFIG.getOrDefault("armor_material.sapphire.sapphire_knockback_resistance", 0.0F);

        EMERALD_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("armor_material.emerald.emerald_durability_multiplier", 34);
        EMERALD_HELMET_STRENGTH = CONFIG.getOrDefault("armor_material.emerald.emerald_helmet_strength", 3);
        EMERALD_CHESTPLATE_STRENGTH = CONFIG.getOrDefault("armor_material.emerald.emerald_chestplate_strength", 8);
        EMERALD_LEGGINGS_STRENGTH = CONFIG.getOrDefault("armor_material.emerald.emerald_leggings_strength", 6);
        EMERALD_BOOTS_STRENGTH = CONFIG.getOrDefault("armor_material.emerald.emerald_boots_strength", 3);
        EMERALD_ARMOR_ENCHANTABILITY = CONFIG.getOrDefault("armor_material.emerald.emerald_armor_enchantability", 12);
        EMERALD_TOUGHNESS = CONFIG.getOrDefault("armor_material.emerald.emerald_toughness", 2.0F);
        EMERALD_KNOCKBACK_RESISTANCE = CONFIG.getOrDefault("armor_material.emerald.emerald_knockback_resistance", 0.0F);

        TOPAZ_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("armor_material.topaz.topaz_durability_multiplier", 30);
        TOPAZ_HELMET_STRENGTH = CONFIG.getOrDefault("armor_material.topaz.topaz_helmet_strength", 2);
        TOPAZ_CHESTPLATE_STRENGTH = CONFIG.getOrDefault("armor_material.topaz.topaz_chestplate_strength", 6);
        TOPAZ_LEGGINGS_STRENGTH = CONFIG.getOrDefault("armor_material.topaz.topaz_leggings_strength", 5);
        TOPAZ_BOOTS_STRENGTH = CONFIG.getOrDefault("armor_material.topaz.topaz_boots_strength", 2);
        TOPAZ_ARMOR_ENCHANTABILITY = CONFIG.getOrDefault("armor_material.topaz.topaz_armor_enchantability", 11);
        TOPAZ_TOUGHNESS = CONFIG.getOrDefault("armor_material.topaz.topaz_toughness", 1.5F);
        TOPAZ_KNOCKBACK_RESISTANCE = CONFIG.getOrDefault("armor_material.topaz.topaz_knockback_resistance", 0.0F);

        AMETHYST_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("armor_material.amethyst.amethyst_durability_multiplier", 25);
        AMETHYST_HELMET_STRENGTH = CONFIG.getOrDefault("armor_material.amethyst.amethyst_helmet_strength", 2);
        AMETHYST_CHESTPLATE_STRENGTH = CONFIG.getOrDefault("armor_material.amethyst.amethyst_chestplate_strength", 6);
        AMETHYST_LEGGINGS_STRENGTH = CONFIG.getOrDefault("armor_material.amethyst.amethyst_leggings_strength", 5);
        AMETHYST_BOOTS_STRENGTH = CONFIG.getOrDefault("armor_material.amethyst.amethyst_boots_strength", 2);
        AMETHYST_ARMOR_ENCHANTABILITY = CONFIG.getOrDefault("armor_material.amethyst.amethyst_armor_enchantability", 10);
        AMETHYST_TOUGHNESS = CONFIG.getOrDefault("armor_material.amethyst.amethyst_toughness", 1.0F);
        AMETHYST_KNOCKBACK_RESISTANCE = CONFIG.getOrDefault("armor_material.amethyst.amethyst_knockback_resistance", 0.0F);

        QUARTZ_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("armor_material.quartz.quartz_durability_multiplier", 20);
        QUARTZ_HELMET_STRENGTH = CONFIG.getOrDefault("armor_material.quartz.quartz_helmet_strength", 1);
        QUARTZ_CHESTPLATE_STRENGTH = CONFIG.getOrDefault("armor_material.quartz.quartz_chestplate_strength", 5);
        QUARTZ_LEGGINGS_STRENGTH = CONFIG.getOrDefault("armor_material.quartz.quartz_leggings_strength", 4);
        QUARTZ_BOOTS_STRENGTH = CONFIG.getOrDefault("armor_material.quartz.quartz_boots_strength", 1);
        QUARTZ_ARMOR_ENCHANTABILITY = CONFIG.getOrDefault("armor_material.quartz.quartz_armor_enchantability", 9);
        QUARTZ_TOUGHNESS = CONFIG.getOrDefault("armor_material.quartz.quartz_toughness", 0.0F);
        QUARTZ_KNOCKBACK_RESISTANCE = CONFIG.getOrDefault("armor_material.quartz.quartz_knockback_resistance", 0.0F);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(GemsAndCrystals.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }


}