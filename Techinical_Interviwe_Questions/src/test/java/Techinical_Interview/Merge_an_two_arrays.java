package Techinical_Interview;

public class Merge_an_two_arrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 9, 10 };
		boolean result = false;
		System.out.print("{");
		int m[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			m[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			m[arr1.length + i] = arr2[i];
		}
		for (int num : m) {
			if(result) {
			System.out.print(",");
			}
			System.out.print(num + " ");
			result = true;
		}
		System.out.print("}");
	}
}
