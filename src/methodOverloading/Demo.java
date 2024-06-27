package methodOverloading;

//this is a demonstration of method overloading in which 2 or more methods
//have the same method name but different :
//1. number of parameters
//	or
//2.order of parameters
//	or
//3.different data type of parameters
//return type of the method has no effect on method overloading .

class Add {

	void add(int a, int b) {
		System.out.println("integer and integer sum is " + (a + b));
	}

	void add(float a, int b) {
		System.out.println("float and integer sum is " + (a + b));
	}
	
	void add(float a, float b) {
		System.out.println("float and float sum is " + (a + b));
	}
}

public class Demo {

	public static void main(String[] args) {
		int a = 10, b = 20;
		float c = 10.0f, d = 20.f;
		Add aa = new Add();
		aa.add(a, b);
		aa.add(a, c);
		aa.add(c, d);
	}

}
