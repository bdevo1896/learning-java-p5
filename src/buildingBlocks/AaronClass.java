package buildingBlocks;


public class AaronClass implements BuildingBlocksInterface {
	private int myMemberVariable;
	
	public AaronClass(int myMemberVariable){
		this.myMemberVariable = myMemberVariable;
	}
	
	@Override
	public void printAMessage(String message) {
		System.out.println("This is the message that Aaron prints");
		System.out.println(message);

	}

	@Override
	public int performMath(int a, int b) {
		int math = a + b + myMemberVariable;
		return math;
	}

}
