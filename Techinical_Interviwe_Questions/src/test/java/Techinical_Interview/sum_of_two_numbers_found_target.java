package Techinical_Interview;

import java.util.Scanner;

public class sum_of_two_numbers_found_target {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("enter your target element : ");
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
					found = true;
					break;
				}
			}
			if (found) {  // if you get one matching pair then use this line
				break;
			}
		}
		if (!found) {
			System.out.println("no pair found with sum = " + target);
		}
		s.close();
	}
}
