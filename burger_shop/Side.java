package burger_shop;

public class Side {
	protected static String[] sideTypes = {"French Fries", "Chicken Nuggets", "Chili", "Baked Potato", "Ice Cream"};
	protected String type;
	
	public Side() {
		type = sideTypes[0];
	}
	
	public Side(String type) {
		if(!this.setSideType(type)) {
			this.type = sideTypes[0];
		}
	}
	
	public String getSideType() {
		if (type != null) {
			return type.toLowerCase();
		} else {
			return null;
		}
	}
	
	public static void explainSides() {
		System.out.println("Here's a list of available sides:");
		
		for(String type : sideTypes) {
			System.out.println(type);
		}
	}
	
	public boolean setSideType(String type) {
		for(int i = 0; i < sideTypes.length; i++) {
			if(sideTypes[i].toLowerCase().contains(type.toLowerCase())) {
				this.type = sideTypes[i];
				return true;
			}
		}
		System.out.println("Please enter a valid side.");
		return false;
	}
}
