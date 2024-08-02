package net.chaosmcc.tutorialmod.datagen;

import net.chaosmcc.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {


        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.RED_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.RED_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.RED_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.GREEN_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.GREEN_DYE), conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GREEN_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.BLUE_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.BLUE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.PURPLE_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.PURPLE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.CYAN_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CYAN_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.ORANGE_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.ORANGE_DYE), conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.ORANGE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.YELLOW_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.YELLOW_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIME_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.LIME_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.LIME_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PINK_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.PINK_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.PINK_DYE), conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.PINK_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.GRAY_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.GRAY_DYE), conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.GRAY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE), conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.LIGHT_GRAY_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.BROWN_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.BROWN_DYE), conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.BROWN_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.BLACK_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.BLACK_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.WHITE_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.WHITE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE), conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.LIGHT_BLUE_STONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STONE_BRICKS, 8)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE_BRICKS)
                .input('R', Items.MAGENTA_DYE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.MAGENTA_DYE), conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.MAGENTA_STONE_BRICKS)));



    }
}