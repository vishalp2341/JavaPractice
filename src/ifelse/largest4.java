package ifelse;
import java.util.Scanner;
public class largest4 {
public static void main(String[] args) {
	Scanner scan = new Scanner ( System.in);
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	int n3 = scan.nextInt();
	int n4 = scan.nextInt();
	int largest = n1;
	if(n2 > largest) 
	{
		largest = n2;
	}
	if(n3 > largest)
	{
		largest = n3 ;
	}
	if( n4 > largest)
	{
		largest = n4;
	}
	System.out.println(largest);
}
}
