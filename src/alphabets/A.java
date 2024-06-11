package alphabets;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Printing pattern A
        for (int i = 1; i <=n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if (j==1 && i> n/2 || j==n &&  i>n/2 || i+j==(n/2)+1|| j-i==(n/2)||i==n/2) 
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
