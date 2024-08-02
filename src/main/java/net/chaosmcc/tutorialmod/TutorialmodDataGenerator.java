package net.chaosmcc.tutorialmod;

import net.chaosmcc.tutorialmod.datagen.ModAdvancementsProvider;
import net.chaosmcc.tutorialmod.datagen.ModBlockTagProvider;
import net.chaosmcc.tutorialmod.datagen.ModLootTableProvider;
import net.chaosmcc.tutorialmod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static java.security.Security.addProvider;

public class TutorialmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();

		pack.addProvider(MyTagGenerator::new);
		pack.addProvider(ModAdvancementsProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);


	}

	private static class MyTagGenerator extends FabricTagProvider.ItemTagProvider {
		public MyTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
			super(output, completableFuture);
		}
		private static final TagKey<Item> RAINBOW_BRICKS = TagKey.of(RegistryKeys.ITEM, Identifier.of("tutorialmod:rainbow_bricks"));


		@Override
		protected void configure(RegistryWrapper.WrapperLookup arg) {

			getOrCreateTagBuilder(RAINBOW_BRICKS)
					.add(Items.SLIME_BALL)
					.add(Items.ROTTEN_FLESH);


		}
	}
}
