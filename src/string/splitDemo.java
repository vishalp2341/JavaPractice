package string;

public class splitDemo 
 {
	public static void main(String[] args) {
		String s = "JAVA PYTHON SQL AI";
		String a[] = s.split(" ");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
 }