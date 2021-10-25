package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GEMS_AND_CRYSTALS = FabricItemGroupBuilder.build(new Identifier(GemsAndCrystals.MOD_ID, "gemsandcrystals"),
            () -> new ItemStack(ModItems.RUBY));
}
