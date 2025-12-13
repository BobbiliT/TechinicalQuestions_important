package Techinical_Interview;

public class Reverse_String_array {

	public static void reverse(String word[]) {
		System.out.print("{");
		for (int i = 0; i < word.length; i++) {
			char[] charArray = word[i].toCharArray();
			for (int j = charArray.length - 1; j >= 0; j--) {
				System.out.print(charArray[j]);
			}
			if (i < word.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		String name[] = { "tejesh", "bobbili", "virat" };
		reverse(name);
	}
}
