package Task_13Aug;

import java.util.Scanner;

public class AirthmeticOperation {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter operation (+, -, *, /): ");
	        char operation = scanner.next().charAt(0);

	        switch (operation) {
	            case '+':
	                System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
	                break;
	            case '-':
	                System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
	                break;
	            case '*':
	                System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
	                break;
	            case '/':
	                if (num2 != 0) {
	                    System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation.");
	                break;
	        }

	        scanner.close();
	    }
}
