package w3Practice;

import java.util.Scanner;

//5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
public class Excercise5 {

	public static void main(String[] args) {
		
		Scanner numbe = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		
		int x = numbe.nextInt();
		
		System.out.print("Input last number: ");
		
		int y = numbe.nextInt();
		
		System.out.println(x +" X " + y + "= "+ x*y);
		
		
		
		
		
	}

}
