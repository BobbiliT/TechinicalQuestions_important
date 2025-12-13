package Techinical_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Find_First_Last_Position_Element {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 4, 5, 6, 7, 3, 4, 2, 3, 5, 4, 6, 2, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter your target Index : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int count = 0;
		int first = 0;
		int last = 0;
		// find first indexs of given number 
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
				if(count==1) {
					first = i;
					break;
				}
			}
		}
		count = 0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]==num) {
				count++;
				if(count==1) {
					last = i;
					break;
				}
			}
		}
		System.out.println(first);
		System.out.println(last);
	}
}
