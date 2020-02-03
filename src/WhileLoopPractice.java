
public class WhileLoopPractice {

	public static void main(String[] args) {

		int num=1; // if number is 202 (over 200), it will skip the loop and print "after the loop"
		while (num <=200) {
			System.out.print(num+ " ");
			num *= 2; //num = num *2;
		}
		
		System.out.println();
		
		System.out.println("After the loop");
		
	}

}
