package Techinical_Interview;

import java.util.Arrays;

public class merge_missingnumber_from_array {

	public static void main(String[] args) {
		int arr[] = { 1, 10};
		int max = arr[0];
		int min = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		boolean result[] = new boolean[max + 1];
		for (int num : arr) {
			result[num] = true;
		}
		int totalcount = 0;
		for (int i = min; i <= max; i++) {
			totalcount++;
		}
		int marged[] = new int[totalcount];
		int index = 0;
		for (int i = min; i <= max; i++) {
			marged[index++] = i;
		}
		System.out.println(Arrays.toString(marged));
	}
}
