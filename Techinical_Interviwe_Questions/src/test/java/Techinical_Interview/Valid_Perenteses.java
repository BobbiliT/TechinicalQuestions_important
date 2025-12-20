package Techinical_Interview;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Perenteses {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				stack.push(')');
			} else if (ch == '[') {
				stack.push(']');
			} else if (ch == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		if (isValid(name)) {
			System.out.println("Valid Perentheses.");
		} else {
			System.out.println("Invalid Perenthese.");
		}
	}
}
