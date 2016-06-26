package com.ajbuob.coffee.domain.menu;

import java.util.Map;
import java.util.TreeMap;

import com.ajbuob.coffee.domain.ingredient.BasicIngredient;
import com.ajbuob.coffee.domain.ingredient.comparitor.BasicIngredientComparator;

public abstract class Drink {
	
	private Map<BasicIngredient,Integer> ingredients = new TreeMap<BasicIngredient,Integer>(new BasicIngredientComparator());
	
	public abstract String getDrinkName();
	
	public void addBasicIngredient(BasicIngredient basicIngredient, int quantity){
		ingredients.put(basicIngredient, quantity);	
	}
	public Map<BasicIngredient,Integer> getIngredients(){
		return ingredients;
	}
	
	//Returns the total cost of the menu item
	//based on the ingredients contained in it
	public double getTotalCost(){
		double totalCost = 0.0;
	    
		for (Map.Entry<BasicIngredient,Integer> entry : ingredients.entrySet()) {
			double unitCost = entry.getKey().getUnitCost();
		    int qty = entry.getValue();
		    totalCost = totalCost + (qty * unitCost );
		}
	    return totalCost;	
   }
	
	@Override
	//2 equal objects must return 
	//the same hashCode value
	public int hashCode(){
		return getDrinkName().hashCode();
		
	}
		
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Drink))
			return false;	
		if (obj == this)
			return true;
		return this.getDrinkName().equals(((Drink) obj).getDrinkName());
	}	
}
