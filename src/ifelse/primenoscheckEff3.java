package ifelse;
import java.util.Scanner;
public class primenoscheckEff3 {
	public static void main(String[] args) {
		int count =0;
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	

}
