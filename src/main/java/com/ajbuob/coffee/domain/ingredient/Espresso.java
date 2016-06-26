package com.ajbuob.coffee.domain.ingredient;

public class Espresso extends BasicIngredient {
	
	private static final String INGREDIANT_NAME = "Espresso";
		
	private static final double UNIT_COST = 1.10;
			
	public String getIgredientName() {
	    return INGREDIANT_NAME ;
	}

	public double getUnitCost() {
	    return  UNIT_COST ;
	}
}
