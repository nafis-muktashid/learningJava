package learnJava_0;

import java.util.*;

public class Array_10_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int trace=0, minorTrace=0, upTriSum=0, lowTriSum=0;
		
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				arr[i][j] = in.nextInt();			
			}
		}
		

		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				System.out.print(arr[i][j]+" ");			
			}
			System.out.println();
		}
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				if(j==i) {
					trace += arr[i][j];
				}
			}
		}
		System.out.println(trace);
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				if((i+j)==2) {
					minorTrace += arr[i][j];
				}
			}
		}
		System.out.println(minorTrace);
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				if(j==i || j>i) {
					upTriSum += arr[i][j];
				}
			}
		}
		System.out.println("Sum of upper Triangular Matrix's elements "+upTriSum);
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				if(j==i || j<i) {
					lowTriSum += arr[i][j];
				}
			}
		}
		System.out.println("Sum of upper Triangular Matrix's elements "+lowTriSum);
		
	}

}
