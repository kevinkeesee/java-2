package burger_shop;

public class Drink {
	protected static String[] drinkTypes = {"water", "Coca Cola", "Pepsi", "lemonade", "Gatorade", "Dr Pepper"};
	protected String type;
	
	public Drink() {
		type = drinkTypes[0];
	}
	
	public Drink(String type) {
		if(!this.setDrinkType(type)) {
			this.type = drinkTypes[0];
		}
	}
	
	public String getDrinkType() {
		if (type != null) {
			return type;
		} else {
			return null;
		}
	}
	
	public static void explainDrinks() {
		System.out.println("Here's a list of available drinks:");
		
		for(String type : drinkTypes) {
			System.out.println(type);
		}
	}
	
	public boolean setDrinkType(String type) {
		for(int i = 0; i < drinkTypes.length; i++) {
			if(drinkTypes[i].toLowerCase().contains(type.toLowerCase())) {
				this.type = drinkTypes[i];
				return true;
			}
		}
		System.out.println("Please enter a valid drink.");
		return false;
	}
}
