package Techinical_Interview;

import java.util.Random;
import java.util.Scanner;

public class Otp_Generate {

	public static void main(String[] args) {
		Random r = new Random();
		int otp = r.nextInt(999999);
		System.out.println(otp);
		System.out.println("enter your name ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (num == otp) {
			System.out.println("Otp verified successfully.");
		} else {
			System.err.println("Invalid otp, please try again.");
		}
		s.close();
	}
}
