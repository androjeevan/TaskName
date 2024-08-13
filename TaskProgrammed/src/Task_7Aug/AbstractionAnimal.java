package Task_7Aug;

/*Write a Java Program to create an abstract class Animal with an abstract method
 * called sound(). Create subclass Lion and Tiger that extend the Animal Class
 * and implement the sound() method  to make a speech sound for each animal.*/

abstract class Animal //Abstract class
{
	abstract void sound();//Abstract method
}

class Lion extends Animal
{
	void sound()//method overriding
	{
		System.out.println("The lion Roars");
	}
}
class Tiger extends Animal
{
	void sound()//method overriding
	{
		System.out.println("The tiger Groans");
	}
}

public class AbstractionAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Tiger(); //
		animal.sound(); 
		Animal animal2 = new Lion();
		animal2.sound();
	}

}
