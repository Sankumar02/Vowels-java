package com.Challenge;

import java.util.Scanner;

/*
 * 3. write a program to count the number of vowels in your name, print the positions of vowels in your name. 
 * for e.g. - if Romania is given the output is number of vowels = 4, positions of vowels = 2,4,6,7
 */
public class Vowels {

	public static void main(String[] args) {

		Scanner strVowel = new Scanner(System.in);
		System.out.println("Enter the String to check the vowels :");
		String letter = strVowel.nextLine();

		int count = 0;
	
		for (int i = 0; i < letter.length(); i++) {

			if ((letter.charAt(i) == 'a' || letter.charAt(i) == 'e' || letter.charAt(i) == 'i'
					|| letter.charAt(i) == 'o' || letter.charAt(i) == 'u' || letter.charAt(i) == 'A'
					|| letter.charAt(i) == 'E' || letter.charAt(i) == 'I' || letter.charAt(i) == 'O'
					|| letter.charAt(i) == 'U')) {
				System.out.println("Vowels in a strings entered is :" + letter.charAt(i));
				count++;
				System.out.println("Position :" +(i+1));
			}						
		}
		System.out.println("Number of vowels in a given String : " + count);		
	}
}
