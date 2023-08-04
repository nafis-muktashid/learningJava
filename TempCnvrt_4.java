package learnJava_0;

import java.util.Scanner;

public class TempCnvrt_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double frnh, cel;
		
		frnh = input.nextDouble();
		
		cel = (5.0/9)*(frnh-32);
		
		System.out.printf("Converted temp: %.2f", cel);

	}

}
