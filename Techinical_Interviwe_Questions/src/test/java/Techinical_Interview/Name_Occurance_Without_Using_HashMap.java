package Techinical_Interview;

import java.util.Scanner;

public class Name_Occurance_Without_Using_HashMap {

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner ss = new Scanner(System.in);
		String name = ss.nextLine();
		String store = "";
		for(int i=0; i<name.length(); i++) {
			int count = 0;
			for(int j=0; j<name.length(); j++) {
				if(name.charAt(i)==name.charAt(j)) {
					count++;
				}
			}
			//Converts the character at position i to a String and stores it in variable s. 
			//This is done so we can check if it exists in store.
			String s = String.valueOf(name.charAt(i));
			//This checks if the character (as a string) has not already been added to store
			if(!store.contains(s)) {
				store = store +name.charAt(i);
				System.out.println(name.charAt(i)+"="+count);
			}
		}
		ss.close();
	}
}
