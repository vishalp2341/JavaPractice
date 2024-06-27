package statickeyword;

//static block is executed before the main method

public class StaticDemo1 {
	static {
		System.out.println("this is the static block");

	}

	public static void main(String[] args) {
		System.out.println("this is the main method");

	}

}
