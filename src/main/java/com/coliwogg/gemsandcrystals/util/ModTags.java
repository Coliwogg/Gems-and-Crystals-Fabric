package com.coliwogg.gemsandcrystals.util;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> RUBY_REPAIR = createTag("ruby_repair");
        public static final TagKey<Item> SAPPHIRE_REPAIR = createTag("sapphire_repair");
        public static final TagKey<Item> EMERALD_REPAIR = createTag("emerald_repair");
        public static final TagKey<Item> TOPAZ_REPAIR = createTag("topaz_repair");
        public static final TagKey<Item> AMETHYST_REPAIR = createTag("amethyst_repair");
        public static final TagKey<Item> QUARTZ_REPAIR = createTag("quartz_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(GemsAndCrystals.MOD_ID, name));
        }
    }
}
