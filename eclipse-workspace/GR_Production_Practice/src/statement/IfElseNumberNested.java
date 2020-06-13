package statement;

public class IfElseNumberNested {

	public static void main (String [] args) {
		
		Double n1 = 1.0;
		Double n2 = 4.5;
		Double n3 = 5.3;
		Double n4 = 8.1, largestNumber;
		
		if (n1 >= n2) {
			
			if (n1 >= n3) {
				largestNumber = n1;
							
			}
			
			else {
				
				largestNumber = n3;
				
			}
			
			
		}
		
		else {
			
			if (n2>=n3) {
				
				largestNumber = n2;
				
			}
			
			else {
				
				largestNumber = n3;
			}
			
		}
		
		System.out.println("The largest number is "+ largestNumber);
		
				
		
	}
	
}
