package Techinical_Interview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class name_occurance {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (Character ch : name.toCharArray()) {
			if (hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch) + 1);
			} else {
				hs.put(ch, 1);
			}
		}
		// print like inside an array
		System.out.println(hs);

		// print vertical order
		for (HashMap.Entry<Character, Integer> e : hs.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

		// print only duplicate letter from given string
		Set<Character> set = hs.keySet();
		for (Character ch : set) {
			if (hs.get(ch) > 1) {
				System.out.println(ch + "=" + hs.get(ch));
			}
		}
		s.close();
	}
}
