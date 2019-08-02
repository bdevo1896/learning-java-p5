package example;


public class ACFaculty extends ACEmployee {
	private String department;

	public ACFaculty(String name, int age, double heightInMeters,
			double weightInKG, GenderEnum gender, SexualPreference sexuality,
			int fingerCount, double salary, String division, String department) {
		super(name, age, heightInMeters, weightInKG, gender, sexuality,
				fingerCount, salary, division);
		
		this.department = department; 

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
