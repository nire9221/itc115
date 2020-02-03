import java.util.Scanner;

public class UserError {

	public static void main(String[] args) {
		System.out.println("This program examines the ways");
		System.out.println("a token can be read");
		System.out.println();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("token?");
		System.out.println("has nextInt = " + console.hasNextInt());
		System.out.println("has nextDouble = " + console.hasNextDouble());
		System.out.println("has next = " + console.hasNext());
		

	}

}
