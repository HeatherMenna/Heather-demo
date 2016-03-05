package Stairs;

import java.util.*;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in); // initialized scanner
		int flights = 0; // created variables
		System.out.println("Hello! Welcome to the star climber."); // welcome screen 
		System.out.println("How many flights would you like to climb?"); // asks for user input
		flights = scan1.nextInt(); // takes in user input 
		for (int i = 0; i <= flights; i++) { // for loop to create stairs that go backward
			for (int j = 0; j < i; j++)
				System.out.print("#");
			System.out.println(" ");
		}System.out.println(" "); 
		for (int i = 1; i <= flights; i++) { // for loop to print stairs that go the correct way
			for (int j = 1; j <= flights; j++) {
				if ((i + j) > flights) {
					System.out.print("#");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("Thanks for playing!");
		scan1.close();
	}
}