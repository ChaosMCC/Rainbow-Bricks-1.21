package net.chaosmcc.tutorialmod.datagen;

import net.chaosmcc.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WHITE_STONE_BRICKS);
        addDrop(ModBlocks.ORANGE_STONE_BRICKS);
        addDrop(ModBlocks.MAGENTA_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_STONE_BRICKS);
        addDrop(ModBlocks.YELLOW_STONE_BRICKS);
        addDrop(ModBlocks.LIME_STONE_BRICKS);
        addDrop(ModBlocks.PINK_STONE_BRICKS);
        addDrop(ModBlocks.GRAY_STONE_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_STONE_BRICKS);
        addDrop(ModBlocks.CYAN_STONE_BRICKS);
        addDrop(ModBlocks.PURPLE_STONE_BRICKS);
        addDrop(ModBlocks.BLUE_STONE_BRICKS);
        addDrop(ModBlocks.BROWN_STONE_BRICKS);
        addDrop(ModBlocks.GREEN_STONE_BRICKS);
        addDrop(ModBlocks.RED_STONE_BRICKS);
        addDrop(ModBlocks.BLACK_STONE_BRICKS);


    }
}
