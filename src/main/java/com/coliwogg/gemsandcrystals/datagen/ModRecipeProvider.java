package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
                List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                List<ItemLike> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
                List<ItemLike> AMETHYST_SMELTABLES = List.of(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE);
                List<ItemLike> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE);

                oreSmelting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUBY, 1.0f, 200, "ruby");
                oreBlasting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.RUBY, 1.0f, 100, "ruby");
                oreSmelting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SAPPHIRE, 1.0f, 200, "sapphire");
                oreBlasting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SAPPHIRE, 1.0f, 100, "sapphire");
                oreSmelting(TOPAZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TOPAZ, 1.0f, 200, "topaz");
                oreBlasting(TOPAZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TOPAZ, 1.0f, 100, "topaz");
                oreSmelting(AMETHYST_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 200, "amethyst");
                oreBlasting(AMETHYST_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 100, "amethyst");
                oreSmelting(QUARTZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz");
                oreBlasting(QUARTZ_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz");

                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.DECORATIONS, ModBlocks.TOPAZ_BLOCK);

                offerSwordRecipe(output, ModItems.RUBY_SWORD, ModItems.RUBY, "ruby");
                offerShovelRecipe(output, ModItems.RUBY_SHOVEL, ModItems.RUBY, "ruby");
                offerPickaxeRecipe(output, ModItems.RUBY_PICKAXE, ModItems.RUBY, "ruby");
                offerAxeRecipe(output, ModItems.RUBY_AXE, ModItems.RUBY, "ruby");
                offerHoeRecipe(output, ModItems.RUBY_HOE, ModItems.RUBY, "ruby");
                offerSpearRecipe(output, ModItems.RUBY_SPEAR, ModItems.RUBY, "ruby");
                offerSwordRecipe(output, ModItems.SAPPHIRE_SWORD, ModItems.SAPPHIRE, "sapphire");
                offerShovelRecipe(output, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE, "sapphire");
                offerPickaxeRecipe(output, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE, "sapphire");
                offerAxeRecipe(output, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE, "sapphire");
                offerHoeRecipe(output, ModItems.SAPPHIRE_HOE, ModItems.SAPPHIRE, "sapphire");
                offerSpearRecipe(output, ModItems.SAPPHIRE_SPEAR, ModItems.RUBY, "sapphire");
                offerSwordRecipe(output, ModItems.EMERALD_SWORD, Items.EMERALD, "emerald");
                offerShovelRecipe(output, ModItems.EMERALD_SHOVEL, Items.EMERALD, "emerald");
                offerPickaxeRecipe(output, ModItems.EMERALD_PICKAXE, Items.EMERALD, "emerald");
                offerAxeRecipe(output, ModItems.EMERALD_AXE, Items.EMERALD, "emerald");
                offerHoeRecipe(output, ModItems.EMERALD_HOE, Items.EMERALD, "emerald");
                offerSpearRecipe(output, ModItems.EMERALD_SPEAR, Items.EMERALD, "emerald");
                offerSwordRecipe(output, ModItems.TOPAZ_SWORD, ModItems.TOPAZ, "topaz");
                offerShovelRecipe(output, ModItems.TOPAZ_SHOVEL, ModItems.TOPAZ, "topaz");
                offerPickaxeRecipe(output, ModItems.TOPAZ_PICKAXE, ModItems.TOPAZ, "topaz");
                offerAxeRecipe(output, ModItems.TOPAZ_AXE, ModItems.TOPAZ, "topaz");
                offerHoeRecipe(output, ModItems.TOPAZ_HOE, ModItems.TOPAZ, "topaz");
                offerSpearRecipe(output, ModItems.TOPAZ_SPEAR, ModItems.TOPAZ, "topaz");
                offerSwordRecipe(output, ModItems.AMETHYST_SWORD, Items.AMETHYST_SHARD, "amethyst");
                offerShovelRecipe(output, ModItems.AMETHYST_SHOVEL, Items.AMETHYST_SHARD, "amethyst");
                offerPickaxeRecipe(output, ModItems.AMETHYST_PICKAXE, Items.AMETHYST_SHARD, "amethyst");
                offerAxeRecipe(output, ModItems.AMETHYST_AXE, Items.AMETHYST_SHARD, "amethyst");
                offerHoeRecipe(output, ModItems.AMETHYST_HOE, Items.AMETHYST_SHARD, "amethyst");
                offerSpearRecipe(output, ModItems.AMETHYST_SPEAR, Items.AMETHYST_SHARD, "amethyst");
                offerSwordRecipe(output, ModItems.QUARTZ_SWORD, Items.QUARTZ, "quartz");
                offerShovelRecipe(output, ModItems.QUARTZ_SHOVEL, Items.QUARTZ, "quartz");
                offerPickaxeRecipe(output, ModItems.QUARTZ_PICKAXE, Items.QUARTZ, "quartz");
                offerAxeRecipe(output, ModItems.QUARTZ_AXE, Items.QUARTZ, "quartz");
                offerHoeRecipe(output, ModItems.QUARTZ_HOE, Items.QUARTZ, "quartz");
                offerSpearRecipe(output, ModItems.QUARTZ_SPEAR, Items.QUARTZ, "quartz");

                offerHelmetRecipe(output, ModItems.RUBY_HELMET, ModItems.RUBY, "ruby");
                offerChestplateRecipe(output, ModItems.RUBY_CHESTPLATE, ModItems.RUBY, "ruby");
                offerLeggingsRecipe(output, ModItems.RUBY_LEGGINGS, ModItems.RUBY, "ruby");
                offerBootsRecipe(output, ModItems.RUBY_BOOTS, ModItems.RUBY, "ruby");
                offerHelmetRecipe(output, ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE, "sapphire");
                offerChestplateRecipe(output, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE, "sapphire");
                offerLeggingsRecipe(output, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE, "sapphire");
                offerBootsRecipe(output, ModItems.SAPPHIRE_BOOTS, ModItems.SAPPHIRE, "sapphire");
                offerHelmetRecipe(output, ModItems.EMERALD_HELMET, Items.EMERALD, "emerald");
                offerChestplateRecipe(output, ModItems.EMERALD_CHESTPLATE, Items.EMERALD, "emerald");
                offerLeggingsRecipe(output, ModItems.EMERALD_LEGGINGS, Items.EMERALD, "emerald");
                offerBootsRecipe(output, ModItems.EMERALD_BOOTS, Items.EMERALD, "emerald");
                offerHelmetRecipe(output, ModItems.TOPAZ_HELMET, ModItems.TOPAZ, "topaz");
                offerChestplateRecipe(output, ModItems.TOPAZ_CHESTPLATE, ModItems.TOPAZ, "topaz");
                offerLeggingsRecipe(output, ModItems.TOPAZ_LEGGINGS, ModItems.TOPAZ, "topaz");
                offerBootsRecipe(output, ModItems.TOPAZ_BOOTS, ModItems.TOPAZ, "topaz");
                offerHelmetRecipe(output, ModItems.AMETHYST_HELMET, Items.AMETHYST_SHARD, "amethyst");
                offerChestplateRecipe(output, ModItems.AMETHYST_CHESTPLATE, Items.AMETHYST_SHARD, "amethyst");
                offerLeggingsRecipe(output, ModItems.AMETHYST_LEGGINGS, Items.AMETHYST_SHARD, "amethyst");
                offerBootsRecipe(output, ModItems.AMETHYST_BOOTS, Items.AMETHYST_SHARD, "amethyst");
                offerHelmetRecipe(output, ModItems.QUARTZ_HELMET, Items.QUARTZ, "quartz");
                offerChestplateRecipe(output, ModItems.QUARTZ_CHESTPLATE, Items.QUARTZ, "quartz");
                offerLeggingsRecipe(output, ModItems.QUARTZ_LEGGINGS, Items.QUARTZ, "quartz");
                offerBootsRecipe(output, ModItems.QUARTZ_BOOTS, Items.QUARTZ, "quartz");

                offerHorseArmorRecipe(output, ModItems.RUBY_HORSE_ARMOR, ModItems.RUBY, "ruby");
                offerHorseArmorRecipe(output, ModItems.SAPPHIRE_HORSE_ARMOR, ModItems.SAPPHIRE, "sapphire");
                offerHorseArmorRecipe(output, ModItems.EMERALD_HORSE_ARMOR, Items.EMERALD, "emerald");
                offerHorseArmorRecipe(output, ModItems.TOPAZ_HORSE_ARMOR, ModItems.TOPAZ, "topaz");
                offerHorseArmorRecipe(output, ModItems.AMETHYST_HORSE_ARMOR, Items.AMETHYST_SHARD, "amethyst");
                offerHorseArmorRecipe(output, ModItems.QUARTZ_HORSE_ARMOR, Items.QUARTZ, "quartz");
            }

            void offerAxeRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.TOOLS, finishedRecipe, 1)
                        .pattern("##")
                        .pattern("#|")
                        .pattern(" |")
                        .define('#', ingredientItem)
                        .define('|', Items.STICK)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group(itemGroup)
                        .save(output);
            }

            void offerHoeRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.TOOLS, finishedRecipe, 1)
                        .pattern("##")
                        .pattern(" |")
                        .pattern(" |")
                        .define('#', ingredientItem)
                        .define('|', Items.STICK)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group(itemGroup)
                        .save(output);
            }

            void offerPickaxeRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.TOOLS, finishedRecipe, 1)
                        .pattern("###")
                        .pattern(" | ")
                        .pattern(" | ")
                        .define('#', ingredientItem)
                        .define('|', Items.STICK)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group(itemGroup)
                        .save(output);
            }

            void offerShovelRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.TOOLS, finishedRecipe, 1)
                        .pattern("#")
                        .pattern("|")
                        .pattern("|")
                        .define('#', ingredientItem)
                        .define('|', Items.STICK)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group(itemGroup)
                        .save(output);
            }

            void offerSwordRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("#")
                        .pattern("#")
                        .pattern("|")
                        .define('#', ingredientItem)
                        .define('|', Items.STICK)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group(itemGroup)
                        .save(output);
            }

            void offerSpearRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("  #")
                        .pattern(" | ")
                        .pattern("|  ")
                        .define('#', ingredientItem)
                        .define('|', Items.STICK)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group(itemGroup)
                        .save(output);
            }

            void offerHelmetRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("###")
                        .pattern("# #")
                        .define('#', ingredientItem)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .group(itemGroup)
                        .save(output);
            }

            void offerChestplateRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup){
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("# #")
                        .pattern("###")
                        .pattern("###")
                        .define('#', ingredientItem)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .group(itemGroup)
                        .save(output);
            }

            void offerLeggingsRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("###")
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', ingredientItem)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .group(itemGroup)
                        .save(output);
            }

            void offerBootsRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("# #")
                        .pattern("# #")
                        .define('#', ingredientItem)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .group(itemGroup)
                        .save(output);
            }

            void offerHorseArmorRecipe(RecipeOutput output, ItemLike finishedRecipe, ItemLike ingredientItem, String itemGroup) {
                shaped(RecipeCategory.COMBAT, finishedRecipe, 1)
                        .pattern("# #")
                        .pattern("###")
                        .pattern("#X#")
                        .define('#', ingredientItem)
                        .define('X', Items.LEATHER_HORSE_ARMOR)
                        .unlockedBy(getHasName(ingredientItem), has(ingredientItem))
                        .group(itemGroup)
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Gems and Crystals Recipes";
    }
}
