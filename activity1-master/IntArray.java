//package labActivity;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		
		System.out.println("Sample output:");
		
		for(int i =0; i<num.length;i++) {
			System.out.print("Enter an integer : ");
			num[i] = sc.nextInt();
			
		}
		System.out.print("First to Last : ");
		for(int i =0; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.print("\nLast to First : ");
		for(int i =num.length-1; i>=0;i--) {
			System.out.print(num[i] + " ");
		}
		System.out.print("\n");

	}

}
