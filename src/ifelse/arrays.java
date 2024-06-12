package ifelse;
import java.util.Scanner;

	public class arrays {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        printPrimeNumbers(n);
	    }

	    public static void printPrimeNumbers(int n) {
	        // 0 and 1 are not prime numbers
	        if (n >= 2) {
	            System.out.print(2 + " ");
	        }

	        // Start from 3 and check odd numbers
	        for (int i = 3; i <= n; i += 2) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        System.out.println();
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }

	        // Check divisibility from 2 to square root of num
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}
