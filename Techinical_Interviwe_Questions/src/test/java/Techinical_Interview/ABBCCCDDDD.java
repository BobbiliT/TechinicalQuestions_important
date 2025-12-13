package Techinical_Interview;

import java.util.Scanner;

public class ABBCCCDDDD {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			for (int j = 0; j <= i; j++) {
				result += ch;
			}
		}
		System.out.println(result);
		s.close();
	}
}
