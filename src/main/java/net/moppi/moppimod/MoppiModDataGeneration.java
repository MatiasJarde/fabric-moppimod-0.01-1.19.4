package net.moppi.moppimod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.moppi.moppimod.data.ModLootTableGenerator;
import net.moppi.moppimod.data.ModModelProvider;
import net.moppi.moppimod.data.ModRecipeGenerator;

public class MoppiModDataGeneration implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
	}
}
