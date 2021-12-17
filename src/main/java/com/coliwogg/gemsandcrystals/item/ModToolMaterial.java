package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.config.ModConfigs;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(ModConfigs.RUBY_MINING_LEVEL, ModConfigs.RUBY_ITEM_DURABILITY, ModConfigs.RUBY_MINING_LEVEL, ModConfigs.RUBY_ATTACK_DAMAGE, ModConfigs.RUBY_ENCHANTABILITY, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE(ModConfigs.SAPPHIRE_MINING_LEVEL, ModConfigs.SAPPHIRE_ITEM_DURABILITY, ModConfigs.SAPPHIRE_MINING_SPEED, ModConfigs.SAPPHIRE_ATTACK_DAMAGE, ModConfigs.SAPPHIRE_ENCHANTABILITY, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    EMERALD(ModConfigs.EMERALD_MINING_LEVEL, ModConfigs.SAPPHIRE_ITEM_DURABILITY, ModConfigs.EMERALD_MINING_SPEED, ModConfigs.EMERALD_ATTACK_DAMAGE, ModConfigs.EMERALD_ENCHANTABILITY, () -> Ingredient.ofItems(Items.EMERALD)),
    TOPAZ(ModConfigs.TOPAZ_MINING_LEVEL, ModConfigs.TOPAZ_ITEM_DURABILITY, ModConfigs.TOPAZ_MINING_SPEED, ModConfigs.TOPAZ_ATTACK_DAMAGE, ModConfigs.TOPAZ_ENCHANTABILITY, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    AMETHYST(ModConfigs.AMETHYST_MINING_LEVEL, ModConfigs.AMETHYST_ITEM_DURABILITY, ModConfigs.AMETHYST_MINING_SPEED, ModConfigs.AMETHYST_ATTACK_DAMAGE, ModConfigs.AMETHYST_ENCHANTABILITY, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    QUARTZ(ModConfigs.QUARTZ_MINING_LEVEL, ModConfigs.QUARTZ_ITEM_DURABILITY, ModConfigs.QUARTZ_MINING_SPEED, ModConfigs.QUARTZ_ATTACK_DAMAGE, ModConfigs.QUARTZ_ENCHANTABILITY, () -> Ingredient.ofItems(Items.QUARTZ));

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
        return this.repairIngredient.get();
    }
}
