package Inheritance;

//Multilevel inheritance is permitted in java
//the test5 class contains the add sub mul div methods by using inheritance 
class tesst1 {
	void add() {
		System.out.println(10 + 20);
	}
}

class tesst2 extends tesst1 {
	void sub() {
		System.out.println(20 - 10);
	}
}

class tesst3 extends tesst2 {
	void mul() {
		System.out.println(20 * 10);
	}
}

class tesst4 extends tesst3 {
	void div() {
		System.out.println(20 / 10);
	}
}

class tesst5 extends tesst4 {

}

public class InheritanceRule2 {

	public static void main(String[] args) {
		tesst5 t = new tesst5();
		t.add();
		t.sub();
		t.mul();
		t.div();
	}

}
