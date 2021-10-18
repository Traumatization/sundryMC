package net.fabricmc.sundry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.sundry.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.CallbackI;

public class main implements ModInitializer {

	public static final String MOD_ID = "sundry";

	public static final Logger LOGGER = LogManager.getLogger("modid");

	public static final Item SALT = new Item(new FabricItemSettings().group(ItemGroup.FOOD));

	public static final Block SULFUR = new ModBlocks();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		net.minecraft.util.registry.Registry.register(Registry.ITEM, new Identifier("sundry", "new_item"), SALT);
		net.minecraft.util.registry.Registry.register(Registry.BLOCK, new Identifier("sundry", "sulfur"), SULFUR);
		net.minecraft.util.registry.Registry.register(Registry.ITEM, new Identifier("sundry", "sulfur"), new BlockItem(SULFUR, new Item.Settings().group(ItemGroup.MISC)));



	}
}
