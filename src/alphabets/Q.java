package alphabets;
import java.util.Scanner;

	public class Q{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the matrix (n): ");
	        int n = scanner.nextInt();

	        for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if (i==1 && j>1 && j<(3*n)/4 || i==(3*n)/4 && j>1 && j<(3*n)/4 || j==(3*n)/4 && i < ((3*n)/4) || j==1 && i>1 && i<(3*n)/4|| i==j && i>n/2)	        		
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