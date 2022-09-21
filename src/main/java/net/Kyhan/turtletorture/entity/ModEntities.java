package net.Kyhan.turtletorture.entity;

import net.Kyhan.turtletorture.TurtleTorture;
import net.Kyhan.turtletorture.entity.custom.DyingturtleEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<DyingturtleEntity> DyingTurtle = Registry.register(Registry.ENTITY_TYPE, new Identifier(TurtleTorture.MOD_ID, "turtleplastic"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, DyingturtleEntity::new).dimensions(EntityDimensions.fixed(1, 1)).build());
}
