package com.simpleprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter Number: ");
		int num = sc.nextInt();
		int reverse =reverseNumber(num);
		System.out.println("Reversed number is: "+reverse);
		
	}

	static int reverseNumber(int num) {
		int rev=0, rem;
		while(num>0) {
			rem=num%10;
			rev= rev*10 + rem;
			num=num/10;
		}
		return rev;
	}
}
