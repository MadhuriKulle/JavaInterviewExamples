package com.simpleprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag= true;
				break;
			}
		}
		if(!flag)
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not prime number12");

	}

}
