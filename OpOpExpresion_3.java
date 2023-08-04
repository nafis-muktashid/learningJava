package learnJava_0;

import java.util.*;

public class OpOpExpresion_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int phonePrice = 1800;
		int numOfInstlmnt;
		double amntOfInstlmnt;
		
		System.out.println("Enter number of Installment:  ");
		numOfInstlmnt = input.nextInt();
		
		amntOfInstlmnt = phonePrice/numOfInstlmnt;
		
		System.out.println("The amount of every installment: "+amntOfInstlmnt);
	}

}
