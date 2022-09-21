package net.Kyhan.turtletorture.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.Kyhan.turtletorture.entity.ModEntities;
import net.Kyhan.turtletorture.entity.custom.DyingturtleEntity;
import net.Kyhan.turtletorture.TurtleTorture;
public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();


    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.DyingTurtle, DyingturtleEntity.setAttributes());
    }

}
