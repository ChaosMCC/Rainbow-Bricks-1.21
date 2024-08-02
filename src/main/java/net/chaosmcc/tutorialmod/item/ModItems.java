package net.chaosmcc.tutorialmod.item;

import net.chaosmcc.tutorialmod.Tutorialmod;
import net.chaosmcc.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    // Define the key for the custom item group
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Tutorialmod.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.BLUE_STONE_BRICKS))
            .displayName(Text.translatable("itemGroup.rainbow_bricks"))
            .build();

    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering ModItems for " + Tutorialmod.MOD_ID);

        // Register the custom item group
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        // Register items to the custom item group
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModBlocks.RED_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.ORANGE_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.YELLOW_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.LIME_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.GREEN_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.CYAN_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.LIGHT_BLUE_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.BLUE_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.PURPLE_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.MAGENTA_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.PINK_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.BROWN_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.BLACK_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.GRAY_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.LIGHT_GRAY_STONE_BRICKS.asItem());
            itemGroup.add(ModBlocks.WHITE_STONE_BRICKS.asItem());
        });
    }
}
