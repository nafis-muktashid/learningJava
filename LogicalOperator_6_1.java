package learnJava_0;

import java.util.*;

public class LogicalOperator_6_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Do you love Java?");
		ch = input.next().charAt(0);
		
		
		if(ch == 'y' || ch == 'Y') {
			System.out.println("You are a Java lover.");
		}else if(ch == 'n' || ch == 'N') {
			System.out.println("You are not a Java lover.");
		}else {
			System.out.println("Invalid Input");
		}
		
	}

}
