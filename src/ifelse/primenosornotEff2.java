package ifelse;
import java.util.Scanner;
public class primenosornotEff2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String res = CheckPrime(n);
		System.out.println(res);
	}

	static String CheckPrime(int n)
	{
		for(int i=2; i<n/2; i++)
		{
			if(n%i==0)
			{
				return "Not prime";
			}
		}
		return "Prime";
	}
}
