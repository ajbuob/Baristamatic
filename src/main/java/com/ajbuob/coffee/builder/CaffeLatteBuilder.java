package com.ajbuob.coffee.builder;

import com.ajbuob.coffee.domain.ingredient.Espresso;
import com.ajbuob.coffee.domain.ingredient.SteamedMilk;
import com.ajbuob.coffee.domain.menu.CaffeLatte;
import com.ajbuob.coffee.domain.menu.Drink;

public class CaffeLatteBuilder implements DrinkBuilder {

    @Override
    public Drink build() {
        CaffeLatte caffeLatte = new CaffeLatte();
        caffeLatte.addBasicIngredient(new Espresso(), 2);
        caffeLatte.addBasicIngredient(new SteamedMilk(), 1);
        return caffeLatte;
    }
}