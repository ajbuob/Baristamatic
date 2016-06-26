package com.ajbuob.coffee.domain.ingredient.comparitor;

import java.util.Comparator;

import com.ajbuob.coffee.domain.ingredient.BasicIngredient;

public class BasicIngredientComparator implements Comparator<BasicIngredient> {
	
	public int compare(BasicIngredient bI1,BasicIngredient bI2){
		
		return bI1.getIgredientName().compareTo(bI2.getIgredientName());
	}

}
