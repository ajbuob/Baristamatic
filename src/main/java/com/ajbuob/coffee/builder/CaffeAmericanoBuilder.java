package com.ajbuob.coffee.builder;

import com.ajbuob.coffee.domain.ingredient.Espresso;
import com.ajbuob.coffee.domain.menu.CaffeAmericano;
import com.ajbuob.coffee.domain.menu.Drink;

public class CaffeAmericanoBuilder implements DrinkBuilder {

    @Override
    public Drink build() {
        CaffeAmericano caffeAmericano = new CaffeAmericano();
        caffeAmericano.addBasicIngredient(new Espresso(), 3);
        return caffeAmericano;
    }
}