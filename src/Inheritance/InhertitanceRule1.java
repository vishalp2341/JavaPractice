package Inheritance;

//Rule 1: private members do not participate in inhertiance. 
//Change the commented private keyword to be visible to see the error. 


 class acc{
	/*private*/ int a = 10;
}
 
 class acc1 extends acc{
	 
 }


public class InhertitanceRule1 {

	public static void main(String[] args) {
		acc1 a1 = new acc1();
		System.out.println(a1.a);

	}

}
