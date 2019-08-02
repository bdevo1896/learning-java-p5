package example;


public class Person {
	private String name;
	private int age;
	private double heightInMeters;
	private double weightInKG;
	private GenderEnum gender;
	private SexualPreference sexuality;
	private int fingerCount;
/*	
	public Person(String name, int age, double heightInMeters, double weightInKG, GenderEnum gender, SexualPreference sexuality, int figerCount ){
		this.name = name;
		this.age = age;
		
	}*/
	public Person(String name, int age, double heightInMeters,
			double weightInKG, GenderEnum gender, SexualPreference sexuality,
			int fingerCount) {
		this.name = name;
		this.age = age;
		this.heightInMeters = heightInMeters;
		this.weightInKG = weightInKG;
		this.gender = gender;
		this.sexuality = sexuality;
		this.fingerCount = fingerCount;
	}
	
	public Person(String name, int age, double heightInMeters,
			double weightInKG, GenderEnum gender, SexualPreference sexuality) {
		this.name = name;
		this.age = age;
		this.heightInMeters = heightInMeters;
		this.weightInKG = weightInKG;
		this.gender = gender;
		this.sexuality = sexuality;
		this.fingerCount = 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeightInKG() {
		return weightInKG;
	}

	public void setWeightInKG(double weightInKG) {
		this.weightInKG = weightInKG;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public SexualPreference getSexuality() {
		return sexuality;
	}

	public void setSexuality(SexualPreference sexuality) {
		this.sexuality = sexuality;
	}

	public int getFingerCount() {
		return fingerCount;
	}

	public void setFingerCount(int fingerCount) {
		this.fingerCount = fingerCount;
	}

	public double getHeightInMeters() {
		return heightInMeters;
	}
	
	
	public double getBMI(){
		return this.weightInKG/(this.heightInMeters*this.heightInMeters);
	}
	
}
