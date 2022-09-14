package net.Kyhan.turtletorture.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.Kyhan.turtletorture.item.ModItems;
import net.minecraft.MinecraftVersion;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier TURTLE_ID
            = new Identifier("minecraft", "entities/turtle");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if(TURTLE_ID.equals(id)) {
                // Adds Turtle Meat drop
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.95f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TURTLEYUM))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
    if (TURTLE_ID.equals(id)) {

   FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
           .rolls(ConstantLootNumberProvider.create(1))
           .conditionally(RandomChanceLootCondition.builder(0.87f))
           .with(ItemEntry.builder(Items.SCUTE))
           .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
        supplier.withPool(poolBuilder.build());

    }
        }));

}}