package Techinical_Interview;

import java.util.Scanner;

public class Letter_and_count {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int i = 0;
		while (i < name.length()) {
			char ch = name.charAt(i);
			int count = 1;
			int j = i + 1;
			while (j < name.length() && name.charAt(j) == ch) {
				count++;
				j++;
			}
			System.out.print(ch + "_" + count+",");
			i=j;
		}
		s.close();
	}
}
