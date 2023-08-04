package learnJava_0;

import java.util.*;

public class IfElse_5_2 {

	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);
		
		char ch;
		System.out.print("Enter any chracter : ");
		ch = inpt.next().charAt(0);
		
		if(ch =='A' || ch == 'a') {
			System.out.println("Vowel");
		}else if(ch =='E' || ch == 'e') {
			System.out.println("Vowel");
		}else if(ch =='I' || ch == 'i') {
			System.out.println("Vowel");
		}else if(ch =='O' || ch == 'o') {
			System.out.println("Vowel");
		}else if(ch =='U' || ch == 'u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}

	}

}
