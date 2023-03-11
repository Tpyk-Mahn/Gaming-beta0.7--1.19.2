package net.tpykmahn.jaune;

import net.fabricmc.api.ModInitializer;
import net.tpykmahn.jaune.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JauneJade implements ModInitializer {
	public static final String MOD_ID = "gaming";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
