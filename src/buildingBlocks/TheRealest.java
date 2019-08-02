package buildingBlocks;

public class TheRealest implements TheDevaughnComplex {
	
	private int bossLevel;
	
	public TheRealest(int bossLevel) {
		this.bossLevel = bossLevel;
	}

	@Override
	public void trollMessage() {
		System.out.println("This is for scrubs haha");
		
	}

	@Override
	public int theAgeOfYourMom(int whatYouThink) {
		return whatYouThink*whatYouThink*whatYouThink;
	}

	@Override
	public String trickery() {
		return "HAHAHAHAHAHAHAHAHAHAHAHA!";
	}

}
