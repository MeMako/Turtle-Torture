package net.Kyhan.turtletorture.entity.client;

import net.Kyhan.turtletorture.TurtleTorture;
import net.Kyhan.turtletorture.entity.custom.DyingturtleEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DyingTurtleModel extends AnimatedGeoModel<DyingturtleEntity> {
    @Override
    public Identifier getModelLocation(DyingturtleEntity object) {
        return new Identifier(TurtleTorture.MOD_ID, "geo/TurtlePlastic.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DyingturtleEntity object) {
        return null;
    }

    @Override
    public Identifier getAnimationFileLocation(DyingturtleEntity animatable) {
        return null;
    }
}
