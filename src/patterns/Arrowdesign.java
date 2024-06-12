package patterns;

public class Arrowdesign {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) 
		{   //upper triangle
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			
			//square space
			for (int j = 1; j <= 5; j++) 
			{
				System.out.print(" ");
			}
			
			// upper triangle
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			
			//square space
			for (int j = 1; j <= 5; j++) 
			{
				System.out.print(" ");
			}
			
			// upper triangle
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		

		for (int i = 1; i <= 5; i++) 
		{
			//lower triangle
			for (int j = 1; j <= 5 - i + 1; j++) 
			{
				System.out.print("*");
			}
			
            //square space
			for (int j = 1; j <= 5; j++) 
			{
				System.out.print(" ");
			}
			
			//lower triangle
			for (int j = 1; j <= 5 - i + 1; j++) 
			{
				System.out.print("*");
			}
			
			//square space
			for (int j = 1; j <= 5; j++) 
			{
				System.out.print(" ");
			}
			
			//lower triangle
			for (int j = 1; j <= 5 - i + 1; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		
		}

	}
}
