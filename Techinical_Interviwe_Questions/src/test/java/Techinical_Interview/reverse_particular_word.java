package Techinical_Interview;

import java.util.Scanner;

public class reverse_particular_word {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char ch[] = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			ch[i] = name.charAt(i);
		}
		int i = 0;
		int wordcount = 0;
		while (i < ch.length) {
			while (i < ch.length && ch[i] == ' ') {
				i++;
			}
			int start = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int end = i - 1;
			wordcount++;
			if (wordcount == 4) {
				while (start < end) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
			}
		}
		for (int j = 0; j < ch.length; j++) {
			System.out.print(ch[j]);
		}
		s.close();
	}
}
