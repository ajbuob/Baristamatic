package com.ajbuob.coffee.domain.ingredient;

public class Cocoa extends BasicIngredient {
	
	 private static final String INGREDIANT_NAME = "Cocoa";
		
	 private static final double UNIT_COST = 0.90;
		
	 public String getIgredientName() {
		return INGREDIANT_NAME ;
	 }

	public double getUnitCost() {
		return  UNIT_COST ;
	}
}
