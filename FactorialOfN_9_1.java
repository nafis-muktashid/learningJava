package learnJava_0;

import java.util.*;

public class FactorialOfN_9_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, fact=1;
		System.out.print("Enter a number: ");
		n = input.nextInt();
		
		for (int i=1; i<=n; ++i) {
			fact*=i;
		}
		
		System.out.println(fact);
	}

}
