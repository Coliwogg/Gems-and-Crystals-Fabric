package com.coliwogg.gemsandcrystals.creativemodetab;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab GEMS_AND_CRYSTALS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "gemsandcrystals"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .title(Component.translatable("creativemodetab.gemsandcrystals_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.TOPAZ);

                        output.accept(ModItems.RUBY_SWORD);
                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_PICKAXE);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_HOE);
                        output.accept(ModItems.RUBY_SPEAR);
                        output.accept(ModItems.SAPPHIRE_SWORD);
                        output.accept(ModItems.SAPPHIRE_SHOVEL);
                        output.accept(ModItems.SAPPHIRE_PICKAXE);
                        output.accept(ModItems.SAPPHIRE_AXE);
                        output.accept(ModItems.SAPPHIRE_HOE);
                        output.accept(ModItems.SAPPHIRE_SPEAR);
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_HOE);
                        output.accept(ModItems.EMERALD_SPEAR);
                        output.accept(ModItems.TOPAZ_SWORD);
                        output.accept(ModItems.TOPAZ_SHOVEL);
                        output.accept(ModItems.TOPAZ_PICKAXE);
                        output.accept(ModItems.TOPAZ_AXE);
                        output.accept(ModItems.TOPAZ_HOE);
                        output.accept(ModItems.TOPAZ_SPEAR);
                        output.accept(ModItems.AMETHYST_SWORD);
                        output.accept(ModItems.AMETHYST_SHOVEL);
                        output.accept(ModItems.AMETHYST_PICKAXE);
                        output.accept(ModItems.AMETHYST_AXE);
                        output.accept(ModItems.AMETHYST_HOE);
                        output.accept(ModItems.AMETHYST_SPEAR);
                        output.accept(ModItems.QUARTZ_SWORD);
                        output.accept(ModItems.QUARTZ_SHOVEL);
                        output.accept(ModItems.QUARTZ_PICKAXE);
                        output.accept(ModItems.QUARTZ_AXE);
                        output.accept(ModItems.QUARTZ_HOE);
                        output.accept(ModItems.QUARTZ_SPEAR);

                        output.accept(ModItems.RUBY_HELMET);
                        output.accept(ModItems.RUBY_CHESTPLATE);
                        output.accept(ModItems.RUBY_LEGGINGS);
                        output.accept(ModItems.RUBY_BOOTS);
                        output.accept(ModItems.SAPPHIRE_HELMET);
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE);
                        output.accept(ModItems.SAPPHIRE_LEGGINGS);
                        output.accept(ModItems.SAPPHIRE_BOOTS);
                        output.accept(ModItems.EMERALD_HELMET);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_BOOTS);
                        output.accept(ModItems.TOPAZ_HELMET);
                        output.accept(ModItems.TOPAZ_CHESTPLATE);
                        output.accept(ModItems.TOPAZ_LEGGINGS);
                        output.accept(ModItems.TOPAZ_BOOTS);
                        output.accept(ModItems.AMETHYST_HELMET);
                        output.accept(ModItems.AMETHYST_CHESTPLATE);
                        output.accept(ModItems.AMETHYST_LEGGINGS);
                        output.accept(ModItems.AMETHYST_BOOTS);
                        output.accept(ModItems.QUARTZ_HELMET);
                        output.accept(ModItems.QUARTZ_CHESTPLATE);
                        output.accept(ModItems.QUARTZ_LEGGINGS);
                        output.accept(ModItems.QUARTZ_BOOTS);

                        output.accept(ModItems.RUBY_HORSE_ARMOR);
                        output.accept(ModItems.SAPPHIRE_HORSE_ARMOR);
                        output.accept(ModItems.EMERALD_HORSE_ARMOR);
                        output.accept(ModItems.TOPAZ_HORSE_ARMOR);
                        output.accept(ModItems.AMETHYST_HORSE_ARMOR);
                        output.accept(ModItems.QUARTZ_HORSE_ARMOR);

                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.TOPAZ_BLOCK);

                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        output.accept(ModBlocks.TOPAZ_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                        output.accept(ModBlocks.AMETHYST_ORE);
                        output.accept(ModBlocks.DEEPSLATE_AMETHYST_ORE);
                        output.accept(ModBlocks.QUARTZ_ORE);
                        output.accept(ModBlocks.DEEPSLATE_QUARTZ_ORE);
                        output.accept(ModBlocks.BUDDING_QUARTZ);
                        output.accept(ModBlocks.SMALL_QUARTZ_BUD);
                        output.accept(ModBlocks.MEDIUM_QUARTZ_BUD);
                        output.accept(ModBlocks.LARGE_QUARTZ_BUD);
                        output.accept(ModBlocks.QUARTZ_CLUSTER);

                    }).build());

    public static void registerModCreativeModeTabs() {
        GemsAndCrystals.LOGGER.info("Registering Creative Mode Tabs for " + GemsAndCrystals.MOD_ID);
    }
}
