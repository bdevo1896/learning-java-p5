package buildingBlocks;

public class BryceClass implements BuildingBlocksInterface {
	
	private String myName;
	private int age;
	
	public BryceClass(String myName, int age) {
		this.myName = myName;
		this.age = age;
	}

	@Override
	public void printAMessage(String message) {
		System.out.println("I'm a compyuta!");
		
	}

	@Override
	public int performMath(int a, int b) {
		return a*b;
	}

}
