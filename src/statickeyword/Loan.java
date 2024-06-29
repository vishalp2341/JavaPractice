package statickeyword;

import java.util.Scanner;

class Launcher {
	int p, t;
	float r = 15.2f;

	public void acceptIP()

	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter p");
		p = scan.nextInt();
		System.out.println("enter t");
		t = scan.nextInt();
		System.out.println("r is 15.201");
	}

	void calculate() {
		float si = (p * t * r) / 100;
		display(si);
	}

	void display(float si) {
		System.out.println("si is " +si );
	}
}

public class Loan {

	public static void main(String[] args) {
		Launcher l1 = new Launcher();
		l1.acceptIP();
		l1.calculate();
		
		
		Launcher l2 = new Launcher();
		l2.acceptIP();
		l2.calculate();
			
		Launcher l3 = new Launcher();
		l3.acceptIP();
		l3.calculate();
		
	}

}
