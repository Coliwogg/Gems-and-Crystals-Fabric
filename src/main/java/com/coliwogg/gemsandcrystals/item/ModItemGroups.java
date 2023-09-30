package com.coliwogg.gemsandcrystals.item;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GEMS_AND_CRYSTALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GemsAndCrystals.MOD_ID, "gemsandcrystals"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gemsandcrystals"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.TOPAZ);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.TOPAZ_SWORD);
                        entries.add(ModItems.TOPAZ_SHOVEL);
                        entries.add(ModItems.TOPAZ_PICKAXE);
                        entries.add(ModItems.TOPAZ_AXE);
                        entries.add(ModItems.TOPAZ_HOE);
                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.QUARTZ_SWORD);
                        entries.add(ModItems.QUARTZ_SHOVEL);
                        entries.add(ModItems.QUARTZ_PICKAXE);
                        entries.add(ModItems.QUARTZ_AXE);
                        entries.add(ModItems.QUARTZ_HOE);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);
                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.TOPAZ_HELMET);
                        entries.add(ModItems.TOPAZ_CHESTPLATE);
                        entries.add(ModItems.TOPAZ_LEGGINGS);
                        entries.add(ModItems.TOPAZ_BOOTS);
                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);
                        entries.add(ModItems.QUARTZ_HELMET);
                        entries.add(ModItems.QUARTZ_CHESTPLATE);
                        entries.add(ModItems.QUARTZ_LEGGINGS);
                        entries.add(ModItems.QUARTZ_BOOTS);

                        entries.add(ModItems.RUBY_HORSE_ARMOR);
                        entries.add(ModItems.SAPPHIRE_HORSE_ARMOR);
                        entries.add(ModItems.EMERALD_HORSE_ARMOR);
                        entries.add(ModItems.TOPAZ_HORSE_ARMOR);
                        entries.add(ModItems.AMETHYST_HORSE_ARMOR);
                        entries.add(ModItems.QUARTZ_HORSE_ARMOR);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.TOPAZ_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                        entries.add(ModBlocks.AMETHYST_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AMETHYST_ORE);
                        entries.add(ModBlocks.QUARTZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_QUARTZ_ORE);
                    }).build());

    public static void registerItemGroups() {
        GemsAndCrystals.LOGGER.info("Registering Item Groups for " + GemsAndCrystals.MOD_ID);
    }
}
