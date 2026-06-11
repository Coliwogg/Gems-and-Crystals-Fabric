package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
                List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                List<ItemConvertible> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
                List<ItemConvertible> AMETHYST_SMELTABLES = List.of(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE);
                List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE);

                offerSmelting(RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 1.0f, 200, "ruby");
                offerBlasting(RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 1.0f, 100, "ruby");
                offerSmelting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE, 1.0f, 200, "sapphire");
                offerBlasting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE, 1.0f, 100, "sapphire");
                offerSmelting(TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 1.0f, 200, "topaz");
                offerBlasting(TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 1.0f, 100, "topaz");
                offerSmelting(AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 200, "amethyst");
                offerBlasting(AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 100, "amethyst");
                offerSmelting(QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz");
                offerBlasting(QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.DECORATIONS, ModBlocks.TOPAZ_BLOCK);
                offerShapelessRecipe(Items.QUARTZ, Blocks.QUARTZ_BLOCK, "quartz", 4);

                offerSwordRecipe(exporter, ModItems.RUBY_SWORD, ModItems.RUBY, "ruby");
                offerShovelRecipe(exporter, ModItems.RUBY_SHOVEL, ModItems.RUBY, "ruby");
                offerPickaxeRecipe(exporter, ModItems.RUBY_PICKAXE, ModItems.RUBY, "ruby");
                offerAxeRecipe(exporter, ModItems.RUBY_AXE, ModItems.RUBY, "ruby");
                offerHoeRecipe(exporter, ModItems.RUBY_HOE, ModItems.RUBY, "ruby");
                offerSpearRecipe(exporter, ModItems.RUBY_SPEAR, ModItems.RUBY, "ruby");
                offerSwordRecipe(exporter, ModItems.SAPPHIRE_SWORD, ModItems.SAPPHIRE, "sapphire");
                offerShovelRecipe(exporter, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE, "sapphire");
                offerPickaxeRecipe(exporter, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE, "sapphire");
                offerAxeRecipe(exporter, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE, "sapphire");
                offerHoeRecipe(exporter, ModItems.SAPPHIRE_HOE, ModItems.SAPPHIRE, "sapphire");
                offerSpearRecipe(exporter, ModItems.SAPPHIRE_SPEAR, ModItems.RUBY, "sapphire");
                offerSwordRecipe(exporter, ModItems.EMERALD_SWORD, Items.EMERALD, "emerald");
                offerShovelRecipe(exporter, ModItems.EMERALD_SHOVEL, Items.EMERALD, "emerald");
                offerPickaxeRecipe(exporter, ModItems.EMERALD_PICKAXE, Items.EMERALD, "emerald");
                offerAxeRecipe(exporter, ModItems.EMERALD_AXE, Items.EMERALD, "emerald");
                offerHoeRecipe(exporter, ModItems.EMERALD_HOE, Items.EMERALD, "emerald");
                offerSpearRecipe(exporter, ModItems.EMERALD_SPEAR, Items.EMERALD, "emerald");
                offerSwordRecipe(exporter, ModItems.TOPAZ_SWORD, ModItems.TOPAZ, "topaz");
                offerShovelRecipe(exporter, ModItems.TOPAZ_SHOVEL, ModItems.TOPAZ, "topaz");
                offerPickaxeRecipe(exporter, ModItems.TOPAZ_PICKAXE, ModItems.TOPAZ, "topaz");
                offerAxeRecipe(exporter, ModItems.TOPAZ_AXE, ModItems.TOPAZ, "topaz");
                offerHoeRecipe(exporter, ModItems.TOPAZ_HOE, ModItems.TOPAZ, "topaz");
                offerSpearRecipe(exporter, ModItems.TOPAZ_SPEAR, ModItems.TOPAZ, "topaz");
                offerSwordRecipe(exporter, ModItems.AMETHYST_SWORD, Items.AMETHYST_SHARD, "amethyst");
                offerShovelRecipe(exporter, ModItems.AMETHYST_SHOVEL, Items.AMETHYST_SHARD, "amethyst");
                offerPickaxeRecipe(exporter, ModItems.AMETHYST_PICKAXE, Items.AMETHYST_SHARD, "amethyst");
                offerAxeRecipe(exporter, ModItems.AMETHYST_AXE, Items.AMETHYST_SHARD, "amethyst");
                offerHoeRecipe(exporter, ModItems.AMETHYST_HOE, Items.AMETHYST_SHARD, "amethyst");
                offerSpearRecipe(exporter, ModItems.AMETHYST_SPEAR, Items.AMETHYST_SHARD, "amethyst");
                offerSwordRecipe(exporter, ModItems.QUARTZ_SWORD, Items.QUARTZ, "quartz");
                offerShovelRecipe(exporter, ModItems.QUARTZ_SHOVEL, Items.QUARTZ, "quartz");
                offerPickaxeRecipe(exporter, ModItems.QUARTZ_PICKAXE, Items.QUARTZ, "quartz");
                offerAxeRecipe(exporter, ModItems.QUARTZ_AXE, Items.QUARTZ, "quartz");
                offerHoeRecipe(exporter, ModItems.QUARTZ_HOE, Items.QUARTZ, "quartz");
                offerSpearRecipe(exporter, ModItems.QUARTZ_SPEAR, Items.QUARTZ, "quartz");

                offerHelmetRecipe(exporter, ModItems.RUBY_HELMET, ModItems.RUBY);
                offerChestplateRecipe(exporter, ModItems.RUBY_CHESTPLATE, ModItems.RUBY);
                offerLeggingsRecipe(exporter, ModItems.RUBY_LEGGINGS, ModItems.RUBY);
                offerBootsRecipe(exporter, ModItems.RUBY_BOOTS, ModItems.RUBY);
                offerHelmetRecipe(exporter, ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE);
                offerChestplateRecipe(exporter, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE);
                offerLeggingsRecipe(exporter, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE);
                offerBootsRecipe(exporter, ModItems.SAPPHIRE_BOOTS, ModItems.SAPPHIRE);
                offerHelmetRecipe(exporter, ModItems.EMERALD_HELMET, Items.EMERALD);
                offerChestplateRecipe(exporter, ModItems.EMERALD_CHESTPLATE, Items.EMERALD);
                offerLeggingsRecipe(exporter, ModItems.EMERALD_LEGGINGS, Items.EMERALD);
                offerBootsRecipe(exporter, ModItems.EMERALD_BOOTS, Items.EMERALD);
                offerHelmetRecipe(exporter, ModItems.TOPAZ_HELMET, ModItems.TOPAZ);
                offerChestplateRecipe(exporter, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ);
                offerLeggingsRecipe(exporter, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ);
                offerBootsRecipe(exporter, ModItems.TOPAZ_BOOTS, ModItems.TOPAZ);
                offerHelmetRecipe(exporter, ModItems.AMETHYST_HELMET, Items.AMETHYST_SHARD);
                offerChestplateRecipe(exporter, ModItems.AMETHYST_CHESTPLATE, Items.AMETHYST_SHARD);
                offerLeggingsRecipe(exporter, ModItems.AMETHYST_LEGGINGS, Items.AMETHYST_SHARD);
                offerBootsRecipe(exporter, ModItems.AMETHYST_BOOTS, Items.AMETHYST_SHARD);
                offerHelmetRecipe(exporter, ModItems.QUARTZ_HELMET, Items.QUARTZ);
                offerChestplateRecipe(exporter, ModItems.QUARTZ_CHESTPLATE, Items.QUARTZ);
                offerLeggingsRecipe(exporter, ModItems.QUARTZ_LEGGINGS, Items.QUARTZ);
                offerBootsRecipe(exporter, ModItems.QUARTZ_BOOTS, Items.QUARTZ);

                offerHorseArmorRecipe(exporter, ModItems.RUBY_HORSE_ARMOR, ModItems.RUBY);
                offerHorseArmorRecipe(exporter, ModItems.SAPPHIRE_HORSE_ARMOR, ModItems.SAPPHIRE);
                offerHorseArmorRecipe(exporter, ModItems.EMERALD_HORSE_ARMOR, Items.EMERALD);
                offerHorseArmorRecipe(exporter, ModItems.TOPAZ_HORSE_ARMOR, ModItems.TOPAZ);
                offerHorseArmorRecipe(exporter, ModItems.AMETHYST_HORSE_ARMOR, Items.AMETHYST_SHARD);
                offerHorseArmorRecipe(exporter, ModItems.QUARTZ_HORSE_ARMOR, Items.QUARTZ);
            }

            void offerAxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String itemGroup) {
                createShaped(RecipeCategory.TOOLS, output, 1)
                        .pattern("##")
                        .pattern("#|")
                        .pattern(" |")
                        .input('#', input)
                        .input('|', Items.STICK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group(itemGroup)
                        .offerTo(exporter);
            }

            void offerHoeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String itemGroup) {
                createShaped(RecipeCategory.TOOLS, output, 1)
                        .pattern("##")
                        .pattern(" |")
                        .pattern(" |")
                        .input('#', input)
                        .input('|', Items.STICK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group(itemGroup)
                        .offerTo(exporter);
            }

            void offerPickaxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String itemGroup) {
                createShaped(RecipeCategory.TOOLS, output, 1)
                        .pattern("###")
                        .pattern(" | ")
                        .pattern(" | ")
                        .input('#', input)
                        .input('|', Items.STICK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group(itemGroup)
                        .offerTo(exporter);
            }

            void offerShovelRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String itemGroup) {
                createShaped(RecipeCategory.TOOLS, output, 1)
                        .pattern("#")
                        .pattern("|")
                        .pattern("|")
                        .input('#', input)
                        .input('|', Items.STICK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group(itemGroup)
                        .offerTo(exporter);
            }

            void offerSwordRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String itemGroup) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("#")
                        .pattern("#")
                        .pattern("|")
                        .input('#', input)
                        .input('|', Items.STICK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group(itemGroup)
                        .offerTo(exporter);
            }

            void offerSpearRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input, String itemGroup) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("  #")
                        .pattern(" | ")
                        .pattern("|  ")
                        .input('#', input)
                        .input('|', Items.STICK)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .group(itemGroup)
                        .offerTo(exporter);
            }

            void offerHelmetRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("###")
                        .pattern("# #")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            void offerChestplateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("# #")
                        .pattern("###")
                        .pattern("###")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            void offerLeggingsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("###")
                        .pattern("# #")
                        .pattern("# #")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            void offerBootsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("# #")
                        .pattern("# #")
                        .input('#', input)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            void offerHorseArmorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.COMBAT, output, 1)
                        .pattern("# #")
                        .pattern("###")
                        .pattern("#X#")
                        .input('#', input)
                        .input('X', Items.LEATHER_HORSE_ARMOR)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

        };
    }

    @Override
    public String getName() {
        return "";
    }
}
