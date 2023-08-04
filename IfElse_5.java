package learnJava_0;

import java.util.*;

public class IfElse_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		if(age>=18) {
			System.out.println("Valid voter.");
		}else {
			System.out.println("Invalid voter.");
		}
	}

}
