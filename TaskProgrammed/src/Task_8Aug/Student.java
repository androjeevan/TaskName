package Task_8Aug;

public class Student {

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
