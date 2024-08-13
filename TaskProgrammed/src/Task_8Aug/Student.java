package Task_8Aug;

public class Student {
	
	/*Create a class with the name student containing three instance variables in it and 
	 * they are name, rollnumber and marks. These three variables are string, int and double
	 * data types respectively. Create a parameterized constructor that will take the values 
	 * from the user  and will initialize the object's variable with those values at the
	 * time of object creation with the help of arguments in the parameters.*/

	 String name;
	 int rollnumber;
	 double marks;

	// Parameterized Constructor
	 
	 Student(String s_name,int s_rollnumber, double s_marks){
		 name = s_name;
		 rollnumber = s_rollnumber;
		 marks = s_marks;
		 
		 System.out.println("Student Name: " + name);
		 System.out.println("Student Rollnumber: " + rollnumber);
		 System.out.println("Student Marks: " + marks);
	 }
	

	 public static void main(String[] args) {
	
		 Student obj = new Student("Jeevan Jothivel", 23, 88);

	 }

}
