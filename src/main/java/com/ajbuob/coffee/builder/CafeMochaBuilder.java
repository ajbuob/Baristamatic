package com.ajbuob.coffee.builder;

import com.ajbuob.coffee.domain.ingredient.Cocoa;
import com.ajbuob.coffee.domain.ingredient.Espresso;
import com.ajbuob.coffee.domain.ingredient.SteamedMilk;
import com.ajbuob.coffee.domain.ingredient.WhippedCream;
import com.ajbuob.coffee.domain.menu.CaffeMocha;
import com.ajbuob.coffee.domain.menu.Drink;

public class CafeMochaBuilder implements DrinkBuilder {

	@Override
	public Drink build() {
		CaffeMocha caffeMocha = new CaffeMocha();
		caffeMocha.addBasicIngredient(new Espresso(),1);
		caffeMocha.addBasicIngredient(new Cocoa(),1);
		caffeMocha.addBasicIngredient(new SteamedMilk(),1);
		caffeMocha.addBasicIngredient(new WhippedCream(),1);
		return caffeMocha;
	}
}