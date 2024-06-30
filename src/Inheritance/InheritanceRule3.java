package Inheritance;
//Multiple inheritance is not allowed in java
//one class cannot extend from 2 parent classes as it creates ambiguity


class test{
	int a =10;
}


class tst1 extends test{
	int x=10;
	
}

class tst2 extends test{
	int x = 100;
}


//class tst3 extends tst1,tst2{
//	what can x be? 10 or 100? this creates ambiguity
//}
public class InheritanceRule3 {

	public static void main(String[] args) {
		

	}

}
