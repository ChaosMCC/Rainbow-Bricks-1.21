package net.chaosmcc.tutorialmod.datagen;

import net.chaosmcc.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.WHITE_STONE_BRICKS)
                .add(ModBlocks.ORANGE_STONE_BRICKS)
                .add(ModBlocks.MAGENTA_STONE_BRICKS)
                .add(ModBlocks.LIGHT_BLUE_STONE_BRICKS)
                .add(ModBlocks.YELLOW_STONE_BRICKS)
                .add(ModBlocks.LIME_STONE_BRICKS)
                .add(ModBlocks.PINK_STONE_BRICKS)
                .add(ModBlocks.GRAY_STONE_BRICKS)
                .add(ModBlocks.LIGHT_GRAY_STONE_BRICKS)
                .add(ModBlocks.CYAN_STONE_BRICKS)
                .add(ModBlocks.PURPLE_STONE_BRICKS)
                .add(ModBlocks.BLUE_STONE_BRICKS)
                .add(ModBlocks.BROWN_STONE_BRICKS)
                .add(ModBlocks.GREEN_STONE_BRICKS)
                .add(ModBlocks.RED_STONE_BRICKS)
                .add(ModBlocks.BLACK_STONE_BRICKS);



        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.WHITE_STONE_BRICKS)
                .add(ModBlocks.ORANGE_STONE_BRICKS)
                .add(ModBlocks.MAGENTA_STONE_BRICKS)
                .add(ModBlocks.LIGHT_BLUE_STONE_BRICKS)
                .add(ModBlocks.YELLOW_STONE_BRICKS)
                .add(ModBlocks.LIME_STONE_BRICKS)
                .add(ModBlocks.PINK_STONE_BRICKS)
                .add(ModBlocks.GRAY_STONE_BRICKS)
                .add(ModBlocks.LIGHT_GRAY_STONE_BRICKS)
                .add(ModBlocks.CYAN_STONE_BRICKS)
                .add(ModBlocks.PURPLE_STONE_BRICKS)
                .add(ModBlocks.BLUE_STONE_BRICKS)
                .add(ModBlocks.BROWN_STONE_BRICKS)
                .add(ModBlocks.GREEN_STONE_BRICKS)
                .add(ModBlocks.RED_STONE_BRICKS)
                .add(ModBlocks.BLACK_STONE_BRICKS);


    }
}