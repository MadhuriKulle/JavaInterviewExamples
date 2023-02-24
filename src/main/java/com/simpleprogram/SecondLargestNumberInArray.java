package com.simpleprogram;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {25,4,6,9,11,23};
		int first=0;
		int second=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>first) {
				first=a[i];
			}
		}
		for(int j=0; j<a.length;j++) {
			if(a[j]>second && a[j] != first) {
				second=a[j];
			}
		}
		System.out.println("Second Largest Number is: "+second);
	}

}
