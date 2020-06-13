package GR_Opps_Method_Learning;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher_Class teacher1 = new Teacher_Class();
		
				teacher1.name = "Mokter Hossain";
				teacher1.gender = "Male";
				teacher1.age = 75;
				teacher1.salary = 85000;
				teacher1.maritalStatus = "Unmarried";
				teacher1.displayinfo();
				
				Teacher_Class teacher2 = new Teacher_Class();
				
				teacher2.name = "Manju Baroi";
				teacher2.gender = "Female";
				teacher2.age = 65;
				teacher2.salary = 75000;
				teacher2.maritalStatus = "Married";
				teacher2.displayinfo();
		
	}

}
