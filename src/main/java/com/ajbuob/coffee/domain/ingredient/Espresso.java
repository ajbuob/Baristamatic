package com.ajbuob.coffee.domain.ingredient;

public class Espresso extends BasicIngredient {

    private static final String INGREDIENT_NAME = "Espresso";

    private static final double UNIT_COST = 1.10;

    public String getIngredientName() {
        return INGREDIENT_NAME;
    }

    public double getUnitCost() {
        return UNIT_COST;
    }
}