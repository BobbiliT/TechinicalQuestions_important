package all_practice_folder;

public class array_problem {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 3, 3, 6, 6, 6, 7, 9, 9};
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}
			if (count >1) {
				System.out.println(arr[i] + "=" + count);
				i = i + (count - 1);
			}
			count = 1;
		}
	}
}
