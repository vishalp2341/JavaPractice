package alphabets;

import java.util.Scanner;

public class W {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i<=n ; i++) 
	        {
        	
        	for (int j = 1; j<=n ; j++) 
        	{
        		if (j==1 || j==n || i==j && i>n/2||
        				i+j==n+1 && i > n/2)
        			
        			{
        			    System.out.print("*");
        			}
        		else
        		{
        			    System.out.print(" ");
        			}
        			
        	}
        	System.out.println();
        	}
        
        	
        }

}
