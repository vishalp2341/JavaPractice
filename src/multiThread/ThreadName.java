package multiThread;

import java.util.HashSet;

public class ThreadName {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		
		
		
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 3;
		System.out.println(a);
//		HashSet a = new HashSet();
//		a.add(1);
//		a.add(12);
//		a.add(11);
//		System.out.println(a);
	}

}
