package com.ajbuob.coffee.domain.ingredient;

public abstract class BasicIngredient {

    public abstract String getIngredientName();

    public abstract double getUnitCost();

    @Override
    public int hashCode() {
        return getIngredientName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BasicIngredient))
            return false;
        if (obj == this)
            return true;
        return this.getIngredientName().equals(((BasicIngredient) obj).getIngredientName());
    }
}