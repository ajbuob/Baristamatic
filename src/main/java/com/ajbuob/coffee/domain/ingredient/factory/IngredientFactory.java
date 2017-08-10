package com.ajbuob.coffee.domain.ingredient.factory;

import java.util.SortedMap;
import java.util.TreeMap;

import com.ajbuob.coffee.domain.ingredient.BasicIngredient;
import com.ajbuob.coffee.domain.ingredient.Cocoa;
import com.ajbuob.coffee.domain.ingredient.CoffeeIngredient;
import com.ajbuob.coffee.domain.ingredient.Cream;
import com.ajbuob.coffee.domain.ingredient.DecafCoffeeIngredient;
import com.ajbuob.coffee.domain.ingredient.Espresso;
import com.ajbuob.coffee.domain.ingredient.FoamedMilk;
import com.ajbuob.coffee.domain.ingredient.SteamedMilk;
import com.ajbuob.coffee.domain.ingredient.Sugar;
import com.ajbuob.coffee.domain.ingredient.WhippedCream;
import com.ajbuob.coffee.domain.ingredient.comparitor.BasicIngredientComparator;

public class IngredientFactory {

    private static IngredientFactory instance = null;

    private SortedMap<BasicIngredient, Integer> ingredientMap = new TreeMap<>(new BasicIngredientComparator());

    private IngredientFactory() {

        ingredientMap.put(new CoffeeIngredient(), 10);
        ingredientMap.put(new DecafCoffeeIngredient(), 10);
        ingredientMap.put(new Sugar(), 10);
        ingredientMap.put(new Cream(), 10);
        ingredientMap.put(new SteamedMilk(), 10);
        ingredientMap.put(new FoamedMilk(), 10);
        ingredientMap.put(new Espresso(), 10);
        ingredientMap.put(new Cocoa(), 10);
        ingredientMap.put(new WhippedCream(), 10);
    }

    public static synchronized IngredientFactory getInstance() {
        if (instance == null) {
            instance = new IngredientFactory();
        }
        return instance;
    }

    public SortedMap<BasicIngredient, Integer> getIngredients() {
        return ingredientMap;
    }
}