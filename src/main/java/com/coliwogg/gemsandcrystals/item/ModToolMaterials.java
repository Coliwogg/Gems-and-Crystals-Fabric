package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.util.ModTags;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public class ModToolMaterials {
    public static ToolMaterial RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1796, 8.5f, 4.0f, 16, ModTags.Items.RUBY_REPAIR);
    public static ToolMaterial SAPPHIRE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1796, 8.5f, 4.0f, 16, ModTags.Items.SAPPHIRE_REPAIR);
    public static ToolMaterial EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1451, 7.5f, 3.0f, 14, ModTags.Items.EMERALD_REPAIR);
    public static ToolMaterial TOPAZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1061, 6.5f, 2.0f, 14, ModTags.Items.TOPAZ_REPAIR);
    public static ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 871, 6.0f, 2.0f, 13, ModTags.Items.AMETHYST_REPAIR);
    public static ToolMaterial QUARTZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 671, 4.0f, 1.0f, 12, ModTags.Items.QUARTZ_REPAIR);
}
