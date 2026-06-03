package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.GemsAndCrystals;
import com.coliwogg.gemsandcrystals.item.ModArmorMaterials;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.render.entity.equipment.EquipmentModel;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAssetProvider implements DataProvider {
    private final FabricDataOutput.PathResolver pathProvider;

    public ModEquipmentAssetProvider(DataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        this.pathProvider = dataOutput.getResolver(DataOutput.OutputType.RESOURCE_PACK, "equipment");
    }

    private static void bootstrap(BiConsumer<RegistryKey<EquipmentAsset>, EquipmentModel> consumer) {

        consumer.accept(ModArmorMaterials.RUBY_KEY,
                EquipmentModel.builder()
                        .addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "ruby"))
                        .addLayers(EquipmentModel.LayerType.HORSE_BODY,
                                new EquipmentModel.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "ruby")))
                        .build());

        consumer.accept(ModArmorMaterials.SAPPHIRE_KEY,
                EquipmentModel.builder()
                        .addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire"))
                        .addLayers(EquipmentModel.LayerType.HORSE_BODY,
                                new EquipmentModel.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "sapphire")))
                        .build());

        consumer.accept(ModArmorMaterials.EMERALD_KEY,
                EquipmentModel.builder()
                        .addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "emerald"))
                        .addLayers(EquipmentModel.LayerType.HORSE_BODY,
                                new EquipmentModel.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "emerald")))
                        .build());

        consumer.accept(ModArmorMaterials.TOPAZ_KEY,
                EquipmentModel.builder()
                        .addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "topaz"))
                        .addLayers(EquipmentModel.LayerType.HORSE_BODY,
                                new EquipmentModel.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "topaz")))
                        .build());

        consumer.accept(ModArmorMaterials.AMETHYST_KEY,
                EquipmentModel.builder()
                        .addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst"))
                        .addLayers(EquipmentModel.LayerType.HORSE_BODY,
                                new EquipmentModel.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "amethyst")))
                        .build());

        consumer.accept(ModArmorMaterials.QUARTZ_KEY,
                EquipmentModel.builder()
                        .addHumanoidLayers(Identifier.of(GemsAndCrystals.MOD_ID, "quartz"))
                        .addLayers(EquipmentModel.LayerType.HORSE_BODY,
                                new EquipmentModel.Layer(Identifier.of(GemsAndCrystals.MOD_ID, "quartz")))
                        .build());
    }


    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        Map<RegistryKey<EquipmentAsset>, EquipmentModel> equipmentAssets = new HashMap<>();

        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });

        return DataProvider.writeAllToPath(writer, EquipmentModel.CODEC, this.pathProvider::resolveJson, equipmentAssets);
    }

    @Override
    public String getName() {
        return "Gems and Crystals Equipment Asset Definitions";
    }
}
