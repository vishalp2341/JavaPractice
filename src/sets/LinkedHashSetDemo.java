package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0 ; i < s.length();i++ )
		{
			set.add(s.charAt(i));
		}
		String res = "";
		for(char x: set)
		{
			res = res + x;
			
		}
		System.out.println(res);
		
		
	}

}
