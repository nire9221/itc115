
public class Fencepost {

	public static void main(String[] args) {

		printNumbers(5);
	}
	public static void printNumbers(int num) {
			
		for (int i=1; i<=num-1; i++) {
			System.out.print(i + ", ");
			
		}
		System.out.print(num);
	}
	
}
