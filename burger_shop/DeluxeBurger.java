package burger_shop;

public class DeluxeBurger extends Burger {
	public DeluxeBurger() {
		price = 4.99;
		totalBurgerPrice = price;
		
		sideType = new Side("French Fries");
		
		maxToppings = 6;
		toppingList = new Toppings(1);
	}
	
	public void showValues() {
		System.out.println("This is a double deluxe burger.  The bun type is " + this.breadType.getBreadType() + ", the meat type is " + meatType.getMeatType());
		
		toppingList.showToppings();
		
		if(sideType.getSideType() != null) {
			System.out.println("The side is " + sideType.getSideType());
		}
		
		this.totalBurgerPrice();
	}
}