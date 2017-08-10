package com.ajbuob.coffee.builder;

import com.ajbuob.coffee.domain.ingredient.Cream;
import com.ajbuob.coffee.domain.ingredient.DecafCoffeeIngredient;
import com.ajbuob.coffee.domain.ingredient.Sugar;
import com.ajbuob.coffee.domain.menu.DecafCoffee;
import com.ajbuob.coffee.domain.menu.Drink;

public class DecafCoffeeBuilder implements DrinkBuilder {

    @Override
    public Drink build() {
        DecafCoffee decafCoffee = new DecafCoffee();
        decafCoffee.addBasicIngredient(new DecafCoffeeIngredient(), 3);
        decafCoffee.addBasicIngredient(new Sugar(), 1);
        decafCoffee.addBasicIngredient(new Cream(), 1);
        return decafCoffee;
    }
}