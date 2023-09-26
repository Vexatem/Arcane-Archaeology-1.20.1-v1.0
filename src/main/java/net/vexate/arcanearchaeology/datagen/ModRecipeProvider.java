package net.vexate.arcanearchaeology.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.vexate.arcanearchaeology.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMETHYST_BRUSH, 1)
                .pattern("F")
                .pattern("G")
                .pattern("A")
                .input('F', Items.FEATHER)
                .input('G', Items.GOLD_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AMETHYST_BRUSH)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ECHO_BRUSH, 1)
                .pattern("F")
                .pattern("D")
                .pattern("E")
                .input('F', Items.FEATHER)
                .input('D', Items.DIAMOND)
                .input('E', Items.ECHO_SHARD)
                .criterion(hasItem(Items.ECHO_SHARD), conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ECHO_BRUSH)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AZURE_PRISM, 1)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ModItems.AZURE_CRYSTAL_SHARD)
                .input('B', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModItems.AZURE_CRYSTAL_SHARD), conditionsFromItem(ModItems.AZURE_CRYSTAL_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AZURE_PRISM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AZURE_UPGRADE, 2)
                .pattern("ATA")
                .pattern("AGA")
                .pattern("AAA")
                .input('T', ModItems.AZURE_UPGRADE)
                .input('G', Items.GOLD_BLOCK)
                .input('A', ModItems.AZURE_CRYSTAL_SHARD)
                .criterion(hasItem(ModItems.AZURE_UPGRADE), conditionsFromItem(ModItems.AZURE_UPGRADE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AZURE_UPGRADE)));
    }
}