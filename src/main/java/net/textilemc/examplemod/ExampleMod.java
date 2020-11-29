package net.textilemc.examplemod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.textilemc.examplemod.block.FabricBlock;
import net.textilemc.examplemod.item.FabricItem;
import net.textilemc.examplemod.util.Pair;

public class ExampleMod implements ModInitializer {
	public static Item FABRIC_ITEM = new FabricItem(200);
	//public static Block FABRIC_BLOCK = new FabricBlock(200, Material.STONE);
	//public static Item FABRIC_BLOCK_ITEM = registerBlockItem(200);
	public static Block FABRIC_BLOCK;
	public static Item FABRIC_BLOCK_ITEM;
	public static Pair<Block, Item> FABRIC_BLOCK_PAIR = registerBlockWithItem(100, Material.STONE);
	static {
		FABRIC_BLOCK = FABRIC_BLOCK_PAIR.getLeft();
		FABRIC_BLOCK_ITEM = FABRIC_BLOCK_PAIR.getRight();
	}
	@Override
	public void onInitialize() {
		System.out.println("Hello Fabric world!");
	}
	public static Pair<Block, Item> registerBlockWithItem(int id, Material material) {
		Block block = new FabricBlock(id, material);
		if (Block.BLOCKS[id] != null) {
			Item.ITEMS[id] = new BlockItem(id - 256);
		}
		return new Pair<>(block, Item.ITEMS[id]);
	}
}
