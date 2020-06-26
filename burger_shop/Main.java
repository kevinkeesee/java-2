package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    	DeluxeBurger burger1 = new DeluxeBurger();
    	burger1.addTopping("lettuce");
    	burger1.addTopping("onion");
    	burger1.addTopping("cheese");
    	burger1.addTopping("pickle");
    	burger1.showValues();
    }
}
