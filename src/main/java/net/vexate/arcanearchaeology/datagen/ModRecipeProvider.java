package net.vexate.arcanearchaeology.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.vexate.arcanearchaeology.ArcaneArchaeology;
import net.vexate.arcanearchaeology.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //GENERAL SHAPED RECIPES
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_BRUSH, 1)
                .pattern("F")
                .pattern("G")
                .pattern("A")
                .input('F', Items.FEATHER)
                .input('G', Items.GOLD_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ECHO_BRUSH, 1)
                .pattern("F")
                .pattern("D")
                .pattern("E")
                .input('F', Items.FEATHER)
                .input('D', Items.DIAMOND)
                .input('E', Items.ECHO_SHARD)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AZURE_PRISM, 1)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ModItems.AZURE_CRYSTAL_SHARD)
                .input('B', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModItems.AZURE_CRYSTAL_SHARD), conditionsFromItem(ModItems.AZURE_CRYSTAL_SHARD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AZURE_UPGRADE, 2)
                .pattern("ATA")
                .pattern("AGA")
                .pattern("AAA")
                .input('T', ModItems.AZURE_UPGRADE)
                .input('G', Items.GOLD_BLOCK)
                .input('A', ModItems.AZURE_CRYSTAL_SHARD)
                .criterion(hasItem(ModItems.AZURE_UPGRADE), conditionsFromItem(ModItems.AZURE_UPGRADE))
                .offerTo(exporter);

        // AZURE SMITHING TEMPLATE & ARMOR & TOOL SET UPGRADES
        offerSmithingTrimRecipe(exporter, ModItems.AZURE_UPGRADE, new Identifier(ArcaneArchaeology.MOD_ID, "azure_upgrade_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_HELMET), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_HELMET)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_helmet_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_CHESTPLATE), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_CHESTPLATE)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_chestplate_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_LEGGINGS), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_LEGGINGS)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_leggings_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_BOOTS), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_BOOTS)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_boots_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_SWORD), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_SWORD)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_sword_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_PICKAXE), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_PICKAXE)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_pickaxe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_AXE), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_AXE)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_axe_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_SHOVEL), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_SHOVEL)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_shovel_smithing"));
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(Items.GOLDEN_HOE), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_HOE)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_hoe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.AZURE_UPGRADE), Ingredient.ofItems(ModItems.ECHO_BRUSH), Ingredient.ofItems(ModItems.AZURE_PRISM), RecipeCategory.MISC, ModItems.AZURE_BRUSH)
                .criterion(hasItem(ModItems.AZURE_PRISM), conditionsFromItem(ModItems.AZURE_PRISM)).offerTo(exporter, new Identifier(ArcaneArchaeology.MOD_ID, "azure_brush_smithing"));
    }
}