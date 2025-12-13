package Techinical_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping_between {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));
		System.out.println("enter your inputs : ");
		Scanner s = new Scanner(System.in);
		int index1 = s.nextInt();
		int index2 = s.nextInt();
		if (index1 > 0 || index1 <= arr.length || index2 > 0 || index2 <= arr.length) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		} else {
			System.out.println("invalid index");
		}
		boolean result = false;
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (result) {
				System.out.print(",");
			}
			System.out.print(arr[i]);
			result = true;
		}
		System.out.print("}");
		s.close();
	}
}
