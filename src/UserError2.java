import java.util.Scanner;

public class UserError2 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int age = getInt(console, "How old are you?");
	
		
		}
		
	
	
	// promps until a valid number is entered
	
	public static int getInt(Scanner console, String prompt) {
		System.out.print(prompt);
		while (!console.hasNextInt()) {
			console.next(); // to discard the input
			System.out.println("Not an integer; try again.");
			System.out.print(prompt);
		}
		return console.nextInt();
	
	}

}
