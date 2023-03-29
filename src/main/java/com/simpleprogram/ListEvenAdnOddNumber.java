package com.simpleprogram;

import java.util.Scanner;

public class ListEvenAdnOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int evenCount=0, oddCOunt=0;
		int num= sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				evenCount++;
			}
			else {
				oddCOunt++;
				
			}
		}
		System.out.println("Even Numbers are "+evenCount);
		System.out.println("Odd Numbers are "+oddCOunt);
	}

}
