package statement;

import java.util.Scanner;

public class Grading {

public static void main(String[] args) {
	
		Scanner rashu = new Scanner (System.in);
		System.out.println("Grade");
		
		int rose = rashu.nextInt();
		
		if (rose >=90 && rose <=100) {
			System.out.println("A");
		}
		
		else if (rose >=80 && rose <=90) {
			
			System.out.println("B");
	}
	
	else if (rose >=70 && rose <=80) {
			
			System.out.println("C");
	}
	else if (rose >=60 && rose <=70) {
		
		System.out.println("D");
}
	else if (rose >=0 && rose <=60) {
		
		System.out.println("Dabba");
}
		
	else {
		System.out.println("Number not in use Bekkol");
	}
		

	
}	
	
	
}
