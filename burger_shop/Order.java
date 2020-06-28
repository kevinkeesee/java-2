package burger_shop;

import java.util.ArrayList;

public class Order {
	
	protected ArrayList<Meal> meals;
	protected ArrayList<Side> sides;
	protected ArrayList<Toppings> toppings;
	
	protected double totalCost;
	
	public Order() {
		meals = new ArrayList<Meal>();
		
		sides = new ArrayList<Side>();
		toppings = new ArrayList<Toppings>();
	}
	
	public Order(Burger burger, Bread bread, Meat meat) {
		meals = new ArrayList<Meal>();
		
		Meal meal = new Meal(burger, bread, meat);
		meals.add(meal);
		
		sides = new ArrayList<Side>();
		toppings = new ArrayList<Toppings>();
	}
	
	public Order(Meal meal) {
		meals = new ArrayList<Meal>();
		meals.add(meal);
		
		sides = new ArrayList<Side>();
		toppings = new ArrayList<Toppings>();
	}
	
	public void addToppings(Toppings ...t) {
		for (Toppings e : t) {
			toppings.add(e);
		}
	}
	
	public void addSides(Side ...s) {
		for (Side e : s) {
			sides.add(e);
		}
	}
	
	public void addBurger(Burger b) {
		Meal meal = new Meal(b);
		meals.add(meal);
	}
	
	public void purchaseOrder() {
		if(meals.size() == 1) {
			System.out.println("The total cost of your meal is $" + meals.get(0).totalCost() + "\n");
		} else if (meals.size() > 1) {
			
			for(int i = 0; i < meals.size(); i++) {
				System.out.println("The cost of meal " + (i + 1) + " is $" + meals.get(i).totalCost() + ", with a side of " + meals.get(i).getSide() 
						+ " and " + meals.get(i).getDrink() + " as a drink." );
				totalCost += meals.get(i).totalCost();
			}
			System.out.println("The total cost for this order is $" + totalCost + "\n");
		}
		
		if(sides.size() == 1) {
			System.out.println("Your additional side is: " + sides.get(0).getSideType());
		} else if (meals.size() > 1) {
			
			for(int i = 0; i < sides.size(); i++) {
				System.out.println("Your additional side #" + (i + 1) + " is: " + sides.get(i).getSideType());
			}
		}
		
		if(toppings.size() == 1) {
			System.out.println("\nYour additional toppings are: ");
			toppings.get(0).printToppings();
		} else if (toppings.size() > 1) {
			System.out.println("\nYour additional toppings are: ");
			for (int i = 0; i < toppings.size(); i++) {
				toppings.get(i).printToppings();
			}
		}
	}
}