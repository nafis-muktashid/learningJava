package learnJava_0;

import java.util.*;

public class SwitchStatement_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int option;
		System.out.print("Enter options: ");
		option = input.nextInt();
		
		switch(option) {
			case 1:
				System.out.println("Selected language is Bengali.");
				break;
			case 2:
				System.out.println("Selected language is Hindi.");
				break;
			case 3:
				System.out.println("Selected language is Urdu.");
				break;
			default:
				System.out.println("Selected language is English.");
		}
	}

}
