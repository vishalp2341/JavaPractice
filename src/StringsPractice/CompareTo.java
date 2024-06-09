package StringsPractice;

public class CompareTo {

	public static void main(String[] args) {
	 String s1 = "SAURAV";
	 String s2 = "SACHIN TENDULKAR";
	 
	 int res = s1.compareTo(s2);
	 
	 System.out.println(res);
	 
	 if(res == 0)
	 {
		 System.out.println("s1 is equal to s2");
	 }
	 
	 if(res > 0)
	 {
		 System.out.println("s1 is greater than s2");
	 
	 }
	 
	 if(res < 0)
	 {
		 System.out.println("s1 is lesser than s2");
	 }

}
}
