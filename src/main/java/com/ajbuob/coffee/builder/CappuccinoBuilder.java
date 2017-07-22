package com.ajbuob.coffee.builder;

import com.ajbuob.coffee.domain.ingredient.Espresso;
import com.ajbuob.coffee.domain.ingredient.FoamedMilk;
import com.ajbuob.coffee.domain.ingredient.SteamedMilk;
import com.ajbuob.coffee.domain.menu.Cappuccino;
import com.ajbuob.coffee.domain.menu.Drink;

public class CappuccinoBuilder implements DrinkBuilder {

    @Override
    public Drink build() {
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.addBasicIngredient(new Espresso(), 2);
        cappuccino.addBasicIngredient(new SteamedMilk(), 1);
        cappuccino.addBasicIngredient(new FoamedMilk(), 1);
        return cappuccino;
    }
}
