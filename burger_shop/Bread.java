package burger_shop;

public class Bread {
	protected static String[] breadTypes = {"Plain", "Sesame Seed", "Potato", "English Muffin", "Pretzel", "Sliced Bread", "Lettuce"};
	protected String type = breadTypes[0];
	
	public String getBreadType() {
		return type.toLowerCase();
	}
	
	public void explainBread() {
		System.out.println("Here's a list of available bun types:");
		
		for(String type : breadTypes) {
			System.out.println(type);
		}
	}
	
	public boolean setBreadType(String type) {
		for(int i = 0; i < breadTypes.length; i++) {
			if(breadTypes[i].toLowerCase().startsWith(type.toLowerCase())) {
				this.type = breadTypes[i];
				return true;
			}
		}
		System.out.println("Please enter a valid bread type.");
		return false;
	}
}
