package net.moppi.moppimod;

import net.fabricmc.api.ModInitializer;
import net.moppi.moppimod.block.ModBlocks;
import net.moppi.moppimod.item.ModItemGroup;
import net.moppi.moppimod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoppiMod implements ModInitializer {
	public static final String MOD_ID = "moppimod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
