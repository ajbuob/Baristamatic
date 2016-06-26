package com.ajbuob.coffee.builder.factory;

import com.ajbuob.coffee.builder.CafeMochaBuilder;
import com.ajbuob.coffee.builder.CaffeAmericanoBuilder;
import com.ajbuob.coffee.builder.CaffeLatteBuilder;
import com.ajbuob.coffee.builder.CappuccinoBuilder;
import com.ajbuob.coffee.builder.CoffeeBuilder;
import com.ajbuob.coffee.builder.DecafCoffeeBuilder;
import com.ajbuob.coffee.builder.DrinkBuilder;

public class DrinkBuilderFactory {
	
	private static DrinkBuilderFactory instance = null;
	
	private DrinkBuilderFactory() { }
	
	public static DrinkBuilderFactory getInstance() {
        if(instance==null){
        	synchronized(DrinkBuilderFactory.class){
                if(instance==null)
                	instance=new DrinkBuilderFactory();
            }
        }
        return instance;
    }
	
	public DrinkBuilder getDrinkBuilder(String builderName){
		
		switch (builderName) {
        case "Caffe Mocha":
      	    return new CafeMochaBuilder();
        case "Caffe Americano":
        	  return new CaffeAmericanoBuilder();
        case "Caffe Latte":
        	  return new CaffeLatteBuilder();
        case "Cappuccino":
        	  return new CappuccinoBuilder();
        case "Coffee":
        	  return new CoffeeBuilder();  
        case "Decaf Coffee":
        	  return new DecafCoffeeBuilder(); 
        default:
            return null;
	    }
	}
}