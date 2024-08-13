package Task_8Aug;

public class Circle {
	
	/*Write a program using a class Circle with variables radius, color. Define
	 * Constructor simple (radius = 1, color = "red") and parameterized constructor.*/
	
	int radius;
	String color;
	
	
	Circle(int c_radius, String c_color){
		
		radius = c_radius;
		color =  c_color;
		
		System.out.println("The radius is " + radius);
		System.out.println("The color is " + color);
		
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle(77, "Greem");
	}

}