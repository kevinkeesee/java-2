package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    	Meal meal1 = new Meal();
    	meal1.setDrink("cola");
    	meal1.setSide("chili");
    	Order order1 = new Order(meal1);
    	
    	Side side1 = new Side("nuggets");
    	Side side2 = new Side("ice cream");
    	Toppings toppings1 = new Toppings("cheese", "ketchup", "mustard", "onions");
    	Toppings toppings2 = new Toppings("bacon");
    	DeluxeBurger burger1 = new DeluxeBurger();
    	
    	order1.addBurger(burger1);
    	order1.addSides(side1, side2);
    	order1.addToppings(toppings1, toppings2);
    	order1.purchaseOrder();
    }
}