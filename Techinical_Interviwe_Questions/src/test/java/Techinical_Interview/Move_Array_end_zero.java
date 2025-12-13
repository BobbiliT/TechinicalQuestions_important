package Techinical_Interview;

import java.util.Arrays;

public class Move_Array_end_zero {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 0, 5, 6, 0, 9 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		//output = [1, 2, 5, 6, 9, 0, 0, 0, 0]
		
		
	}
}
