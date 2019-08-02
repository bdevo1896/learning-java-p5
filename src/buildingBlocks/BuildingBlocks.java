package buildingBlocks;


public class BuildingBlocks {

	public static void main(String[] args) {
		
		//Question 1
		/* Using AaronClass as a guide, create a new class that implements
		 * BuildingBlocksInterface. Your implementation should have TWO
		 * member variables (as opposed to one in AaronClass). Your methods
		 * printAMessage and performMath should also be different (I don't really
		 * care how) than the ones in AaronClass 
		 * 
		 * Additionally, you should create two objects of your class in the main below
		 * Just as I have done, you should DECLARE your object both as your class name
		 * and using BuildingBlocksInterface. In either case, you should use constructor 
		 * for your class. Then call both printAMessage and performMath on your objects.
		 */
		BuildingBlocksInterface anObject = new AaronClass(42);
		anObject.printAMessage("A message that is printed");
		System.out.println(anObject.performMath(10, 3));
		
		
		AaronClass aSecondObject = new AaronClass(420);
		aSecondObject.printAMessage("A second Message");
		System.out.println(aSecondObject.performMath(5, 5));
		
		BuildingBlocksInterface troll = new BryceClass("lol",42);
		anObject.printAMessage("A message that is printed by me");
		System.out.println(troll.performMath(4, 2));
		
		
		BryceClass aMiniMe = new BryceClass("trololol",420);
		aSecondObject.printAMessage("A second Message");
		System.out.println(aSecondObject.performMath(9, 9));
		
		
		
		
		//Question 2
		/* Using BuildingBlocksInterface as a guide. Create a new interface that
		 * has three methods. (I don't really care what, just make three methods)
		 * 
		 * Create a class that implements your interface, and then create two object
		 * of your class here. Just as above, one of your objects should declared using the
		 * interface type, and one should be declared using your class name. Call all three 
		 * methods on each object 
		 */
		
		TheDevaughnComplex obj1 = new TheRealest(9999);
		obj1.trollMessage();
		System.out.println("Your mom's age: "+ obj1.theAgeOfYourMom(32));
		System.out.println(obj1.trickery());
		
		TheRealest obj2 = new TheRealest(9999);
		obj2.trollMessage();
		System.out.println("Your mom's age(2): "+ obj2.theAgeOfYourMom(15));
		System.out.println(obj2.trickery());
		
		//Question 3
		/* Using Juice.java as a guide. Create a new class CaffeinatedBeverage with the following
		 * characteristics:  
		 * CaffeinatedBeverage is a subclass of Beverage
		 * CaffeinatedBeverage contains a member variable for the number of grams of caffeine per ounce
		 * CaffeinatedBeverage contains a member variable for the amount caffeine consumed
		 * CaffeinatedBeverage contains a constructor
		 * CaffeinatedBeverage has a getter for its member variables
		 * CaffeinatedBeverage overrides drink(), which calls the superclass drink, 
		 * 		increases the amount of caffeine consumed, and prints out the amount caffeine consumed 
		 * 
		 * Just as below, create two CaffeinatedBeverages objects. 
		 * One declared as a beverage. 
		 * One declared as a CaffeinatedBeverage
		 * 
		 * Call all of the methods on each of these objects
		 * NOTE: Try to call your caffeine getters on your "Beverage-declared" objects. It won't work. 
		 * 		Notice that for this object you can only call methods that are part of Beverage; 
		 * 		however, drink() behave as specified in caffeinatedBeverage (by printing out 
		 * 		the amount of caffeine consumed 
		 */
		Beverage aBeverage = new Beverage(8);
		aBeverage.drink(3); //Behaves as specified in Beverage. 
		aBeverage.refil();
		System.out.println(aBeverage.getOuncesRemaining());
		
		Beverage aDifferentBeverage = new Juice(30,8);
		aDifferentBeverage.drink(3); //Because it is constructed using Juice, behaves as specified in Juice()
		aDifferentBeverage.refil();
		System.out.println(aDifferentBeverage.getOuncesRemaining());
		//Can't call the next line because aDifferentBeverage is declared as a Beverage.
		//System.out.println(aDifferentBeverage.getCaloriesConsumed());
		
		Juice aJuice = new Juice(50,12);
		aJuice.drink(5); //Because it is constructed using Juice, behaves as specified in Juice()
		aJuice.refil();
		System.out.println(aJuice.getOuncesRemaining());
		System.out.println(aJuice.getCaloriesConsumed());
		
		Beverage aFakeCBev = new CaffeinatedBeverage(15,.3,7);
		aFakeCBev.drink(3);
		System.out.println(aFakeCBev.getOuncesRemaining());
		
		CaffeinatedBeverage aRealCBev = new CaffeinatedBeverage(16,.5,8);
		aRealCBev.drink(4);
		System.out.println(aRealCBev.getOuncesRemaining());
		System.out.println(aRealCBev.getamountOfCaffeineConsumed());
		System.out.println(aRealCBev.getGramsOfCaffeine());

		
		

	}

}
