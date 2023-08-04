package learnJava_0;

import java.util.*;

public class OddSum_9_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m, n, sum=0;
		System.out.print("Enter two number: ");
		m = input.nextInt();		
		n = input.nextInt();
		
		for (int i=m; i<=n; ++i) {
			if(i%2==0) {
				continue;
			}else {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
