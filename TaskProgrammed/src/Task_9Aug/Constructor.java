package Task_9Aug;

public class Constructor {

	private String name;
	private int rollNumber;
	private double marks;
	
	Constructor(String name, int rollNumber, double marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	void display()
	{
		
		System.out.println("Student name is : " + this.name
				           +"\nStudent rollNumber is : " + this.rollNumber
         		           +"\nStudent mark is  : "+this.marks);
	}
	

	public static void main(String[] args) {
		Constructor c = new Constructor("Jeevan", 23, 23.2);
		c.display();
	}
	
	
}
