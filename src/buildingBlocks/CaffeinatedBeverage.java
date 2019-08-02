package buildingBlocks;

public class CaffeinatedBeverage extends Beverage{
	
	private double gramsOfCaffeine;
	private int amountOfCaffeineConsumed;
	
	public CaffeinatedBeverage(int maxOunces,double gramsOfCaffeine, int amountOfCaffeineConsumed) {
		super(maxOunces);
		this.gramsOfCaffeine = gramsOfCaffeine;
		this.amountOfCaffeineConsumed = amountOfCaffeineConsumed;
	}
	
	public double getGramsOfCaffeine() {
		return gramsOfCaffeine;
	}
	public int getamountOfCaffeineConsumed() {
		return amountOfCaffeineConsumed;
	}
	
	public int drink(int ouncesToDrink){
		int ouncesDrank = super.drink(ouncesToDrink);
		amountOfCaffeineConsumed += ouncesDrank*gramsOfCaffeine;
		System.out.println("You've consumed "+amountOfCaffeineConsumed+" grams of Caffeine");
		return ouncesDrank;
	}

}
