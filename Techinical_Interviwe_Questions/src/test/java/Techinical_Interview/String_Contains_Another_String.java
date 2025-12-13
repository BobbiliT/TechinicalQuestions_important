package Techinical_Interview;

public class String_Contains_Another_String {

	public static void main(String[] args) {
		String main_str = "helloworld";
		String sub_str = "hello";
		boolean result = false;
		for (int i = 0; i < main_str.length(); i++) {
			int j;
			for (j = 0; j < sub_str.length(); j++) {
				if (main_str.charAt(i+j) != sub_str.charAt(j)) {
					break;
				}
			}
			if (j == sub_str.length()) {
				result = true;
				break;
			}
		}
		if (result == true) {
			System.out.println("Yes, '" + main_str + "'  contains  '" + sub_str+"'");
		} else {
			System.out.println("No, '" + main_str + "' does not contains '" + sub_str+"'");
		}
	}
}
