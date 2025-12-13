package Techinical_Interview;

import java.util.HashMap;
import java.util.Map;

public class Print_only_non_reapted_numbers {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9 };
		// without collection
		boolean result = false;
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				if (result) {
					System.out.print(",");
				}
				System.out.print(arr[i]);
				result = true;
			}
		}
		System.out.print("}");

		// with collection
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}
}
