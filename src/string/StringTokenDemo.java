package string;
import java.util.StringTokenizer;

public class StringTokenDemo {
public static void main(String[] args) {
	String s = "JAVA PYTHON SQL AI";
	StringTokenizer st = new StringTokenizer(s,"A");
	
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
