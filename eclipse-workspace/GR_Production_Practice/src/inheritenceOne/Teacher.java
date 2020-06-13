package inheritenceOne;

public class Teacher extends Person {
	//name, age, displayInformation
	
	String qualification;
	int income;
	
	
	void displayInformation2 () {
		
		displayInformation1();
		System.out.println("Qualification : "+qualification);
		System.out.println("Income : "+income);
	}


	
}
