package ooP_parameterize_Constractor;

public class Teacher_Constructor_OOP {

	String name, gender, maritalStatus;
	int age, salary;
	
	Teacher_Constructor_OOP (String n, String g, int sl, int a, String m){ //constructor name same as class
		
		name = n;
		gender = g;
		maritalStatus = m;
		age=a;
		salary = sl;
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

