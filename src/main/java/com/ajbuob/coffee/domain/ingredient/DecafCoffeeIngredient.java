package com.ajbuob.coffee.domain.ingredient;

public class DecafCoffeeIngredient extends BasicIngredient {

    private static final String INGREDIENT_NAME = "Decaf Coffee";

    private static final double UNIT_COST = 0.75;

    public String getIngredientName() {
        return INGREDIENT_NAME;
    }

    public double getUnitCost() {
        return UNIT_COST;
    }
}
