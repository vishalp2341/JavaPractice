package alphabets;
import java.util.Scanner;

	public class K{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the matrix (n): ");
	        int n = scanner.nextInt();

	        for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = n/2; j<=n ; j++) 
	        	{
	        		if(j==n/2|| i+j==n+1 || i==j)
	        			
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