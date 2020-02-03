

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Tdype your GPA : ");
		double gpa = console.nextDouble();
		
		if (gpa >= 2.0) {
		    System.out.println("Welcome to Mars University!");
		} else {
		    System.out.println("Application denied.");
		}

		
	}
	
}
