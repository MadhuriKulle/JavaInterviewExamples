package com.simpleprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= sc.nextLine();
		
		Map<Character, Integer> occurrence= new HashMap<Character, Integer>();
		//Check occurrence
		for(char c : str.toCharArray()) {
			occurrence.put(c, occurrence.getOrDefault(c, 0)+1);
		}
		//Traverse the string
		for(char c: str.toCharArray()) {
			if(occurrence.get(c)==1) {
				System.out.print("The First Non repeated char is "+c+" ");
				//return;
			}
		}

	}

}
