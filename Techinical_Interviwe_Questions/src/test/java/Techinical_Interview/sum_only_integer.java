package Techinical_Interview;

public class sum_only_integer {

	public static void main(String[] args) {
		String[] array = { "5", "2", "9", "a", "1", "6", "#", "3", "b", "c", "d", "e", "f" };
		int sum = 0;
		String result = "";
		for (String s : array) {
			try {
				int num = Integer.parseInt(s);
				sum = sum + num;
			} catch (Exception e) {

			}
		}
		System.out.println("sum of Integer from array -> " + sum);

		for (String word : array) {
			if (word.matches("[a-zA-z]")) {
				result = result + word;
			}
		}
		System.out.println("total letters from array - > " + result);
	}
}