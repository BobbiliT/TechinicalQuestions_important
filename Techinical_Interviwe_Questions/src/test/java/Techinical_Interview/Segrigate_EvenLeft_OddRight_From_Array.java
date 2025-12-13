package Techinical_Interview;

import java.util.Arrays;

public class Segrigate_EvenLeft_OddRight_From_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		// Approch 1
		System.err.println("First Approch :");
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			while(arr[left]%2==0&&left<right) {
				left++;
			}
			while(arr[right]%2!=0&&left<right) {
				right--;
			}
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.err.println("Second Approch :");
		
		int output[] = new int[arr.length];
		int index = 0;
		for(int num : arr) {
			if(num%2==0) {
				output[index++] = num;
			}
		}
		for(int num : arr) {
			if(num%2!=0) {
				output[index++] = num;
			}
		}
		System.out.println(Arrays.toString(output));
	}
}
