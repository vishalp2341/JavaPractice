package arrays;
import java.util.Scanner;
public class jagged2Darray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] a = new int [2][];
		a[0]= new int [3];
		a[1]= new int [5];
		for(int i = 0; i<=a.length-1;i++)
		{
			for(int j = 0; j<=a[i].length-1;j++)
			{
		
				System.out.println("enter the age of classroom " +(i+1)+ " student " +(j+1));
				a[i][j]=scan.nextInt();
		}
	}
		for(int i = 0; i<=a.length-1;i++)
		{
			for(int j = 0; j<=a[i].length-1;j++)
			{
		
				System.out.print(a[i][j]+" ");
		}
			System.out.println();
	}

	}
		
}
