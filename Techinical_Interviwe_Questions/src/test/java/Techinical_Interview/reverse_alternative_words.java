package Techinical_Interview;

import java.util.Scanner;

public class reverse_alternative_words {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String[] words = name.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {
				// Reverse this word manually
				char[] chars = words[i].toCharArray();
				char[] reversed = new char[chars.length];

				for (int j = 0; j < chars.length; j++) {
					reversed[j] = chars[chars.length - 1 - j];
				}

				// Convert char array to String manually without StringBuilder
				String reversedWord = "";
				for (int j = 0; j < reversed.length; j++) {
					reversedWord += reversed[j];
				}

				words[i] = reversedWord;
			}
		}

		// Print final result
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]);
			if (i != words.length - 1) {
				System.out.print(" ");
			}
		}
		s.close();
	}
}
