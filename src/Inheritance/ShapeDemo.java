package Inheritance;
//demo of inherited, specialised and overriden methods
import java.util.Scanner;

class shape
{   Scanner sc = new Scanner(System.in); 
	float area;
	
	void input()
	{
		System.out.println("input:");
	}
	
	void calculateArea()
	{
		System.out.println("calculate the area:");
	}
	
	void display()
	{
		System.out.println("area is "+area);
	}
	
	
}

class square extends shape
{
	int side;
	
	void input()
	{
		System.out.println("enter the side of the square");
		side = sc.nextInt();
	}
	
	void calculateArea()
	{
		area = side*side;
	}
}

class rectangle extends shape
{
	int length;
	int breadth;
	void input()
	{
		System.out.println("enter the length and breadth of the rectangle");
		length = sc.nextInt();
		breadth = sc.nextInt();
		
	}
	
	void calculateArea()
	{
		area = length*breadth;
	}
}

class circle extends shape
{
	float pi = 3.142f;
	float radius;
	
	void input()
	{
		System.out.println("enter the radius of the circle");
		radius = sc.nextFloat();
	}
	
	void calculateArea()
	{
		area = pi*radius*radius;
	}
}



public class ShapeDemo {
	public static void main(String[] args) {
		
		circle c  = new circle();
		square s = new square();
		rectangle r = new rectangle();
		
		s.input();
		s.calculateArea();
		s.display();
		System.out.println("======================================================");
		r.input();
		r.calculateArea();
		r.display();
		System.out.println("======================================================");
		c.input();
		c.calculateArea();
		c.display();
		System.out.println("======================================================");
		
		
	}

}
