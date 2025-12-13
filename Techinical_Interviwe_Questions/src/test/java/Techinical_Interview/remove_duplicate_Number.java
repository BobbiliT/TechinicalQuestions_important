package Techinical_Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_Number {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 6, 7, 8, 4, 5, 6, 4, 3, 5, 8, 0, 9, 4, 5, 6 };
		boolean result = false;
		System.out.println("without collection ");
		System.out.print("{");
		Arrays.sort(arr);
		//remove duplacte number without collection
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[arr.length - 1];
		for (int k = 0; k <= j; k++) {
			if (result) {
				System.out.print(",");
			}
			System.out.print(arr[k]);
			result = true;
		}
		System.out.print("}");
		System.out.println(" ");

		// with collection
		System.out.println("with collection ");
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Integer[] array = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(array));
		
		//find and print the only duplicate numbers
		System.out.println("print duplcate numbers ");
		for(int a = 0; a<arr.length; a++) {
			for(int b = a+1; b<arr.length; b++) {
				if(arr[a]==arr[b]) {
					System.out.print(arr[a]);
					break;
				}
			}
		}
	}
}
