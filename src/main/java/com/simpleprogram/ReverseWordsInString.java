package com.simpleprogram;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string= sc.nextLine();
		String reverse="";
		String words[]= string.split(" ");
		
		for(int i=0; i<words.length;i++) {
			String word= words[i];
			String revereWord="";
			
			for(int j=word.length()-1; j>=0; j--) {
				revereWord += word.charAt(j);
			}
			reverse = reverse+ revereWord+ " ";
		}
		System.out.println("Final String is: "+ reverse);
		
	}

}
