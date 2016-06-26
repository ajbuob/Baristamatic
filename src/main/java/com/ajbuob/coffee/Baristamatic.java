package com.ajbuob.coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;

import com.ajbuob.coffee.builder.DrinkBuilder;
import com.ajbuob.coffee.builder.factory.DrinkBuilderFactory;
import com.ajbuob.coffee.domain.ingredient.BasicIngredient;
import com.ajbuob.coffee.domain.ingredient.factory.IngedientFactory;
import com.ajbuob.coffee.domain.menu.Drink;
import com.ajbuob.coffee.domain.menu.factory.MenuItemFactory;

public class Baristamatic {
	
	//Map to store the ingredients and the current quantity of each in the machine
	private SortedMap<BasicIngredient,Integer> machineInvantory = IngedientFactory.getInstance().getIngredients();
	
	//Set to store the menu items currently available for sale.
	private static SortedSet<String> menuItems = MenuItemFactory.getInstance().getMenuItems();
	
	//Convert set to array fur use in the menu switch statement.
    private static String [] menuArray = menuItems.toArray(new String[menuItems.size()]);
    
    //DrinkBuilderFactory to create menu items.
    private static DrinkBuilderFactory drinkBuilderFactory = DrinkBuilderFactory.getInstance();
    
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
   
	public Baristamatic(){	
		restockInvantory();		
	}

	public static void main(String[] args) {
		
		Baristamatic baristra = new Baristamatic();
	
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
			String input;
			
			//Loop over menu choices until 
			//the user decides to end the program. 
			while(true){
				
				baristra.printMachineInvantory();
				baristra.printMenu();
				
				input=br.readLine();
						
				//Check for empty input
				if (input.trim().equals("")){
					continue;
				}
				
				switch (input) {
		          case "Q":
		          case "q":
		        	 System.exit(0);	
		          case "R":
		          case "r":
		        	  baristra.restockInvantory();
		        	  break;	
		          case "1":
		        	  baristra.dispenseDrink(menuArray[0]);
		               break; 	  
		          case "2":
		        	  baristra.dispenseDrink(menuArray[1]);
		               break; 	
		          case "3":
		        	  baristra.dispenseDrink(menuArray[2]);
		               break; 	  
		          case "4":
		        	  baristra.dispenseDrink(menuArray[3]);
		               break;        
		          case "5":
		        	  baristra.dispenseDrink(menuArray[4]);
		               break; 	  
		          case "6":
		        	  baristra.dispenseDrink(menuArray[5]);
		               break; 
		          default:
		              System.out.println("Invalid selection: "+input);
		        }
		    }			
		}catch(IOException io){
			io.printStackTrace();
		}	
	}
	
	private void restockInvantory(){
		//Iterate over all ingredients and reset to the original value of 10 each
		for (Entry<BasicIngredient, Integer> entry : machineInvantory.entrySet()) {
		    BasicIngredient basicIngredient = entry.getKey();
		    machineInvantory.put(basicIngredient,10);
		}
	}
	
	private void printMachineInvantory(){	
		System.out.println("Invantory:");
		for (Map.Entry<BasicIngredient,Integer> entry : machineInvantory.entrySet()) {
		    System.out.println(entry.getKey().getIgredientName() + "," + entry.getValue());
	    }
	}	
	
	private void printMenu(){	
		System.out.println("Menu:");
		int menuIndex = 0;
		for(String menuItem: menuItems){
		   String totalCost =  decimalFormat.format(getDrinkCost(menuItem));
		   System.out.println(++menuIndex + "," + menuItem + ",$" + totalCost + "," + canDispenseDrink(menuItem));
		} 	
	}
	
	private static double getDrinkCost(String drinkName){
		DrinkBuilder drinkBuilder = drinkBuilderFactory.getDrinkBuilder(drinkName); 
		Drink coffeeDrink = drinkBuilder.build();
		return coffeeDrink.getTotalCost();
	}
		
	private void dispenseDrink(String drinkName){
		if(canDispenseDrink(drinkName)){
			System.out.println("Dispensing : " + drinkName);
			//Update Inventory now that it is determined
			//that all the ingredients are available
			
			DrinkBuilder drinkBuilder = drinkBuilderFactory.getDrinkBuilder(drinkName); 
			Drink coffeeDrink = drinkBuilder.build();
			
			//Loop over all ingredients in the drink and remove 
			//the needed quantity from the inventory.
			for (Entry<BasicIngredient, Integer> entry : coffeeDrink.getIngredients().entrySet()) {
			    BasicIngredient basicIngredient = entry.getKey();
			    int qtyInDrink = entry.getValue();
			    int qtyInInvantory = machineInvantory.get(basicIngredient);
			    int newQty = qtyInInvantory  - qtyInDrink;
			    machineInvantory.put(basicIngredient,newQty);
			}

		}
		else
			 System.out.println("Out of Stock : " + drinkName); 	
	}
	
	private boolean canDispenseDrink(String drinkName){
		DrinkBuilder drinkBuilder = drinkBuilderFactory.getDrinkBuilder(drinkName); 
		Drink coffeeDrink = drinkBuilder.build();
		
		//Check each ingredient against the current 
		//inventory to see if the drink can be made
		for (Entry<BasicIngredient, Integer> entry : coffeeDrink.getIngredients().entrySet()) {
		    BasicIngredient basicIngredient = entry.getKey();
		    int qtyInDrink = entry.getValue();
		    int qtyInInvantory = machineInvantory.get(basicIngredient);
		    //Condition for each ingredient which causes
		    //the drink not be be able to be made
		    if( qtyInDrink > qtyInInvantory)
		    	return false;
		}
		return true;
	}
}
