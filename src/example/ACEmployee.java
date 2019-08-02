package example;


public class ACEmployee extends Person {

	private double salary;
	private String division;
	
	public ACEmployee(String name, int age, double heightInMeters,
			double weightInKG, GenderEnum gender, SexualPreference sexuality,
			int fingerCount, double salary, String division) {
		super(name, age, heightInMeters, weightInKG, gender, sexuality,
				fingerCount);
		this.salary = salary;
		this.division = division;
		
	}

	public double getSalary() {
		return salary;
	}

	public String getDivision() {
		return division;
	}
	


}
