package net.chaosmcc.tutorialmod.block;

import net.chaosmcc.tutorialmod.Tutorialmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLUE_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "blue_stone_bricks", true
    );
    public static final Block BLACK_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "black_stone_bricks", true
    );
    public static final Block BROWN_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "brown_stone_bricks", true
    );
    public static final Block CYAN_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "cyan_stone_bricks", true
    );
    public static final Block GRAY_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "gray_stone_bricks", true
    );
    public static final Block GREEN_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "green_stone_bricks", true
    );
    public static final Block LIGHT_BLUE_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "light_blue_stone_bricks", true
    );
    public static final Block LIGHT_GRAY_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "light_gray_stone_bricks", true
    );
    public static final Block LIME_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "lime_stone_bricks", true
    );
    public static final Block MAGENTA_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "magenta_stone_bricks", true
    );
    public static final Block ORANGE_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "orange_stone_bricks", true
    );
    public static final Block PINK_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "pink_stone_bricks", true
    );
    public static final Block PURPLE_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "purple_stone_bricks", true
    );
    public static final Block RED_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "red_stone_bricks", true
    );
    public static final Block WHITE_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "white_stone_bricks", true
    );
    public static final Block YELLOW_STONE_BRICKS = register(
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
            "yellow_stone_bricks", true
    );


        public static Block register(Block block, String name, boolean shouldRegisterItem) {
            // Register the block and its item.
            Identifier id = Identifier.of(Tutorialmod.MOD_ID, name);

            // Sometimes, you may not want to register an item for the block.
            // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
            if (shouldRegisterItem) {
                BlockItem blockItem = new BlockItem(block, new Item.Settings());
                Registry.register(Registries.ITEM, id, blockItem);
            }

            return Registry.register(Registries.BLOCK, id, block);
        }

    public static void registerModBlocks() {
    }
}
