package test;

import java.util.Scanner;

public class SignIn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String username = input.nextLine();
		System.out.println("Enter your password: ");
		String password = input.nextLine();

		if (username.equals("admin") && password.equals("abc")) {
			System.out.println(username + " has signed in.");
		}

		else {
			System.out.println("Invalid Credentials, please reload application.");
		}
		
		input.close();
	}

}
