package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class ModToolMaterials {
    public static ToolMaterial RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2500, 8.0f, 4.5f, 10, ModTags.Items.RUBY_REPAIR);
    public static ToolMaterial SAPPHIRE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1600, 9.0f, 3.5f, 25, ModTags.Items.SAPPHIRE_REPAIR);
    public static ToolMaterial EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1200, 7.5f, 3.0f, 18, ModTags.Items.EMERALD_REPAIR);
    public static ToolMaterial TOPAZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 700, 8.0f, 5.0f, 12, ModTags.Items.TOPAZ_REPAIR);
    public static ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 14.0f, 2.0f, 15, ModTags.Items.AMETHYST_REPAIR);
    public static ToolMaterial QUARTZ = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 150, 11.0f, 4.0f, 8, ModTags.Items.QUARTZ_REPAIR);
}
