import java.util.Scanner;

public class SentinelLoop {

	public static void main(String[] args) {
		Scanner colsole = new Scanner (System.in);
		int sum=0;
		System.out.print("next integer (-1 to quit)? ");
		int number = colsole.nextInt();
		while (number != -1) {
			sum += number;
			System.out.print("next integer (-1 to quit)?");
			number = colsole.nextInt();
		}
		System.out.println("sum = " + sum);
	}

}
