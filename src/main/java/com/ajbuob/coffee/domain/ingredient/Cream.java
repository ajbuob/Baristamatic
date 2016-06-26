package com.ajbuob.coffee.domain.ingredient;

public class Cream extends BasicIngredient {
	
	 private static final String INGREDIANT_NAME = "Cream";
		
     private static final double UNIT_COST = 0.25;
		
	 public String getIgredientName() {
		 return INGREDIANT_NAME ;
	 }

	public double getUnitCost() {
		return  UNIT_COST ;
	}
}
