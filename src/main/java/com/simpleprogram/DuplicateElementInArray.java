package com.simpleprogram;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1, 2, 3, 3, 5, 6, 4, 7,7, 3,7};
			
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
					}
				}
			}
	}

}
