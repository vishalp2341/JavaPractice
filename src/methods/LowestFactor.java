package methods;
public class LowestFactor {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int lowestFactor = findLowestFactor(num1, num2);
        
        System.out.println("Lowest factor of " + num1 + " and " + num2 + " is: " + lowestFactor);
    }

    public static int findLowestFactor(int num1, int num2) {
        int minNum = (num1 < num2) ? num1 : num2; // Find the smaller number

        int lowestFactor = 1;
        for (int i = 1	 ; i <= minNum; i++) 
        {
        	if (num1 % i == 0 && num2 % i == 0) 
        	{
                lowestFactor = i;
                break;
            }
        }
        return lowestFactor;
    }
}
