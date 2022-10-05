package net.Kyhan.turtletorture.entity.client;

import net.Kyhan.turtletorture.TurtleTorture;
import net.Kyhan.turtletorture.entity.custom.DyingturtleEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class DyingTurtleModel extends AnimatedGeoModel<DyingturtleEntity> {
    @Override
    public Identifier getModelLocation(DyingturtleEntity object) {
        return new Identifier(TurtleTorture.MOD_ID, "geo/turtleplastic.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DyingturtleEntity object) {
        return new Identifier(TurtleTorture.MOD_ID, "textures/entity/turtleplastic/turtleplastichead.png");
    }

    @Override
    public Identifier getAnimationFileLocation(DyingturtleEntity animatable) {
        return new Identifier(TurtleTorture.MOD_ID, "animations/turtleplastichead.animation.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(DyingturtleEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }

    }
}
