package net.Kyhan.turtletorture.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GRASS = (new FoodComponent.Builder()).hunger(9999).saturationModifier(9999F).build();

    public static final FoodComponent TURTLEYUM = (new FoodComponent.Builder()).hunger(4).saturationModifier(1F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 4000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 6000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 1), 1.0F).build();
    public static final FoodComponent COOKTURTLE = (new FoodComponent.Builder()).hunger(12).saturationModifier(7).build();

}
