package ParameterizeMethod;

public class Teacher_Parameter_Class {

	String name, gender, maritalStatus;
	int age, salary;
	
	void setInfo (String n, String g, int a, int sl, String m) {
		
		name 			= n;
		gender 			= g;
		maritalStatus	= m;
		age 			= a;
		salary 			= sl;
		
	}
	
	void displayinfo () {
		
		System.out.println("My Favorite Teacher's Info");
		System.out.println("Name :" + name);		
		System.out.println("Gender :"+gender);
		System.out.println("Marital Status :"+ maritalStatus);
		System.out.println("Age :" + age);
		System.out.println("Salary :"+salary);
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
	}

	

	

}
