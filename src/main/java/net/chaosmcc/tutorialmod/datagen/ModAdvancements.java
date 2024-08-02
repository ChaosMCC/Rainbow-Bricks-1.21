package net.chaosmcc.tutorialmod.datagen;


import net.chaosmcc.tutorialmod.registry.Constants;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

@SuppressWarnings("removal")
public class ModAdvancements implements Consumer<Consumer<AdvancementEntry>> {
    @Override
    public void accept(Consumer<AdvancementEntry> advancementConsumer) {
        AdvancementEntry wooden_weapons = Advancement.Builder.create()
                .parent(Identifier.of("recipes/root"))
                .criterion("got_sticks", InventoryChangedCriterion.Conditions.items(Items.STONE_BRICKS))
                .rewards(AdvancementRewards.Builder
                        .recipe(Identifier.of(Constants.BW_NAMESPACE, "blue_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "black_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "brown_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "cyan_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "green_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "light_blue_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "light_gray_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "lime_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "magenta_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "orange_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "pink_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "purple_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "red_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "white_stone_bricks"))
                        .addRecipe(Identifier.of(Constants.BW_NAMESPACE, "yellow_stone_bricks"))
                )
                .build(advancementConsumer, Constants.BW_NAMESPACE + "/got_sticks");
    }
}

