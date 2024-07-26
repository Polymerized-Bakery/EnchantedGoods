package com.daedreus.Bakery.EnchantedGoods;

import eu.pb4.polymer.core.api.entity.PolymerEntityUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static de.dafuqs.additionalentityattributes.AdditionalEntityAttributes.*;

public class EnchantedGoods implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("EnchantedGoods");





	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Enchanting Game!");
		PolymerEntityUtils.registerAttribute(LAVA_SPEED);
		PolymerEntityUtils.registerAttribute(WATER_SPEED);
		PolymerEntityUtils.registerAttribute(CRITICAL_BONUS_DAMAGE);
		PolymerEntityUtils.registerAttribute(WATER_VISIBILITY);
		PolymerEntityUtils.registerAttribute(WIDTH);
		PolymerEntityUtils.registerAttribute(HEIGHT);
		PolymerEntityUtils.registerAttribute(HITBOX_SCALE);
		PolymerEntityUtils.registerAttribute(HITBOX_WIDTH);
		PolymerEntityUtils.registerAttribute(HITBOX_HEIGHT);
		PolymerEntityUtils.registerAttribute(MODEL_SCALE);
		PolymerEntityUtils.registerAttribute(MODEL_WIDTH);
		PolymerEntityUtils.registerAttribute(MODEL_HEIGHT);
		PolymerEntityUtils.registerAttribute(MOB_DETECTION_RANGE);
		PolymerEntityUtils.registerAttribute(LAVA_VISIBILITY);
		PolymerEntityUtils.registerAttribute(BONUS_LOOT_COUNT_ROLLS);
		PolymerEntityUtils.registerAttribute(BONUS_RARE_LOOT_ROLLS);
		PolymerEntityUtils.registerAttribute(DROPPED_EXPERIENCE);
		PolymerEntityUtils.registerAttribute(MAGIC_PROTECTION);
		PolymerEntityUtils.registerAttribute(COLLECTION_RANGE);
		LOGGER.info("Re-registered additionalattributes as serverside");


		LOGGER.info("Enchanted Game!");
	}
}