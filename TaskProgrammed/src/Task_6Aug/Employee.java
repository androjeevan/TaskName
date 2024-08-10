package Task_6Aug;

import java.util.Scanner;

public class Employee {
	
	void employeeInformation() {
		
		System.out.println("Enter the Employee Id: ");
		Scanner scanner = new Scanner(System.in);
		int employeeId = scanner.nextInt();	
		
		System.out.println("Enter the Employee Name: ");
		Scanner scannername = new Scanner(System.in);
		String employeeName = scannername.nextLine();
		
		System.out.println("Employee ID: " + employeeId);
		
        System.out.println("Employee Name: " + employeeName);
        
	}
}
