package Constructor;

class Example {
	private int value;
	private String name;

	Example() {
		this.value = 0;
		this.name = "Default";
		System.out.println("No-argument constructor called");
	}

	Example(int value) {
		this.value = value;
		this.name = "Default";
		System.out.println("Single-argument constructor called");
	}

	Example(int value, String name) {
		this.value = value;
		this.name = name;
		System.out.println("Two-argument constructor called");
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
}

public class constructorOverloading {
	public static void main(String[] args) {
		Example obj1 = new Example(); // No-argument constructor called
		Example obj2 = new Example(10); // Single-argument constructor called
		Example obj3 = new Example(10, "Example"); // Two-argument constructor called
		System.out.println();
		System.out.println(obj1.getName());
		System.out.println(obj1.getValue());
		System.out.println();
		System.out.println(obj2.getName());
		System.out.println(obj2.getValue());
		System.out.println();
		System.out.println(obj3.getName());
		System.out.println(obj3.getValue());
		
	}
}
