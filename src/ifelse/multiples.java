package ifelse;
import java.util.Scanner;
public class multiples {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	if(n % 3 == 0)
	{
		System.out.print("Tap");
	}
	if(n % 5 == 0)
	{
		System.out.print("Acad");
	}
	else
	{
		System.out.println("not a multiple of 3 and 5");
	}
	
}
}
