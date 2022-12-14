package net.Kyhan.turtletorture;

import net.Kyhan.turtletorture.block.ModBlocks;
import net.Kyhan.turtletorture.entity.ModEntities;
import net.Kyhan.turtletorture.entity.client.DyingTurtleRenderer;
import net.Kyhan.turtletorture.item.ModItems;
import net.Kyhan.turtletorture.util.ModLootTableModifiers;
import net.Kyhan.turtletorture.util.ModRegistries;
import net.Kyhan.turtletorture.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

	public class TurtleTorture implements ModInitializer {
		// This logger is used to write text to the console and the log file.
		// It is considered best practice to use your mod id as the logger's name.
		// That way, it's clear which mod wrote info, warnings, and errors.
		public  static  final String MOD_ID = "turtletorture";
		public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



		@Override
		public void onInitialize() {
			// This code runs as soon as Minecraft is in a mod-load-ready state.
			// However, some things (like resources) may still be uninitialized.
			// Proceed with mild caution.

			ModItems.registerModItems();
			ModBlocks.registerModBlocks();
			ModWorldGen.generateModWorldGen();
			ModLootTableModifiers.modifyLootTables();
			ModRegistries.registerModStuffs();
			GeckoLib.initialize();

		}

}

