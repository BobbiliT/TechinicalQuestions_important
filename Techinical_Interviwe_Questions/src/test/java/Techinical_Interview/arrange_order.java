package Techinical_Interview;

import java.util.Scanner;

public class arrange_order {

	public static void main(String[] args) {
		System.out.println("enter your input ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String[] words = name.split(" ");
		String result[] = new String[words.length];
		for (String word : words) {
			String num = "";
			String text = "";
			for (char ch : word.toCharArray()) {
				if (Character.isDigit(ch)) {
					num = num + ch;
				} else {
					text = text + ch;
				}
			}
			int index = Integer.parseInt(num) - 1;
			result[index] = text;
		}
		for (String word : result) {
			System.out.print(word + " ");
		}
	}
}
