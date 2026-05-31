package com.coliwogg.gemsandcrystals.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    RUBY(BlockTags.INCORRECT_FOR_IRON_TOOL, 1796, 8.5f, 4.0f, 16, () -> Ingredient.ofItems(ModItems.RUBY)),
    SAPPHIRE(BlockTags.INCORRECT_FOR_IRON_TOOL, 1796, 8.5f, 4.0f, 16, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    EMERALD(BlockTags.INCORRECT_FOR_IRON_TOOL, 1451, 7.5f, 3.0f, 14, () -> Ingredient.ofItems(Items.EMERALD)),
    TOPAZ(BlockTags.INCORRECT_FOR_IRON_TOOL, 1061, 6.5f, 2.0f, 14, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    AMETHYST(BlockTags.INCORRECT_FOR_IRON_TOOL, 871, 6.0f, 2.0f, 13, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    QUARTZ(BlockTags.INCORRECT_FOR_IRON_TOOL, 671, 4.0f, 1.0f, 12, () -> Ingredient.ofItems(Items.QUARTZ));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
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
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
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
