package com.ajbuob.coffee.domain.menu;

public class Coffee extends Drink {

    private static final String DRINK_NAME = "Coffee";

    @Override
    public String getDrinkName() {
        return DRINK_NAME;
    }
}