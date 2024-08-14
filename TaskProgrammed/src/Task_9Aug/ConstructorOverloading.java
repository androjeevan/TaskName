package Task_9Aug;

public class ConstructorOverloading {
	public static void main(String[] args) {
		 
	      Circle obj1 = new Circle();
	      obj1.display();
	      
	      Circle obj2 = new Circle(2,"blue");
	      obj2.display();
			
	}

}

class Circle{
	
	private int radius;
	private String color;
	
	Circle(){
		radius = 1;
		color = "red";
	}
	
	Circle(int radius , String color){
		this.radius = radius;
		this.color = color;
	}
	
	void display() {
		
		System.out.println("Circle radius : " + this.radius
				           +"\nCircle color : " + this.color);
		
	}
	
}
