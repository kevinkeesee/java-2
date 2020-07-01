package burger_shop;

public class Meat {
	protected static String[] meatTypes = {"Beef", "Chicken", "Steak", "Vegetarian"};
	protected String type = meatTypes[0];
	
	public String getMeatType() {
		return type.toLowerCase();
	}
	
	public void explainMeat() {
		System.out.println("Here's a list of available meat types:");
		
		for(String type : meatTypes) {
			System.out.println(type);
		}
	}
	
	public boolean setMeatType(String type) {
		for(int i = 0; i < meatTypes.length; i++) {
			if(meatTypes[i].toLowerCase().startsWith(type.toLowerCase())) {
				this.type = meatTypes[i];
				return true;
			}
		}
		System.out.println("Please enter a valid meat type.");
		return false;
	}
}
