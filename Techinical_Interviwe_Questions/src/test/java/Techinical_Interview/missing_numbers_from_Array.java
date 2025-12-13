package Techinical_Interview;

public class missing_numbers_from_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 10 };
		int diff = arr[0];
		boolean result = false;
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != diff) {
				while (diff < arr[i] - i) {
					if(result) {
						System.out.print(",");
					}
					System.out.print((i + diff));
					result = true;
					diff++;
				}
			}
		}
		System.out.print("}");
	}
}
