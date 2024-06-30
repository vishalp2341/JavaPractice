package Inheritance;

//demo of inherited, specialised and overriden methods

class Bird
{
	void eat()
	{
		System.out.println("Bird is eating");
	}
	void fly() 
	{
		System.out.println("Bird is flying");
	}
}


class Eagle extends Bird
{

	void fly() //specialised method
	{
		System.out.println("eagle is flying");
	}
}

class Sparrow extends Bird
{
void eat() //specialised method
	{
		System.out.println("sparrow is eating small grains");
	}
	
}

class GoldenEagle extends Eagle
{
	void eat() //specialised method
	{
		System.out.println("golden eagle is eating");
	}
	
	void fly() //specialised method
	{
		System.out.println("golden eagle is flying");
	}
}

class SerpentEagle extends Eagle
{
	void eat() //specialised method
	{
		System.out.println("Serpent eagle is eating");
	}
	
	void fly()//specialised method
	{
		System.out.println("Serpent eagle is flying");
	}
}


public class BirdExmp {

	public static void main(String[] args) {
		SerpentEagle se = new SerpentEagle();
		GoldenEagle ge = new GoldenEagle();
		Sparrow s = new Sparrow();
		
		s.eat();
		s.fly();
		
		System.out.println();
		
		ge.eat();
		ge.fly();
		
		System.out.println();
		
		se.eat();
		se.fly();
		
		

	}

}
