package com.ajbuob.coffee.domain.ingredient;

public class WhippedCream extends BasicIngredient {
	
	  private static final String INGREDIANT_NAME = "Whipped Cream";
		
	  private static final double UNIT_COST = 1.00;
			
	  public String getIgredientName() {
		  return INGREDIANT_NAME ;
	  }

	  public double getUnitCost() {
		  return  UNIT_COST ;
      }
}
