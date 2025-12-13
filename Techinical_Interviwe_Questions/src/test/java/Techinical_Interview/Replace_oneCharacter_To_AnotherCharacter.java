package Techinical_Interview;

public class Replace_oneCharacter_To_AnotherCharacter {

	public static void main(String[] args) {
		String name = "tejesh";
		char target = 'e';
		char replace = 't';
		String result = "";
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if(ch==target) {
				result += replace;
			}
			else {
				result += ch;
			}
		}
		System.out.println(result);
	}
}
