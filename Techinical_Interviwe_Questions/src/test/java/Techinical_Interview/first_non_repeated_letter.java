package Techinical_Interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class first_non_repeated_letter {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		boolean result = false;
		char count[] = new char[256];
		char ch = ' ';
		int non_repeated = 0;
		for (int i = 0; i < name.length(); i++) {
			count[name.charAt(i)]++;
		}
		for (int i = 0; i < name.length(); i++) {
			if (count[name.charAt(i)] == 2) {
				non_repeated++;
				if (non_repeated == 6) {
					ch = name.charAt(i);
					result = true;
					break;
				}
			}
		}
		if (result == true) {
			System.out.println("found non repeated character -> " + ch);
		} else {
			System.out.println("non repeated character is not found.");
		}
		// using the collectoins
		LinkedHashMap<Character, Integer> lm = new LinkedHashMap<>();
		for (char c : name.toCharArray()) {
			if (lm.containsKey(c)) {
				lm.put(c, lm.getOrDefault(c, 0) + 1);
			} else {
				lm.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : lm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		s.close();
	}
}
