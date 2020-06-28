package burger_shop;

import java.text.DecimalFormat;

public class Burger {
	// to help avoid double imprecision headaches
	DecimalFormat f = new DecimalFormat("##.00");
	
	protected Bread breadType;
	protected Meat meatType;
	protected Toppings toppingList;

	protected int maxToppings;
	
	protected static double price;
	protected double totalBurgerPrice;
	protected static double toppingPrice = 0.3;
	
	public Burger() {
		price = 2.99;
		totalBurgerPrice = price;
		
		breadType = new Bread();
		meatType = new Meat();
		
		maxToppings = 2;
		toppingList = new Toppings(1);
	}

	public void changeBread(Bread bread) {
		breadType = bread;
	}
	
	public void changeMeat(Meat meat) {
		meatType = meat;
	}
	
	public void plainBurgerPrice() {
		System.out.println("The base price of a plain burger is $" + price + " plus tax.");
	}
	
	public double totalBurgerPrice() {
		return Double.parseDouble(f.format(totalBurgerPrice));
	}
	
	public void showValues() {
		System.out.println("This is a standard burger.  The bun type is " + this.breadType.getBreadType() + ", the meat type is " + meatType.getMeatType());
		
		toppingList.showToppings();
		
		this.totalBurgerPrice();
	}
	
	public boolean addTopping(String topping) {
		
		if(toppingList.numberOfToppings() >= maxToppings) {
			System.out.println("You have ordered the max amount of toppings.");
			return false;
		} else if (!toppingList.addTopping(topping)) {
			System.out.println("Please enter a valid topping type.");
			return false;
		}
		totalBurgerPrice += toppingPrice;
		return true;
	}
}
