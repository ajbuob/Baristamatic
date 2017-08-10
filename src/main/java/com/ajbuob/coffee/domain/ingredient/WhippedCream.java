package com.ajbuob.coffee.domain.ingredient;

public class WhippedCream extends BasicIngredient {

    private static final String INGREDIENT_NAME = "Whipped Cream";

    private static final double UNIT_COST = 1.00;

    public String getIngredientName() {
        return INGREDIENT_NAME;
    }

    public double getUnitCost() {
        return UNIT_COST;
    }
}