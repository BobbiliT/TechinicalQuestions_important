package Techinical_Interview;

public class second_max_number_from_array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int higest = Integer.MIN_VALUE;
		int second_higest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int second_lowest = Integer.MAX_VALUE;
		// second higest number from an array.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > higest) {
				second_higest = higest;
				higest = arr[i];
			}
			if (arr[i] < higest && arr[i] > second_higest) {
				second_higest = arr[i];
			}
		}
		System.out.println("second largest number from array -> " + second_higest);
		// second lowest number from an array.
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < lowest) {
				second_lowest = lowest;
				lowest = arr[j];
			}
			if (arr[j] > lowest && arr[j] < second_lowest) {
				second_lowest = arr[j];
			}
		}
		System.out.println("second lowest number from array -> " + second_lowest);

		// if you want to get any element from the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int a = arr[arr.length - 3];
		System.out.println("Third larget element from array -> " + a);

		// whitout using inbuild method get third larget numer
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		if (arr.length < 3) {
			System.out.println("array must have at least 3 elemnts");
			return;
		}
		for (int num : arr) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second && num < first) {
				third = second;
				second = num;
			} else if (num > third) {
				third = num;
			}
		}
		System.out.println(third);
	}
}
