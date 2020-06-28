package burger_shop;

public class HealthBurger extends Burger {
	
	public HealthBurger() {
		price = 3.99;
		totalBurgerPrice = price;
		
		meatType.setMeatType("Vegetarian");
		
		maxToppings = 4;
		toppingList = new Toppings(2);
	}
	
	public void showValues() {
		System.out.println("This is a healthy burger.  The bun type is " + this.breadType.getBreadType() + ", the meat type is " + meatType.getMeatType());
		
		toppingList.showToppings();
		
		this.totalBurgerPrice();
	}
}