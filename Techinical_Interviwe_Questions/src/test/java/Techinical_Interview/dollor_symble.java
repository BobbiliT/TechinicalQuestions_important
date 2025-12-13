package Techinical_Interview;

import java.util.Arrays;

public class dollor_symble {

	public static void main(String[] args) {
		String name = "tomorrow";
		String[] arr = name.split("");
		String result = "";
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("o")) {
				temp = temp + 1;
				for (int j = 0; j < temp; j++) {
					result = result + "$";
				}
			} else {
				result = result + arr[i];
			}
		}
		System.out.println(result);
	}
}
