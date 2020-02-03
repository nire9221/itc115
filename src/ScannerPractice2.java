

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = console.next();
		name = name.toUpperCase();
		System.out.println(name + " has " + name.length() + 
		    " letters and starts with " + name.substring(0, 1));


	}

}
