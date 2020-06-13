package ParameterizeMethod;

public class Parameter_mainClass {

	public static void main(String[] args) {
		
		Teacher_Parameter_Class teacher1 = new Teacher_Parameter_Class();
				
		teacher1.setInfo("Mokter Hossain", "Male", 75, 85000, "Unmarried");
		teacher1.displayinfo();
		//
		
		Teacher_Parameter_Class teacher2 = new Teacher_Parameter_Class();
		
		teacher2.setInfo("Manju Baroi", "Female", 65, 55000, "Married");
		teacher2.displayinfo();
		//
		
		Teacher_Parameter_Class teacher3 = new Teacher_Parameter_Class();
		
		teacher3.setInfo("Jebunnesa Begum", "Female", 85, 755000, "Married");
		teacher3.displayinfo();
	
}

}
