package Techinical_Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class longest_sub_string {

	public static void main(String[] args) {
		longestofsubstringlength("pwwkewxpw");
	}

	public static void longestofsubstringlength(String s) {
		String longestsubstring = " ";
		int longestsubstringlength = 0;

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if(map.size()>longestsubstringlength) {
				longestsubstringlength = map.size();
				longestsubstring = map.keySet().toString();
			}
		}
		System.out.println(longestsubstring);
		System.out.println(longestsubstringlength);
	}
}
