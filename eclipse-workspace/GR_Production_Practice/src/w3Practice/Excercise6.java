package w3Practice;

import java.util.*;

//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

public class Excercise6 {

	public static void main(String[] args) {
		Scanner number = new Scanner (System.in);
		
		System.out.print("Input First Number: ");
		int x = number.nextInt();
		
		
		
		System.out.print("Input Last Number: ");
		int y = number.nextInt();
		
		int sum = x+y;
		int min = x-y;
		int mul = x*y;
		int div = x/y;
		int mod = x%y;
		
		System.out.println(x +" + "+y +"= " + sum);
		System.out.println(x +" - "+y +"= " + min);
		System.out.println(x +" * "+y +"= " + mul);
		System.out.println(x +" / "+y +"= " + div);
		System.out.println(x +" mod "+y +"= " + mod);
		
	}

}
