// guess number

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		Scanner console = new Scanner (System.in);
		int number=42; // always picks the same number
		
		System.out.print("your guess?");
		int guess = console.nextInt();
		int numGuesses=1;
		
		while (guess !=number) {
			System.out.println("incorrect");
			System.out.print("your guess?");
			guess =console.nextInt();
			numGuesses++;
			
		}
		
		System.out.println("you got it right in" + numGuesses + " tries");
		
	}

}
