package net.chaosmcc.tutorialmod.datagen;

import net.chaosmcc.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_STONE_BRICKS);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}