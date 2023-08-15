package learnJava_0;

import java.util.*;

public class ArrayList_10_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list.size());
		
		list.add(5);
		list.add(10);
		list.add(50);
		list.add(100);
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(2, 10000);

		System.out.println(list);
		System.out.println(list.size());
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());	
		}
		System.out.println();
		
		list.remove(2);
		
		for(int i : list) {
			System.out.print(i+" ");
		}
		
		list.removeAll(list);
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.println(list.size());
	}

}
