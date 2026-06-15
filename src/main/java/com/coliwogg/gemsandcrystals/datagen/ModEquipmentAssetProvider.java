package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModArmorMaterials;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        this.pathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(ModArmorMaterials.RUBY_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "ruby")))
                        .build());

        consumer.accept(ModArmorMaterials.SAPPHIRE_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "sapphire")))
                        .build());

        consumer.accept(ModArmorMaterials.EMERALD_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "emerald")))
                        .build());

        consumer.accept(ModArmorMaterials.TOPAZ_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "topaz")))
                        .build());

        consumer.accept(ModArmorMaterials.AMETHYST_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "amethyst")))
                        .build());

        consumer.accept(ModArmorMaterials.QUARTZ_KEY,
                EquipmentClientInfo.builder()
                        .addHumanoidLayers(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz"))
                        .addLayers(EquipmentClientInfo.LayerType.HORSE_BODY,
                                new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(GemsAndCrystals.MOD_ID, "quartz")))
                        .build());
    }

    @Override
    public CompletableFuture<?> run(final CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
    }

    @Override
    public String getName() {
        return "Gems and Crystals Equipment Asset Definitions";
    }
}
