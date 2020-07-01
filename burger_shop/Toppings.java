package burger_shop;

import java.util.ArrayList;

public class Toppings {
	
	private String[] toppingsTypes;
	protected ArrayList<String> toppings;
	
	public Toppings(int selector) {
		switch(selector) {
			case 1:
				toppingsTypes = new String[] {"Cheese", "Lettuce", "Onions", "Tomato", "Pickles", "Ketchup", "Mustard", "Mayonnaise", "Bacon"};
				break;
			case 2:
				// specifically for HealthBurger
				toppingsTypes = new String[] {"Lettuce", "Onions", "Tomato", "Pickles", "Ketchup", "Mustard"};
				break;
		}
		
		toppings = new ArrayList<String>();
	}
	
	// For initializing Toppings to add to an Order
	public Toppings(String ...ts) {
		toppingsTypes = new String[] {"Cheese", "Lettuce", "Onions", "Tomato", "Pickles", "Ketchup", "Mustard", "Mayonnaise", "Bacon"};
		toppings = new ArrayList<String>();
		
		for (String t : ts) {
			addTopping(t);
		}
	}
	
	public void showToppings() {
		if(toppings.size() == 1) {
			System.out.println("The topping is " + toppings.get(0).toLowerCase());
		} else if (toppings.size() == 2) {
			System.out.println("The toppings are " + toppings.get(0).toLowerCase() + " and " + toppings.get(1).toLowerCase());
		} else if (toppings.size() > 2) {
			System.out.print("The toppings are ");
			
			for(int i = 0; i < (toppings.size() - 1); i++) {
				System.out.print(toppings.get(i).toLowerCase() + ", ");
			}
			
			System.out.print("and " + toppings.get(toppings.size() - 1).toLowerCase() + "\n");
		}
	}
	
	public void explainToppings(int maxToppings) {
		System.out.println("You can order a maximum of " + maxToppings + " toppings for this burger.");
		System.out.println("Each additional topping will cost $0.30.");
		System.out.println("Here's a list of available toppings:");
		
		for(String topping : toppingsTypes) {
			System.out.println(topping);
		}
	}
	
	public boolean addTopping(String topping) {
		for(int i = 0; i < toppingsTypes.length; i++) {
			if(toppingsTypes[i].toLowerCase().startsWith(topping.toLowerCase())) {
				toppings.add(toppingsTypes[i]);
				return true;
			}
		}
		return false;
	}
	
	public int numberOfToppings() {
		return toppings.size();
	}
	
	// For use in the Order class
	public void printToppings() {
		if(toppings.size() == 1) {
			System.out.print(toppings.get(0));
			return;
		}
		
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(toppings.get(i));
		}
	}
}