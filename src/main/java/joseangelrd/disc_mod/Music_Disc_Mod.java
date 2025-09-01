package joseangelrd.disc_mod;


import joseangelrd.disc_mod.item.disc_item;
import joseangelrd.disc_mod.item.disc_items_inventory_group;
import joseangelrd.disc_mod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Music_Disc_Mod implements ModInitializer {
	public static final String MOD_ID = "disc_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		disc_item.registerModItems();
		disc_items_inventory_group.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();
	}
}