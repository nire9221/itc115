
//sentinel: A value that signals the end of user input
//sentinel loop: Repeats until a sentinel value is seen


import java.util.Scanner;

public class SentinelLoop {
	
	public static final int SENTINEL = 3;

	public static void main(String[] args) {
		
		Scanner colsole = new Scanner (System.in);

		int sum=0;
		System.out.print("Enter a number (" + SENTINEL +
                " to quit): ");
;
		int number = colsole.nextInt();
		
		while (number != SENTINEL) {
			sum += number;
			System.out.print("Enter a number (" + SENTINEL +
                    " to quit): ");

			number = colsole.nextInt();
		}
		System.out.println("sum = " + sum);

	}
	
}










//import java.util.Scanner;
//
//public class SentinelLoop {
//
//	public static void main(String[] args) {
//		
//		Scanner colsole = new Scanner (System.in);
//		
//		int sum=0;
//		System.out.print("next integer (-1 to quit)? ");
//		
//		int number = colsole.nextInt();
//		while (number != -1) {
//			sum += number;
//			System.out.print("next integer (-1 to quit)?");
//			number = colsole.nextInt();
//		}
//		System.out.println("sum = " + sum);
//
//	}
//	
//}
