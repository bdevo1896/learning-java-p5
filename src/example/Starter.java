package example;


public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person aaron =  new Person ("aaron", 45, 1.9,35, GenderEnum.male, SexualPreference.female );
		//ACStudent stefan = new ACStudent("Stefan Merrill Block", 32, 2, 37, GenderEnum.male, SexualPreference.female, 10, 1138,
				//25, 3.9, 30.0);
		ACFaculty stefan = new ACFaculty("Stefan Merrill Block", 32, 2, 37, GenderEnum.male, SexualPreference.female, 10, 40, 
				"Academic", "Engilish");
		
		System.out.println(stefan.getName());
		System.out.println(stefan.getBMI());
		//System.out.println(stefan.getGPA());
		System.out.println(stefan.getSalary());
		System.out.println(stefan.getDepartment());
		
		
	}

}
