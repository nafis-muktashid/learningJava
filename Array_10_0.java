package learnJava_0;

import java.util.*;

public class Array_10_0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		int n = in.nextInt();
		
		System.out.println(weekdays[n-1]);
	}

}
