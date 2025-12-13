package Techinical_Interview;

import java.util.HashMap;
import java.util.Map;

public class Find_higest_lowest_frequncy {

	public static void main(String[] args) {
		String name = "programming";
		// With COLLECTION
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : name.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		char maxChar = name.charAt(0);
		int maxCount = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount || (entry.getValue() == maxCount && entry.getKey() < maxChar)) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println(maxChar + " -> " + maxCount);
		// Without collection minimum frequency
		int freq_min[] = new int[26];
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				// Example: 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25.
				freq_min[ch - 'a']++;
			}
		}
		char minChar = ' ';
		int minCount = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			if (freq_min[i] != 0 && freq_min[i] < minCount) {
				minCount = freq_min[i];
				// Converts the array index back to the character using (char)(i + 'a').
				minChar = (char) (i + 'a');
			}
		}
		System.out.println("Lowest frequency letter: " + minChar);
		System.out.println("Frequency: " + minCount);
		// Without collection maximum frequency
		int freq_max[] = new int[26];
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				// Example: 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25.
				freq_max[ch - 'a']++;
			}
		}
		char maxchar = ' ';
		int maxcount = Integer.MIN_VALUE;
		for (int i = 0; i < 26; i++) {
			if (freq_max[i] > maxcount) {
				maxcount = freq_max[i];
				// Converts the array index back to the character using (char)(i + 'a').
				maxchar = (char) (i + 'a');
			}
		}
		System.out.println("higest frequency letter: " + maxchar);
		System.out.println("Frequency: " + maxcount);
	}
}
