package patterns;

import java.util.Scanner;

public class sqaaaaaaaare {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++) 
			{
				if(i==1 || i==n || j==1 || j==n) 
					{
						System.out.print("*"+" ");
					}
					else	
					{

					System.out.print("  ");
				}
		}
		System.out.println();
	   }
}
}