package net.Kyhan.turtletorture.block;

import net.Kyhan.turtletorture.TurtleTorture;
import net.Kyhan.turtletorture.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TurtleTorture);




    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TurtleTorture.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TurtleTorture.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlocks() {
        TurtleTorture.LOGGER.info("Registering ModBlocks for " + TurtleTorture.MOD_ID);
    }
}
