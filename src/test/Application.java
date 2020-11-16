package test;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		String response = input.nextLine();

		System.out.println("you entered: " + response);


		System.out.println("From the main-branch");


		
		System.out.println("From the feature-branch");
		
		System.out.println("This should be in the feature-branch, not the main branch!");
		
		System.out.println("This line of code needs to be stashed.");
		input.close();
	}

}
