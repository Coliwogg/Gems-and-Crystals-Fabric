package com.coliwogg.gemsandcrystals.trim;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.trim.ArmorTrimAssets;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> RUBY = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(GemsAndCrystals.MOD_ID, "ruby"));
    public static final RegistryKey<ArmorTrimMaterial> SAPPHIRE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"));
    public static final RegistryKey<ArmorTrimMaterial> TOPAZ = RegistryKey.of(RegistryKeys.TRIM_MATERIAL, Identifier.of(GemsAndCrystals.MOD_ID, "topaz"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, RUBY, Registries.ITEM.getEntry(ModItems.RUBY), Style.EMPTY.withColor(TextColor.parse("#f62217").getOrThrow()), "ruby");
        register(registerable, SAPPHIRE, Registries.ITEM.getEntry(ModItems.SAPPHIRE), Style.EMPTY.withColor(TextColor.parse("#0067bc").getOrThrow()), "sapphire");
        register(registerable, TOPAZ, Registries.ITEM.getEntry(ModItems.TOPAZ), Style.EMPTY.withColor(TextColor.parse("#f9c032").getOrThrow()), "topaz");
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey, RegistryEntry<Item> item, Style style, String name) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(ArmorTrimAssets.of(name), Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));
        registerable.register(armorTrimKey, trimMaterial);
    }
}
