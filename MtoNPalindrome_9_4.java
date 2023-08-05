package learnJava_0;

import java.util.*;

public class MtoNPalindrome_9_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, m, sum=0, pNumCntr=0, tmp, i, j;
		
		System.out.print("Enter starting number: ");
		m = input.nextInt();
		System.out.print("Enter ending number: ");
		n = input.nextInt();
		
		for(i = m; i <= n; ++i) {
			j=i;
			while(j!=0 && i>10) {
				tmp = j % 10;
				sum = sum * 10 + tmp;
				j = j / 10;
			}
			if(sum==i) {
				System.out.print(i+" ");
				pNumCntr++;
			}
			sum=0;
		}
		System.out.println(pNumCntr);
	}
	
}
