package statickeyword;
// single copy of the variable r is created and  given to all objects in
//class using static variable and staic block
import java.util.Scanner;

class Launcher {
	float p;
	float t;
	static float r;
	float si;
	
	static
	{
		r = 15.2f;
	}

	public void acceptIP()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter principal amount :");
		p = scan.nextInt();
		System.out.println("enter tenure :");
		t = scan.nextInt();
		
	}

	void calculate() {
		 si = (p * t * r) / 100;
	}

	void display() {
		System.out.println("si is " +si );
	}
}

public class Loan {

	public static void main(String[] args) {
		Launcher l1 = new Launcher();
		l1.acceptIP();
		l1.calculate();
		l1.display();
		
		
		Launcher l2 = new Launcher();
		l2.acceptIP();
		l2.calculate();
		l2.display();
			
		Launcher l3 = new Launcher();
		l3.acceptIP();
		l3.calculate();
		l3.display();
		
	}

}
