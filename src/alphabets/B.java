package alphabets;
import java.util.Scanner;
public class B {
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();
	        
	        // Pattern B
	        for (int i = 1; i <=n; i++) 
	        {
	            for (int j = 1; j <= n; j++) 
	            {
	            	if (j==1 || i==n && j<n || j==n && i>n/2 && i<n 
	                		||i==n/2 && j<n || i==1 && j< (3*n)/4
	                		|| j==(3*n)/4 && (i>1 && i<n/2)) 
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
