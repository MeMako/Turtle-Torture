package net.Kyhan.turtletorture.world.gen;

import net.Kyhan.turtletorture.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;

public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.categories(Biome.Category.OCEAN, Biome.Category.NETHER),
                SpawnGroup.WATER_CREATURE, ModEntities.DyingTurtle, 1000, 20, 400);

        //SpawnRestrictionAccessor.callRegister(ModEntities.DyingTurtle, SpawnRestriction.Location.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isvalid);
    }



}
