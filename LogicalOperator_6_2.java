package learnJava_0;

import java.util.*;

public class LogicalOperator_6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char ans0, ans1;
		System.out.print("Have you completed your masters? : ");
		ans0 = input.next().charAt(0);
		System.out.print("Are you fluent in English? ");
		ans1 = input.next().charAt(0);
		
		if(ans0=='y' && ans1=='y') {
			System.out.println("You are an eligible candidate.");
		}else {
			System.out.println("Sorry. You are not an eligible candidate.");
		}
	}
}
