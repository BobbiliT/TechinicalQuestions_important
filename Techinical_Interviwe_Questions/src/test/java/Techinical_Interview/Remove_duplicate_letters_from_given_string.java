package Techinical_Interview;

import java.util.Scanner;

public class Remove_duplicate_letters_from_given_string {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String arr[] = name.split("");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (!arr[i].equals(arr[j])) {
					if (!result.contains(arr[i])) {
						System.out.print(arr[i]);
						result = result + arr[i];
					}
				}
			}
		}
	}
}
