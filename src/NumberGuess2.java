// guess number

import java.util.*;

public class NumberGuess2 {

	public static void main(String[] args) {

		
		giveIntro();
		
		Scanner console = new Scanner (System.in);
		
		// pick a random number from 0 to 99 inclusive
		
		Random rand = new Random();
		int number = rand.nextInt(100);
		
		
		//get first guess 
		
		int guess = console.nextInt();
		int numGuesses=1;
		
		
		// give hints until correct guess is reached
		while (guess !=number) {
			int numMatches = matches(number,guess);
		
			System.out.println("incorrect (hint: " + numMatches + " digit match");
			System.out.print("your guess?");
			guess =console.nextInt();
			numGuesses++;
			
		}
		
		System.out.println("you got it right in" + numGuesses + " tries");
		
	}
	
	
	public static void giveIntro() {
		System.out.println("Try to guess my two-digit");
		System.out.println("number, and I'll tell you how");
		System.out.println("many digits from your guess");
		System.out.println("appear in my number");
		System.out.println();
		
	}
	
	//returns how many digits from the given
	// guess match digits from the given correct number 
	public static int matches (int number, int guess) {
		int numMatches =0;
		
		if (guess /10 == number /10 || guess/10 == number % 10 ) {
			numMatches++;
		}
		
		if (guess /10 != guess % 10 && (guess %10 == number /10 || guess % 10 == number % 10)) {
			numMatches++;
		}
		return numMatches;
	}
	
	//prompt until a number in proper range in entered
	//post : guess is between 0 and 99
	
	public static int getGuess(Scanner console) {
		int guess = getInt(console, "your guess?");
		while (guess<0 || guess >=100) {
			System.out.println("Out of range; try again");
			guess= getInt(console,"your guess?");
		}
		return guess;
	}
	
	// prompts until a valid number is entered
	public static int getInt(Scanner console, String prompt) {
		System.out.print(prompt);
		while(!console.hasNextInt()) {
			console.hasNext(); // to discard the input
			System.out.println("Not an integer; try again");
			System.out.print(prompt);
		}
		return console.nextInt();
	}

}

