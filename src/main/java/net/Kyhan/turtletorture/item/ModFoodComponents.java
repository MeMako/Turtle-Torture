package net.Kyhan.turtletorture.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GRASS = (new FoodComponent.Builder()).hunger(9999).saturationModifier(9999F).build();

    public static final FoodComponent TURTLEYUM = (new FoodComponent.Builder()).hunger(4).saturationModifier(1F).build();
    public static final FoodComponent COOKTURTLE = (new FoodComponent.Builder()).hunger(12).saturationModifier(7).build();

}
