package com.coliwogg.gemsandcrystals.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(MiningLevels.DIAMOND, 1761, 8.5f, 4.0f, 16, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE(MiningLevels.DIAMOND, 1761, 8.5f, 4.0f, 16, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    EMERALD(MiningLevels.DIAMOND, 1451, 7.5f, 3.0f, 14, () -> Ingredient.ofItems(Items.EMERALD)),
    TOPAZ(MiningLevels.IRON, 1061, 6.5f, 2.5f, 14, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    AMETHYST(MiningLevels.IRON, 871, 6.0f, 2.0f, 13, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    QUARTZ(MiningLevels.IRON, 671, 4.0f, 1.5f, 12, () -> Ingredient.ofItems(Items.QUARTZ));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
