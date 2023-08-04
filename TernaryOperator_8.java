package learnJava_0;

import java.util.*;

public class TernaryOperator_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		System.out.print("Enter 2 number: ");
		x = input.nextInt();
		y = input.nextInt();
		
		int large = (x>y) ? x : y;
		System.out.print("The bigger number is : "+large+"\n");
	}

}
