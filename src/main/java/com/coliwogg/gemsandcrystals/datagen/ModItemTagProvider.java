package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider  {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS,
                        ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS,
                        ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS,
                        ModItems.TOPAZ_HELMET, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ_BOOTS,
                        ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS,
                        ModItems.QUARTZ_HELMET, ModItems.QUARTZ_CHESTPLATE, ModItems.QUARTZ_LEGGINGS, ModItems.QUARTZ_BOOTS);

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET,
                        ModItems.SAPPHIRE_HELMET,
                        ModItems.EMERALD_HELMET,
                        ModItems.TOPAZ_HELMET,
                        ModItems.AMETHYST_HELMET,
                        ModItems.QUARTZ_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE,
                        ModItems.SAPPHIRE_CHESTPLATE,
                        ModItems.EMERALD_CHESTPLATE,
                        ModItems.TOPAZ_CHESTPLATE,
                        ModItems.AMETHYST_CHESTPLATE,
                        ModItems.QUARTZ_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS,
                        ModItems.SAPPHIRE_LEGGINGS,
                        ModItems.EMERALD_LEGGINGS,
                        ModItems.TOPAZ_LEGGINGS,
                        ModItems.AMETHYST_LEGGINGS,
                        ModItems.QUARTZ_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS,
                        ModItems.SAPPHIRE_BOOTS,
                        ModItems.EMERALD_BOOTS,
                        ModItems.TOPAZ_BOOTS,
                        ModItems.AMETHYST_BOOTS,
                        ModItems.QUARTZ_BOOTS);

        valueLookupBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.RUBY)
                .add(ModItems.SAPPHIRE)
                .add(ModItems.TOPAZ);
    }
}
