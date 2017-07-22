package com.ajbuob.coffee.domain.ingredient;

public class SteamedMilk extends BasicIngredient {

    private static final String INGREDIENT_NAME = "Steamed Milk";

    private static final double UNIT_COST = 0.35;

    public String getIngredientName() {
        return INGREDIENT_NAME;
    }

    public double getUnitCost() {
        return UNIT_COST;
    }
}
