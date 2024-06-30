package Inheritance;

//Multilevel inheritance is permitted in java
//the test5 class contains the add sub mul div methods by using inheritance 
class test1 {
	void add() {
		System.out.println(10 + 20);
	}
}

class test2 extends test1 {
	void sub() {
		System.out.println(20 - 10);
	}
}

class test3 extends test2 {
	void mul() {
		System.out.println(20 * 10);
	}
}

class test4 extends test3 {
	void div() {
		System.out.println(20 / 10);
	}
}

class test5 extends test4 {

}

public class InheritanceRule2 {

	public static void main(String[] args) {
		test5 t = new test5();
		t.add();
		t.sub();
		t.mul();
		t.div();
	}

}
