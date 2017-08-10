package com.ajbuob.coffee.builder;

import com.ajbuob.coffee.domain.ingredient.CoffeeIngredient;
import com.ajbuob.coffee.domain.ingredient.Cream;
import com.ajbuob.coffee.domain.ingredient.Sugar;
import com.ajbuob.coffee.domain.menu.Coffee;
import com.ajbuob.coffee.domain.menu.Drink;

public class CoffeeBuilder implements DrinkBuilder {

    @Override
    public Drink build() {
        Coffee coffee = new Coffee();
        coffee.addBasicIngredient(new CoffeeIngredient(), 3);
        coffee.addBasicIngredient(new Sugar(), 1);
        coffee.addBasicIngredient(new Cream(), 1);
        return coffee;
    }
}