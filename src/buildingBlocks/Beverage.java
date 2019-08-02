package buildingBlocks;

public class Beverage {
	private int ouncesRemaining;
	private int maxOunces;
	
	public Beverage(int maxOunces){
		this.ouncesRemaining = maxOunces;
		
		//All beverages start out full
		this.maxOunces = maxOunces;
	}
	
	/**
	 * Reduces the amount of the beverage by the given amount. 
	 * won't go below zero.
	 * @param ouncesToDrink
	 * @return ouncesDrank
	 */
	public int drink(int ouncesToDrink){
		int ouncesBeforhand = ouncesToDrink; 
		this.ouncesRemaining-=ouncesToDrink;
		
		//Don't want to go below zero
		if(this.ouncesRemaining<0){
			this.ouncesRemaining=0;
		}
		System.out.println("You have "+this.ouncesRemaining+" ounces remaining");
		return (ouncesBeforhand - this.ouncesRemaining);
	}
	
	public int getOuncesRemaining(){
		return this.ouncesRemaining;
	}
	
	public void refil(){
		this.ouncesRemaining= this.maxOunces;
	}
	
}
