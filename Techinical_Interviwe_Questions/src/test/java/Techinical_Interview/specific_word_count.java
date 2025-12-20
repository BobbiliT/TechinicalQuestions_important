package Techinical_Interview;

import java.util.Scanner;

public class specific_word_count {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String target = s.nextLine();
		String words[] = name.split(" ");
		int count = 0;
		boolean result = false;
		for (String word : words) {
			if (word.equals(target)) {
				for (int i = 0; i < target.length(); i++) {
					count++;
					result = true;
				}
			}
		}
		if (result) {
			System.out.println("word " + target + " and it's count = " + count);
		} else {
			System.out.println("word does not match with input data.");
		}
	}
}
