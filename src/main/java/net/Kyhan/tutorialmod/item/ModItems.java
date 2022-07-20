package net.Kyhan.tutorialmod.item;

import net.Kyhan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item TURTLESHELL_HELMET = registerItem("turtleshell_helmet",
            new ArmorItem(ModArmorMaterials.TURTLESHELL, EquipmentSlot.HEAD
                    ,new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item TURTLESHELL_CHESTPLATE = registerItem("turtleshell_chestplate",
            new ArmorItem(ModArmorMaterials.TURTLESHELL, EquipmentSlot.CHEST
                    ,new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item TURTLESHELL_LEGGINGS = registerItem("turtleshell_leggings",
            new ArmorItem(ModArmorMaterials.TURTLESHELL, EquipmentSlot.LEGS
                    ,new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item TURTLESHELL_BOOTS = registerItem("turtleshell_boots",
            new ArmorItem(ModArmorMaterials.TURTLESHELL, EquipmentSlot.FEET
                    ,new FabricItemSettings().group(ModItemGroup.TurtleTorture)));

    public static final Item GRASS = registerItem("grass",
            new Item(new FabricItemSettings().group(ModItemGroup.TurtleTorture).food(ModFoodComponents.GRASS)));


    private static Item registerItem(String name, Item item){
      return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);


    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
//add depthstrider to turtle armour and add full set effect (resistance with slowness?)