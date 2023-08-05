package learnJava_0;

import java.util.*;

public class Fibonacci_9_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, fib=0, n1=0, n2=1;
		
		System.out.print("Enter any number:  ");
		n = input.nextInt();
		
		for(int i=2; i<n; ++i) {
			fib = n1 + n2;
			n1 = n2;
			n2 = fib;
		}
		System.out.println(fib);
	}

}
