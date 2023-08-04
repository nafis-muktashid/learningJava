package learnJava_0;

import java.util.*;

public class Loops_9_0 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, sum0=0, sum1=0, sum2=0;
		System.out.print("Enter number : ");
		n = input.nextInt();
		
		for (int i=1; i<=n; ++i) {
			sum0+=i;
		}
		System.out.printf("Sum with for loop : %d\n\n", sum0);
		
		int i=1;
		while (i<=n) {
			sum1+=i;
			++i;
		}
		System.out.printf("Sum with while loop : %d\n\n", sum0);
		
		int j=0;
		do{
			sum2+=j;
			++j;
		}while(j<=n);
		System.out.printf("Sum with do-while loop : %d\n", sum0);
		
	}

}
