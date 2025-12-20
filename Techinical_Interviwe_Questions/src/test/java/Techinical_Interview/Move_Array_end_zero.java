package Techinical_Interview;

import java.util.Arrays;

public class Move_Array_end_zero {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 0, 5, 6, 0, 9 };
		int j = 0;
		// all zeros ending
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

		// all zeros begning

		int output[] = new int[arr.length];
		int index = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				output[index] = arr[i];
				index--;
			}
		}
		System.out.println(Arrays.toString(output));
	}
}
