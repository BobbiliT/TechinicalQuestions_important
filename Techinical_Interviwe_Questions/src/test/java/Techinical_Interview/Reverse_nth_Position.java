package Techinical_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_nth_Position {

	public static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotate(int arr[], int num) {
		int n = arr.length;
		num = num % n;
		// Reverse the entire array
		reverse(arr, 0, n - 1);
		// Reverse first num element
		reverse(arr, 0, num - 1);
		// Reverse the rest
		reverse(arr, num, n - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("enter your number ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		rotate(arr, num);
		System.out.println(Arrays.toString(arr));
		s.close();
	}
}
