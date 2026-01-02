package Techinical_Interview;

import java.util.Scanner;

public class reverse_name_keep_It_speace_order {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char output[] = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				output[i] = ' ';
			}
		}
		int j = output.length - 1;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				while (output[j] == ' ') {
					j--;
				}
				output[j] = name.charAt(i);
				j--;
			}
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
	}
}
