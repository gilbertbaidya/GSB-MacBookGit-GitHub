package inheritenceOne;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		
		t1.name = "Rashu Begum";
		t1.age  = 50;
		t1.qualification = "MSc in Geography";
		t1.income = 120000;
		
		
		t1.displayInformation2();
		
		System.out.println("++++++++++++++++");
		
		Teacher t2 = new Teacher();
		
		t2.name = "Modon Kumar";
		t2.age  = 80;
		t2.qualification = "SSC Fail";
		t2.income = 35000;
		
		
		t2.displayInformation2();
		
		System.out.println("++++++++++++++++");
		
//		Teacher t3 = new Teacher();
//		
//		t3.name = "Raj Kumari";
//		t3.age  = 23;
//		t3.qualification = "MBA";
//		t3.income = 46000;
//		
//		t3.displayInformation3();
	}

}
