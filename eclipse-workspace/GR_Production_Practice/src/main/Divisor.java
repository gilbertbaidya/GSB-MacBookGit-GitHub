package main;

public class Divisor {

	public static void main(String[] args) {
	divisors(60);
	}
	
	static void divisors(int num) {
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				
				System.out.println(i);
			}
			
		}
		
	}

}
