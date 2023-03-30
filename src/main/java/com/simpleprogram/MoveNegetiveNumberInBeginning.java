package com.simpleprogram;

public class MoveNegetiveNumberInBeginning {

	public static void main(String[] args) {
		int arr[]= {1, 5, 8, -3, -1, 4, 23, -23};
		int n = arr.length;
		rearrange(arr, n);
		printArray(arr);

	}

	static void rearrange(int arr[], int n) {
		int j=0, temp;
		for(int i=0; i<n; i++) {
			if(arr[i]<0) {
				if(i != j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
	}
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
