package example;


public class ACStudent extends Person{
	private int IDNumber;
	private double tuition;
	private double GPA;
	private double numberOfCredits;
	
	public ACStudent(String name, int age, double heightInMeters,
			double weightInKG, GenderEnum gender, SexualPreference sexuality,
			int fingerCount, int IDNumber, double tuition, double GPA, double numberOfCredits) {
		
		super(name, age, heightInMeters, weightInKG, gender, sexuality, fingerCount);
		
		this.IDNumber = IDNumber;
		this.tuition = tuition;
		this.GPA = GPA;
		this.numberOfCredits = numberOfCredits;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public double getTuition() {
		return tuition;
	}

	public double getGPA() {
		return GPA;
	}

	public double getNumberOfCredits() {
		return numberOfCredits;
	}
	

}
