package buildingBlocks;


public class Juice extends Beverage {
	private int caloriesPerOunce;
	private int caloriesConsumed;
	
	public Juice(int caloriesPerOunce, int maxOunces){
		super(maxOunces);
		this.caloriesPerOunce = caloriesPerOunce;
		this.caloriesPerOunce = 0;
	}
	
	public int drink(int ouncesToDrink){
		int ouncesDrank = super.drink(ouncesToDrink);
		caloriesConsumed += ouncesDrank*caloriesPerOunce;
		System.out.println("You have consumed "+ouncesDrank+" calories");
		return ouncesDrank;
	}
	
	public int getCaloriesConsumed(){
		return caloriesConsumed;
	}
}
