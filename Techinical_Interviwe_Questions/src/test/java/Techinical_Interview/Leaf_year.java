package Techinical_Interview;

import java.util.Scanner;

public class Leaf_year {

	public static void main(String[] args) {
		System.out.println("enter your number ");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if (year % 400 == 0) {
			System.out.println("this is a leaf year.");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("this is a leaf year.");
		} else {
			System.out.println("this is not a leaf year.");
		}
		s.close();
	}
}
