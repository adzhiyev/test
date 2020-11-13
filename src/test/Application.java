package test;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in); 
		System.out.println("How old are you?");
		String response = input.nextLine();
		
		System.out.println("you entered: " + response);

	}

}
