package Techinical_Interview;

import java.util.Scanner;

public class Print_sub_reverse {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int num = s.nextInt();
		String rev = "";
		String word[] = name.split(" ");
		if (num < word.length) {
			String sub = word[num];
			for (int i = sub.length() - 1; i >= 0; i--) {
				rev = rev + sub.charAt(i);
			}
			System.out.println(rev);
		} else {
			System.out.println("your should enter the number between 0 and " + (word.length - 1));
		}
		s.close();
	}
}
