package learnJava_0;

import java.util.Scanner;

public class TakeInputFromUser_2 {
	public static void main(String[] args) {
		//for different data type- different scanner object needed.
		Scanner inputInt = new Scanner(System.in); 
		Scanner inputStr = new Scanner(System.in);
		
		int id;
		String title, price, description, category;
		
		System.out.print("Enter ID :\t");
		id = inputInt.nextInt();
		
		System.out.print("Enter title :\t");
		title = inputStr.nextLine();
		
		System.out.print("Enter price :\t");
		price = inputStr.nextLine();
		
		System.out.print("Enter description :\t");
		description = inputStr.nextLine();
		
		System.out.print("Enter category :\t");
		category = inputStr.nextLine();
		
		
		System.out.println(id+"\t"+title+"\t"+price+"\t"+description+"\t"+category);
	}
}
