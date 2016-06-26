package com.ajbuob.coffee.domain.ingredient;

public abstract class BasicIngredient {
	
	public abstract String getIgredientName();
	public abstract double getUnitCost();
	
	@Override
	//2 equal objects must return 
	//the same hashCode value
	public int hashCode(){
		return getIgredientName().hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BasicIngredient))
			return false;	
		if (obj == this)
			return true;
		return this.getIgredientName().equals(((BasicIngredient) obj).getIgredientName());
	}
	

}
