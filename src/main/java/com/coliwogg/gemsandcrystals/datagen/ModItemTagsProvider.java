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
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_HELMET), ModItems.getRK(ModItems.RUBY_CHESTPLATE), ModItems.getRK(ModItems.RUBY_LEGGINGS), ModItems.getRK(ModItems.RUBY_BOOTS),
                        ModItems.getRK(ModItems.SAPPHIRE_HELMET), ModItems.getRK(ModItems.SAPPHIRE_CHESTPLATE), ModItems.getRK(ModItems.SAPPHIRE_LEGGINGS), ModItems.getRK(ModItems.SAPPHIRE_BOOTS),
                        ModItems.getRK(ModItems.EMERALD_HELMET), ModItems.getRK(ModItems.EMERALD_CHESTPLATE), ModItems.getRK(ModItems.EMERALD_LEGGINGS), ModItems.getRK(ModItems.EMERALD_BOOTS),
                        ModItems.getRK(ModItems.TOPAZ_HELMET), ModItems.getRK(ModItems.TOPAZ_CHESTPLATE), ModItems.getRK(ModItems.TOPAZ_LEGGINGS), ModItems.getRK(ModItems.TOPAZ_BOOTS),
                        ModItems.getRK(ModItems.AMETHYST_HELMET), ModItems.getRK(ModItems.AMETHYST_CHESTPLATE), ModItems.getRK(ModItems.AMETHYST_LEGGINGS), ModItems.getRK(ModItems.AMETHYST_BOOTS),
                        ModItems.getRK(ModItems.QUARTZ_HELMET), ModItems.getRK(ModItems.QUARTZ_CHESTPLATE), ModItems.getRK(ModItems.QUARTZ_LEGGINGS), ModItems.getRK(ModItems.QUARTZ_BOOTS));

        tag(ItemTags.SWORDS)
                .add(ModItems.getRK(ModItems.RUBY_SWORD))
                .add(ModItems.getRK(ModItems.SAPPHIRE_SWORD))
                .add(ModItems.getRK(ModItems.EMERALD_SWORD))
                .add(ModItems.getRK(ModItems.TOPAZ_SWORD))
                .add(ModItems.getRK(ModItems.AMETHYST_SWORD))
                .add(ModItems.getRK(ModItems.QUARTZ_SWORD));

        tag(ItemTags.PICKAXES)
                .add(ModItems.getRK(ModItems.RUBY_PICKAXE))
                .add(ModItems.getRK(ModItems.SAPPHIRE_PICKAXE))
                .add(ModItems.getRK(ModItems.EMERALD_PICKAXE))
                .add(ModItems.getRK(ModItems.TOPAZ_PICKAXE))
                .add(ModItems.getRK(ModItems.AMETHYST_PICKAXE))
                .add(ModItems.getRK(ModItems.QUARTZ_PICKAXE));

        tag(ItemTags.SHOVELS)
                .add(ModItems.getRK(ModItems.RUBY_SHOVEL))
                .add(ModItems.getRK(ModItems.SAPPHIRE_SHOVEL))
                .add(ModItems.getRK(ModItems.EMERALD_SHOVEL))
                .add(ModItems.getRK(ModItems.TOPAZ_SHOVEL))
                .add(ModItems.getRK(ModItems.AMETHYST_SHOVEL))
                .add(ModItems.getRK(ModItems.QUARTZ_SHOVEL));

        tag(ItemTags.AXES)
                .add(ModItems.getRK(ModItems.RUBY_AXE))
                .add(ModItems.getRK(ModItems.SAPPHIRE_AXE))
                .add(ModItems.getRK(ModItems.EMERALD_AXE))
                .add(ModItems.getRK(ModItems.TOPAZ_AXE))
                .add(ModItems.getRK(ModItems.AMETHYST_AXE))
                .add(ModItems.getRK(ModItems.QUARTZ_AXE));

        tag(ItemTags.HOES)
                .add(ModItems.getRK(ModItems.RUBY_HOE))
                .add(ModItems.getRK(ModItems.SAPPHIRE_HOE))
                .add(ModItems.getRK(ModItems.EMERALD_HOE))
                .add(ModItems.getRK(ModItems.TOPAZ_HOE))
                .add(ModItems.getRK(ModItems.AMETHYST_HOE))
                .add(ModItems.getRK(ModItems.QUARTZ_HOE));

        tag(ItemTags.SPEARS)
                .add(ModItems.getRK(ModItems.RUBY_SPEAR))
                .add(ModItems.getRK(ModItems.SAPPHIRE_SPEAR))
                .add(ModItems.getRK(ModItems.EMERALD_SPEAR))
                .add(ModItems.getRK(ModItems.TOPAZ_SPEAR))
                .add(ModItems.getRK(ModItems.AMETHYST_SPEAR))
                .add(ModItems.getRK(ModItems.QUARTZ_SPEAR));

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_HELMET),
                        ModItems.getRK(ModItems.SAPPHIRE_HELMET),
                        ModItems.getRK(ModItems.EMERALD_HELMET),
                        ModItems.getRK(ModItems.TOPAZ_HELMET),
                        ModItems.getRK(ModItems.AMETHYST_HELMET),
                        ModItems.getRK(ModItems.QUARTZ_HELMET));

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_CHESTPLATE),
                        ModItems.getRK(ModItems.SAPPHIRE_CHESTPLATE),
                        ModItems.getRK(ModItems.EMERALD_CHESTPLATE),
                        ModItems.getRK(ModItems.TOPAZ_CHESTPLATE),
                        ModItems.getRK(ModItems.AMETHYST_CHESTPLATE),
                        ModItems.getRK(ModItems.QUARTZ_CHESTPLATE));

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_LEGGINGS),
                        ModItems.getRK(ModItems.SAPPHIRE_LEGGINGS),
                        ModItems.getRK(ModItems.EMERALD_LEGGINGS),
                        ModItems.getRK(ModItems.TOPAZ_LEGGINGS),
                        ModItems.getRK(ModItems.AMETHYST_LEGGINGS),
                        ModItems.getRK(ModItems.QUARTZ_LEGGINGS));

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.getRK(ModItems.RUBY_BOOTS),
                        ModItems.getRK(ModItems.SAPPHIRE_BOOTS),
                        ModItems.getRK(ModItems.EMERALD_BOOTS),
                        ModItems.getRK(ModItems.TOPAZ_BOOTS),
                        ModItems.getRK(ModItems.AMETHYST_BOOTS),
                        ModItems.getRK(ModItems.QUARTZ_BOOTS));

        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.getRK(ModItems.RUBY))
                .add(ModItems.getRK(ModItems.SAPPHIRE))
                .add(ModItems.getRK(ModItems.TOPAZ));
    }
}
