package Task_6Aug;

public class AirthmeticMethod {
	
	/* Write a program to create 3 methods add, sub, multiplication and
	 *  display it by using the object*/

	int a = 703;
	int b = 205;
	int c;
	
	void addition() {
		c = a + b;
		System.out.println("The addition of two numbers :" + c);
	}
	void substraction() {
		c = a - b;
		System.out.println("The addition of two numbers :" + c);
	}
	void multiplication() {
		c = a * b;
		System.out.println("The addition of two numbers :" + c);
	}
	
	public static void main(String[] args) {
		AirthmeticMethod airthmetic = new AirthmeticMethod();
		airthmetic.addition();
		airthmetic.substraction();
		airthmetic.multiplication();
	}

}
