package burger_shop;

import java.text.DecimalFormat;

public class Burger {
	// to help avoid double imprecision headaches
	DecimalFormat f = new DecimalFormat("##.00");
	
	protected Bread breadType;
	protected Meat meatType;
	protected Side sideType;
	protected Toppings toppingList;

	protected int maxToppings;
	
	protected double price;
	protected double totalBurgerPrice;
	
	public Burger() {
		price = 2.99;
		totalBurgerPrice = price;
		
		breadType = new Bread();
		meatType = new Meat();
		sideType = new Side();
		
		maxToppings = 2;
		toppingList = new Toppings(1);
	}
	
	public void plainBurgerPrice() {
		System.out.println("The base price of a plain burger is $" + price + " plus tax.");
	}
	
	public void totalBurgerPrice() {
		System.out.println("The total cost of the burger is $" + f.format(totalBurgerPrice) + " plus tax.");
	}
	
	public void showValues() {
		System.out.println("This is a standard burger.  The bun type is " + this.breadType.getBreadType() + ", the meat type is " + meatType.getMeatType());
		
		toppingList.showToppings();
		
		if(sideType.getSideType() != null) {
			System.out.println("The side is " + sideType.getSideType());
		}
		
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
		totalBurgerPrice += 0.3;
		return true;
	}
}
