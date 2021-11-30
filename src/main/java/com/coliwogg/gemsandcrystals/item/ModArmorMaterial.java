package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.config.ModConfigs;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    RUBY("ruby", ModConfigs.RUBY_DURABILITY_MULTIPLIER, new int[]{ModConfigs.RUBY_BOOTS_STRENGTH, ModConfigs.RUBY_LEGGINGS_STRENGTH, ModConfigs.RUBY_CHESTPLATE_STRENGTH, ModConfigs.RUBY_HELMET_STRENGTH},
            ModConfigs.RUBY_ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModConfigs.RUBY_TOUGHNESS, ModConfigs.RUBY_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBY});
    }),
    SAPPHIRE("sapphire", ModConfigs.SAPPHIRE_DURABILITY_MULTIPLIER, new int[]{ModConfigs.SAPPHIRE_BOOTS_STRENGTH, ModConfigs.SAPPHIRE_LEGGINGS_STRENGTH, ModConfigs.SAPPHIRE_CHESTPLATE_STRENGTH, ModConfigs.SAPPHIRE_HELMET_STRENGTH},
            ModConfigs.SAPPHIRE_ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModConfigs.SAPPHIRE_TOUGHNESS, ModConfigs.SAPPHIRE_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.SAPPHIRE});
    }),
    EMERALD("emerald", ModConfigs.EMERALD_DURABILITY_MULTIPLIER, new int[]{ModConfigs.EMERALD_BOOTS_STRENGTH, ModConfigs.EMERALD_LEGGINGS_STRENGTH, ModConfigs.EMERALD_CHESTPLATE_STRENGTH, ModConfigs.EMERALD_HELMET_STRENGTH},
            ModConfigs.EMERALD_ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModConfigs.EMERALD_TOUGHNESS, ModConfigs.EMERALD_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    TOPAZ("topaz", ModConfigs.TOPAZ_DURABILITY_MULTIPLIER, new int[]{ModConfigs.TOPAZ_BOOTS_STRENGTH, ModConfigs.TOPAZ_LEGGINGS_STRENGTH, ModConfigs.TOPAZ_CHESTPLATE_STRENGTH, ModConfigs.TOPAZ_HELMET_STRENGTH},
            ModConfigs.TOPAZ_ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModConfigs.TOPAZ_TOUGHNESS, ModConfigs.TOPAZ_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.TOPAZ});
    }),
    AMETHYST("amethyst", ModConfigs.AMETHYST_DURABILITY_MULTIPLIER, new int[]{ModConfigs.AMETHYST_BOOTS_STRENGTH, ModConfigs.AMETHYST_LEGGINGS_STRENGTH, ModConfigs.AMETHYST_CHESTPLATE_STRENGTH, ModConfigs.AMETHYST_HELMET_STRENGTH},
            ModConfigs.AMETHYST_ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModConfigs.AMETHYST_TOUGHNESS, ModConfigs.AMETHYST_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.AMETHYST_SHARD});
    }),
    QUARTZ("quartz", ModConfigs.QUARTZ_DURABILITY_MULTIPLIER, new int[]{ModConfigs.QUARTZ_BOOTS_STRENGTH, ModConfigs.QUARTZ_LEGGINGS_STRENGTH, ModConfigs.QUARTZ_CHESTPLATE_STRENGTH, ModConfigs.QUARTZ_HELMET_STRENGTH},
            ModConfigs.QUARTZ_ARMOR_ENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ModConfigs.QUARTZ_TOUGHNESS, ModConfigs.QUARTZ_KNOCKBACK_RESISTANCE, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.QUARTZ});
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
