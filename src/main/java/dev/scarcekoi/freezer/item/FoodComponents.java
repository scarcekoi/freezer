package dev.scarcekoi.freezer.item;

import net.minecraft.component.type.FoodComponent;

public class FoodComponents {
    public static final FoodComponent WAFFLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.35f).build();
    public static final FoodComponent PARTIAL_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent HALF_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.45f).build();
    public static final FoodComponent MOST_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodComponent CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.55f).build();

    public static final FoodComponent FROZEN_WAFFLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.35f).build();
    public static final FoodComponent FROZEN_PARTIAL_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent FROZEN_HALF_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.45f).build();
    public static final FoodComponent FROZEN_MOST_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodComponent FROZEN_CHOCOLATE_WAFFLE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.55f).build();
}
