package string;
import java.util.Scanner;
public class StringPatternConvertor {
	public static void main(String[] args) {
		System.out.println("Enter Your Text :");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		name=name.toUpperCase();

		int n = 10;
		
		for(int k=0; k<name.length();k++)
		{
			char ch = name.charAt(k);
			
			//printing the pattern for alphabet A
			if(ch=='A')
			{
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
				 
			//printing the pattern for alphabet B
			if(ch=='B')
			{
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
			
			
			//printing the pattern for alphabet C
			if(ch=='C')
			{
				 for (int i = 1; i<=n ; i++) 
		 	        {
			        	
			        	for (int j = 1; j<=n ; j++) 
			        	{
			        		if(i==1 && j>1 || j==1 && i>1 && i<n || i==n && j>1 ) 
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
			
			//printing the pattern for alphabet D
			if(ch=='D')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if((j == 1) || (j == n && (i != 1 && i != n)) || (i == 1 || i == n) && j < n) 
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
			
			
			//printing the pattern for alphabet E
			if(ch=='E')
			{
				  for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if (i == 1 || i == n || i == (n + 1) / 2 || j == 1)
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
			
			
			//printing the pattern for alphabet F
			if(ch == 'F')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if(i == 1 || j == 1 || i == (n + 1) / 2) 
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
			
			
			//printing the pattern for alphabet G
			if(ch == 'G')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if(i==1 && j>1|| j==1 && i>1 && i<n || i==n && j>1|| j==n && i>(n/2)|| i==n/2 && j>n/2 )
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
			
			
			//printing the pattern for alphabet H
			if(ch=='H')
			{
				 for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if (j == 1 || j == n || i ==n/2)
		        			
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
			
			
			//printing the pattern for alphabet I
			if(ch=='I')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if(i == 1 || j==n/2 || i == n  )
	        			
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
			
			
			//printing the pattern for alphabet J
			if(ch=='J')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if(i == 1 || j==n/2 ||j==1 && i>(n/2)||
	        				i == n  && j<n/2 )
	        			
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
			
			
			//printing the pattern for alphabet K
			if(ch=='K')
			{
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
			
			
			//printing the pattern for alphabet L
			
			if(ch =='L')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if (j==1|| i==n)
	        			
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
			
			
			//printing the pattern for alphabet M
			if(ch == 'M')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if (j == 1 || j == n || i == j && i <= n / 2 || i + j == n + 1 && i <= n / 2 || i == (n + 1)/2 && j==(n+1)/2)
	        			
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
			
			
			
			//printing the pattern for alphabet N
			if(ch == 'N')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if ((j == 1 || j == n || i == j))
	        			
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
			
			//printing the pattern for alphabet O
			if(ch=='O')
				
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if (i==1 && j<n && j >1 || j==1 && i>1 && i<n || j==n && i>1 && i<n|| i==n && j>1 && j<n )
	        			
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
			
			//printing the pattern for alphabet P
			
			if(ch=='P')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if ( i == 1 && j < n || j==1 || i == n / 2  && j < n 
	        				|| (j == n && i>1 && i<n/2))
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
			
			
			//printing the pattern for alphabet Q
			if(ch=='Q')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if (i==1 && j>1 && j<(3*n)/4 ||  j==1 && i>1 && i<(3*n)/4
	        				|| j==((3*n)/4) && i < ((3*n)/4) && i>1 
	        				||i==(3*n)/4 && j>1 && j<(3*n)/4 ||  i==j && i>=n/2)	        		
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
			
			
			//printing the pattern for alphabet R
			if(ch=='R')
			{
				 for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if ( i == 1 && j < n || j==1 || i == n / 2  && j < n 
		        				|| (j == n && i>1 && i<n/2)||i==j && i>n/2)
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
			
			
			//printing the pattern for alphabet S
			if(ch=='S') 
			{
				 for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if (i==1||j==1&& i<=n/2|| i==n/2||j==n && i>=n/2 || i==n)
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
			
			
			//printing the pattern for alphabet T
			if(ch=='T')
			{
				   for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if (i==1|| j==n/2)
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
			
			
			//printing the pattern for alphabet U
			if(ch=='U')
			{
				 for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if (j==1 && i<n || i==n && j>1 && j <n || j==n && i <n  )
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
			
			//printing the pattern for alphabet V
			if(ch=='V')
			{
				for (int i = 1; i<=n ; i++) 
		        {
	        	
	        	for (int j = 1; j<=n ; j++) 
	        	{
	        		if (j == 1 && i<= (n/2)||j == n && i<=(n/2)
	        				|| i-j == n/2 || i+j==((3*n)/2)+1)
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
			
			
			
			//printing the pattern for alphabet W
			if(ch=='W')
			{
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
			
			
			//printing the pattern for alphabet X
			
			if(ch=='X')
			{
				 for (int i = 1; i<=n ; i++) 
			        {
		        	
		        	for (int j = 1; j<=n ; j++) 
		        	{
		        		if (i==j || i+j==n+1)
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
			
			
			//printing the pattern for alphabet Y
			if(ch=='Y')
			{
				for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                
		                if ((i == j && i<=n/2 || i+j==n+1))
		                		{
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
			}
			
			
			//printing the pattern for alphabet Z
			if(ch=='Z')
			{
				for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                
		                if (i==1 || i+j==n+1 || i==n) 
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
			
			// Pattern for 0
			if (ch == '0') {
                for (int i = 1; i <= n; i++) 
                {
                    for (int j = 1; j <= n; j++) 
                    {
                        if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
			
			// Pattern for 1
			if (ch == '1')
			{
				 for (int i = 1; i <= n; i++)
				 {
			            for (int j = 1; j <= n; j++)
			            {
			                if (i+j==(n/2)+1 && i < n/2 ||j == n/2 || i==n )
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
			
			// Pattern for 2
			if (ch == '2')
			{
				for (int i = 1; i <= n; i++) 
				{
		            for (int j = 1; j <= n; j++) 
		            {
		                if (i == 1 || j == n && i < n/2 
		                	|| i== n/2 || j==1 && i > n/2 || i==n ) 
		                {
		                    System.out.print("*");
		                } else 
		                {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
				
			}
			
			if(ch == '3')
			{
				 for (int i = 1; i <= n; i++) 
				 {
			            for (int j = 1; j <= n; j++) 
			            {
			                if (i==1|| j== n && i< n/2 || i==n/2 
			                	|| j== n && i> n/2 || i== n) 
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
			
			if(ch == '4')
			{
				for (int i = 1; i <= n; i++) 
				{
		            for (int j = 1; j <= n; j++) 
		            {
		                if (j==1 && i< (3*n)/4 || i == (3*n)/4 || j == (3*n)/4 && i> n/2 ) 
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
			
			if(ch=='5')
			{
				for (int i = 1; i <= n; i++)
				{
		            for (int j = 1; j <= n; j++) 
		            {
		                if (i== 1||  j ==1 && i< n/2 || i == n/2 || j ==n && i > n/2 || i==n)
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
			
			if(ch=='6')
			{
				for (int i = 1; i <= n; i++)
				{
		            for (int j = 1; j <= n; j++)
		            {
		                if ( i== 1 ||  j == 1  || i == n || j == n && i > n/2 || i==n/2)
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
			
			if(ch=='7')
			{
			        for (int i = 1; i <= n; i++) 
			        {
			            for (int j = 1; j <= n; j++)
			            {
			                if (i == 1 || i+j == n+1)
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
			
			if(ch=='8')
			{
				for (int i = 1; i <= n; i++) 
				{
		            for (int j = 1; j <= n; j++)
		            {
		                if (i==1 && j<n && j >1 || j==1 && i>1 && i<n 
		                	|| j==n && i>1 && i<n|| i==n && j>1 && j<n || i== n/2)
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
			
			if(ch=='9')
			{
				 for (int i = 1; i <= n; i++) 
				 {
			            for (int j = 1; j <= n; j++)
			            {
			                if (i==1 || j==1 && i<=n/2 || i==n/2 || j==n)
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
		}
		
	}


