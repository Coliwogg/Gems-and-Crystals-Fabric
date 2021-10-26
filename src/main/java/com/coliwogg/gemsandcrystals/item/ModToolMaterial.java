package com.coliwogg.gemsandcrystals.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(3, 1791, 8.5F, 3.5F, 13, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBY});
    }),
    SAPPHIRE(3, 1791, 8.5F, 3.5F, 13, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.SAPPHIRE});
    }),
    EMERALD(3, 1561, 8.5F, 3.0F, 12, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
    }),
    TOPAZ(2, 1331, 7.0F, 2.5F, 11, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.TOPAZ});
    }),
    AMETHYST(2, 871, 7.0F, 2.0F, 11, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.AMETHYST_SHARD});
    }),
    QUARTZ(2, 551, 6.5F, 1.5F, 9, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.QUARTZ});
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
