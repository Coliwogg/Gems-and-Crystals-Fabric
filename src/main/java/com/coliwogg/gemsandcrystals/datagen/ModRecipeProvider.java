package com.coliwogg.gemsandcrystals.datagen;

import com.coliwogg.gemsandcrystals.block.ModBlocks;
import com.coliwogg.gemsandcrystals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
    private static final List<ItemConvertible> TOPAZ_SMELTABLES = List.of(ModBlocks.TOPAZ_ORE, ModBlocks.DEEPSLATE_TOPAZ_ORE);
    private static final List<ItemConvertible> AMETHYST_SMELTABLES = List.of(ModBlocks.AMETHYST_ORE, ModBlocks.DEEPSLATE_AMETHYST_ORE);
    private static final List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 1.0f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY, 1.0f, 100, "ruby");
        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE, 1.0f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE, 1.0f, 100, "sapphire");
        offerSmelting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 1.0f, 200, "topaz");
        offerBlasting(exporter, TOPAZ_SMELTABLES, RecipeCategory.MISC, ModItems.TOPAZ, 1.0f, 100, "topaz");
        offerSmelting(exporter, AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 200, "amethyst");
        offerBlasting(exporter, AMETHYST_SMELTABLES, RecipeCategory.MISC, Items.AMETHYST_SHARD, 1.0f, 100, "amethyst");
        offerSmelting(exporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 200, "quartz");
        offerBlasting(exporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 1.0f, 100, "quartz");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TOPAZ, RecipeCategory.DECORATIONS, ModBlocks.TOPAZ_BLOCK);
        offerShapelessRecipe(exporter, Items.QUARTZ, Blocks.QUARTZ_BLOCK, "quartz", 4);

        offerSwordRecipe(exporter, ModItems.RUBY_SWORD, ModItems.RUBY);
        offerShovelRecipe(exporter, ModItems.RUBY_SHOVEL, ModItems.RUBY);
        offerPickaxeRecipe(exporter, ModItems.RUBY_PICKAXE, ModItems.RUBY);
        offerAxeRecipe(exporter, ModItems.RUBY_AXE, ModItems.RUBY);
        offerHoeRecipe(exporter, ModItems.RUBY_HOE, ModItems.RUBY);
        offerSwordRecipe(exporter, ModItems.SAPPHIRE_SWORD, ModItems.SAPPHIRE);
        offerShovelRecipe(exporter, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE);
        offerPickaxeRecipe(exporter, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE);
        offerAxeRecipe(exporter, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE);
        offerHoeRecipe(exporter, ModItems.SAPPHIRE_HOE, ModItems.SAPPHIRE);
        offerSwordRecipe(exporter, ModItems.EMERALD_SWORD, Items.EMERALD);
        offerShovelRecipe(exporter, ModItems.EMERALD_SHOVEL, Items.EMERALD);
        offerPickaxeRecipe(exporter, ModItems.EMERALD_PICKAXE, Items.EMERALD);
        offerAxeRecipe(exporter, ModItems.EMERALD_AXE, Items.EMERALD);
        offerHoeRecipe(exporter, ModItems.EMERALD_HOE, Items.EMERALD);
        offerSwordRecipe(exporter, ModItems.TOPAZ_SWORD, ModItems.TOPAZ);
        offerShovelRecipe(exporter, ModItems.TOPAZ_SHOVEL, ModItems.TOPAZ);
        offerPickaxeRecipe(exporter, ModItems.TOPAZ_PICKAXE, ModItems.TOPAZ);
        offerAxeRecipe(exporter, ModItems.TOPAZ_AXE, ModItems.TOPAZ);
        offerHoeRecipe(exporter, ModItems.TOPAZ_HOE, ModItems.TOPAZ);
        offerSwordRecipe(exporter, ModItems.AMETHYST_SWORD, Items.AMETHYST_SHARD);
        offerShovelRecipe(exporter, ModItems.AMETHYST_SHOVEL, Items.AMETHYST_SHARD);
        offerPickaxeRecipe(exporter, ModItems.AMETHYST_PICKAXE, Items.AMETHYST_SHARD);
        offerAxeRecipe(exporter, ModItems.AMETHYST_AXE, Items.AMETHYST_SHARD);
        offerHoeRecipe(exporter, ModItems.AMETHYST_HOE, Items.AMETHYST_SHARD);
        offerSwordRecipe(exporter, ModItems.QUARTZ_SWORD, Items.QUARTZ);
        offerShovelRecipe(exporter, ModItems.QUARTZ_SHOVEL, Items.QUARTZ);
        offerPickaxeRecipe(exporter, ModItems.QUARTZ_PICKAXE, Items.QUARTZ);
        offerAxeRecipe(exporter, ModItems.QUARTZ_AXE, Items.QUARTZ);
        offerHoeRecipe(exporter, ModItems.QUARTZ_HOE, Items.QUARTZ);

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

    public static void offerAxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerHoeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerPickaxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerShovelRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerSwordRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerHelmetRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerChestplateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerLeggingsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerBootsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerHorseArmorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("#X#")
                .input('#', input)
                .input('X', Items.LEATHER_HORSE_ARMOR)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
}
