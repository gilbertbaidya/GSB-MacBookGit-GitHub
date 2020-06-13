package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program Start: ");
		sayHi();
		
		int addition = getSum(100, 50);
		int sub = getSum(100, 50);
		int mul = getSum(100, 50);
		int div = getSum(100, 50);
		System.out.println("Result: " +addition + sub + mul);
		
	
	}
		static int getSum(int x, int y) {
			int sum =  x + y;
			int sub =  x - y;
			int mul =  x * y;
			int div =  x / y;

			return sub;
			
			
		} 
		static void sayHi() {
			System.out.println("HI");
		}
		
}
