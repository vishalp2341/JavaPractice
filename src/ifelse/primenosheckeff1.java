package ifelse;
import java.util.Scanner;
public class primenosheckeff1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n= scan.nextInt();
		String res= checkPrime(n);
		System.out.println(res);
		
	}
	
	static String checkPrime(int n)
	{
		for(int i =2; i*i <=n ; i++)
		{
			if(n%i==0)
			{
				return "not Prime";
			}
		}
	return "prime";
	}
	}
