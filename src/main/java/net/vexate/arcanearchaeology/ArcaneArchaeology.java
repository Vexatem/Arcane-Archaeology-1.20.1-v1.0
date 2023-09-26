package net.vexate.arcanearchaeology;

import net.fabricmc.api.ModInitializer;
import net.vexate.arcanearchaeology.block.ModBlocks;
import net.vexate.arcanearchaeology.block.custom.ModBlockEntities;
import net.vexate.arcanearchaeology.item.ModItemGroup;
import net.vexate.arcanearchaeology.item.ModItems;
import net.vexate.arcanearchaeology.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneArchaeology implements ModInitializer {
	public static final String MOD_ID = "arcanearchaeology";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Arcane Archeology says Hello");                 //info message

		ModItemGroup.registerTab();                                  //creates creative mode tab
		ModItems.registerModItems();                                 //registers items and blocks to cm tab
		ModBlocks.registerModBlocks();                               //registers blocks and block items
		ModBlockEntities.registerBlockEntities();                    //registers block entities
		ModLootTableModifiers.modifyLootTables();                    //injects modded loot tables
	}
}
