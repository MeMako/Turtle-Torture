package net.Kyhan.tutorialmod.item;

import net.Kyhan.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TurtleTorture = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "turtletorture"),
            () -> new ItemStack(ModItems.GRASS));
}
