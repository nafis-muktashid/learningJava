package learnJava_0;

import java.util.*;

public class LogicalOperator_6_0 {

	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		
		char ch;
		System.out.print("Enter any chracter : ");
		ch = inpt.next().charAt(0);
		
		if(ch =='A' || ch == 'a' || ch =='E' || ch == 'e' || ch =='I' || ch == 'i' || ch =='O' || ch == 'o' || ch =='U' || ch == 'u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}
}
