package Task_12Aug;


public class Student {

	//this instance variable is visible for any child class
	public String name;
	
	public Student(String name,int age) //constructor with two parameters
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
    public Student(String gender,int roll_no,double marks) //constructor overloading with three parameters
    {
    	System.out.println("Name:"+gender);
    	System.out.println("Register number:"+roll_no);
    	System.out.println("Marks:"+marks);
	}
    public Student(String address) //constructor overloading with single parameter
    {
    	System.out.println("Address:"+address);
	} 
	

	public static void main(String[] args) {
		//calling all the constructor method by creating different objects by passing the respective parameters
		Student S1=new Student("Jeevan Jothivel",23);
		Student S2=new Student("Male",30,90.3);
		Student S3=new Student("Salem");
	}
	
	
	
}

