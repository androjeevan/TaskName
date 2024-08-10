package Task_6Aug;

import java.util.Scanner;

public class AddMethodStatic {
	
	/* Add 2 numbers using static method and print the same */

	static void addNumbers() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = scanner.nextInt();
		
		System.out.println("Enter the Second number:");
		int b = scanner.nextInt();
		
		int c = a + b;
		
		System.out.println("The sum of two numbers is:"+c);
		
	}

	public static void main(String[] args) {
		addNumbers();
	}
}
