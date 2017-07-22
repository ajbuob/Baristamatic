package com.ajbuob.coffee.domain.ingredient;

public class Cocoa extends BasicIngredient {

    private static final String INGREDIENT_NAME = "Cocoa";

    private static final double UNIT_COST = 0.90;

    public String getIngredientName() {
        return INGREDIENT_NAME;
    }

    public double getUnitCost() {
        return UNIT_COST;
    }
}
