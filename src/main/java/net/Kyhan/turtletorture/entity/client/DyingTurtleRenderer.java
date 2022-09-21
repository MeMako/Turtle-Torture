package net.Kyhan.turtletorture.entity.client;

import net.Kyhan.turtletorture.TurtleTorture;
import net.Kyhan.turtletorture.entity.custom.DyingturtleEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DyingTurtleRenderer extends GeoEntityRenderer<DyingturtleEntity> {

    public DyingTurtleRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DyingTurtleModel());
    }

    @Override
    public Identifier getTextureLocation(DyingturtleEntity instance) {
        return new Identifier(TurtleTorture.MOD_ID, "textures/entity/turtleplastic/turtleplastichead.png");
    }
}
