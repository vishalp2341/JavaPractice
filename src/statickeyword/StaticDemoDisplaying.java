package statickeyword;

//A demo of the execution order of static variables, static method, static block,
// instance variables, instance block and instance method.

class Launch
{
	static int x , y;
	
	static void fun1()
	{
		System.out.println("static method");
	}
	
	static
	{
		System.out.println("static block");
	}
	
	
	int a , b;
	
	{
		System.out.println("instance block");
	}
	
	void fun2()
	{
		System.out.println("instance method");
	}
	
	
	Launch()
	{
		System.out.println("Constructor");
		a=10 ;
		b=20;
	}
}

public class StaticDemoDisplaying {

	public static void main(String[] args) {
		
		Launch.fun1();
		
		Launch l = new Launch();
		l.fun2();

	}

}
