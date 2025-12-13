package Techinical_Interview;

public class Find_common_element_from_array {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 3, 7, 8, 9, 0 };
		boolean result = true;
		System.out.print("{");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					if (!result) {
						System.out.print(",");
					}
					System.out.print(arr1[i]);
					result = false;
					break;
				}
			}
		}
		System.out.print("}");
	}
}
