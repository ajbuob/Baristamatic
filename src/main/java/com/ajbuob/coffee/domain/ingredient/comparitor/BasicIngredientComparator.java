package com.ajbuob.coffee.domain.ingredient.comparitor;

import java.util.Comparator;

import com.ajbuob.coffee.domain.ingredient.BasicIngredient;

public class BasicIngredientComparator implements Comparator<BasicIngredient> {

    public int compare(BasicIngredient ingredient1, BasicIngredient ingredient2) {

        return ingredient1.getIngredientName().compareTo(ingredient2.getIngredientName());
    }

}
