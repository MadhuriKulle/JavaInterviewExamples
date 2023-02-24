package com.simpleprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccuranceCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String string = sc.nextLine();
		
		HashMap<Character, Integer> mapString = new HashMap<Character, Integer>();
		for(int i=0; i<string.length();i++) {
			char c = string.charAt(i);
			if(mapString.containsKey(c)) {
				mapString.put(c, mapString.get(c)+1);
			}
			else {
				mapString.put(c, 1);
			}
		}
		for(Map.Entry entry : mapString.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}

}
