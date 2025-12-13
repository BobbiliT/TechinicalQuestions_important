package Techinical_Interview;

import java.util.Scanner;

public class Each_Letter_Twice {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char[] ch = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			ch[i] = name.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			System.out.print(ch[i]);
		}
		s.close();
	}
}
