package Techinical_Interview;

import java.util.Scanner;

public class reverse_sentance {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String words[] = name.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String rev = "";
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				rev = ch + rev;
			}
			System.out.print(rev + " ");
		}
		s.close();
	}
}
