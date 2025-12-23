package all_practice_folder;

public class count_partical_letters_into_last_word {

	public static void main(String[] args) {
		String name = " my name is tejesh ";
		System.out.println(wordcount(name));
	}

	public static int wordcount(String s) {

		String word = s.trim();
		int count = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			if (word.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}
