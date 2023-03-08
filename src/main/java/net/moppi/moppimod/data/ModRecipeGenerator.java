package net.moppi.moppimod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.moppi.moppimod.block.ModBlocks;
import net.moppi.moppimod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE,
                0.7f, 200, "citrine");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_WOOD,
                        ModBlocks.RED_MAPLE_WOOD, ModBlocks.RED_MAPLE_PLANKS, ModBlocks.RED_MAPLE_LOG), RecipeCategory.MISC, Items.CHARCOAL,
                0.2f, 200, "citrine");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.DECORATIONS,
                ModBlocks.CITRINE_BLOCK);


    }
}
