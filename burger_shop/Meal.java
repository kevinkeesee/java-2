package burger_shop;

import java.text.DecimalFormat;

public class Meal {
	// to help avoid double imprecision headaches
	DecimalFormat f = new DecimalFormat("##.00");
		
	protected Burger burger;
	protected Drink drink;
	protected Side side;
	
	protected static double drinkPrice = 1.5;
	protected static double sidePrice = 2;
	
	public Meal(){
		burger = new Burger();
		drink = new Drink();
		side = new Side();
	}
	
	public Meal(Burger burger, Bread bread, Meat meat) {
		this.burger = burger;
		this.burger.changeBread(bread);
		this.burger.changeMeat(meat);
		
		drink = new Drink();
		side = new Side();
	}
	
	public Meal(Burger b) {
		burger = b;
		
		drink = new Drink();
		side = new Side();
	}
	
	public double totalCost() {
		double total = burger.totalBurgerPrice();
		total += (drinkPrice + sidePrice);
		
		return Double.parseDouble(f.format(total));
	}
	
	public String getSide() {
		return side.getSideType();
	}
	
	public String getDrink() {
		return drink.getDrinkType();
	}
	
	public void setSide(String s) {
		side.setSideType(s);
	}
	
	public void setDrink(String d) {
		drink.setDrinkType(d);
	}
}