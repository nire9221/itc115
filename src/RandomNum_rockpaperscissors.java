import java.util.Random;

public class RandomNum_rockpaperscissors {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int r= rand.nextInt(3);
		
		if (r==0) {
			System.out.println("Rock");
		}else if (r==1) {
			System.out.println("Paper");
		}else {
			System.out.println("Scissors");
		}
		
	}

}
