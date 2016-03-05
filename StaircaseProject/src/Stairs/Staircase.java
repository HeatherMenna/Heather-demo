package Stairs;

import java.util.*;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		int flights = 0;
		System.out.println("Hello! Welcome to the star climber.");
		System.out.println("How many flights would you like to climb?");
		flights = scan1.nextInt();
		for (int i = 0; i <= flights; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("#");
			System.out.println(" ");
		}System.out.println(" ");
		for (int i = 1; i <= flights; i++) {
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