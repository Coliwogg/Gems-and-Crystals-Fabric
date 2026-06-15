package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS,
                        ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE_BOOTS,
                        ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS,
                        ModItems.TOPAZ_HELMET, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ_BOOTS,
                        ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS,
                        ModItems.QUARTZ_HELMET, ModItems.QUARTZ_CHESTPLATE, ModItems.QUARTZ_LEGGINGS, ModItems.QUARTZ_BOOTS);

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.TOPAZ_SWORD)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.QUARTZ_SWORD);

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE)
                .add(ModItems.EMERALD_PICKAXE)
                .add(ModItems.TOPAZ_PICKAXE)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.QUARTZ_PICKAXE);

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.SAPPHIRE_SHOVEL)
                .add(ModItems.EMERALD_SHOVEL)
                .add(ModItems.TOPAZ_SHOVEL)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.QUARTZ_SHOVEL);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.SAPPHIRE_AXE)
                .add(ModItems.EMERALD_AXE)
                .add(ModItems.TOPAZ_AXE)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.QUARTZ_AXE);

        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.SAPPHIRE_HOE)
                .add(ModItems.EMERALD_HOE)
                .add(ModItems.TOPAZ_HOE)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.QUARTZ_HOE);

        valueLookupBuilder(ItemTags.SPEARS)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.SAPPHIRE_SPEAR)
                .add(ModItems.EMERALD_SPEAR)
                .add(ModItems.TOPAZ_SPEAR)
                .add(ModItems.AMETHYST_SPEAR)
                .add(ModItems.QUARTZ_SPEAR);

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
