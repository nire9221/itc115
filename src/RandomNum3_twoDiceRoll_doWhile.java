import java.util.Random;
public class RandomNum3_twoDiceRoll_doWhile {

		public static void main(String[] args) {
			Random r= new Random();
			int sum=0; // set to 9 to make sure we enter the loop
			
			do {
	
				//roll the dice once 
				int roll1=r.nextInt(6) +1;
				int roll2=r.nextInt(6) +1;
				sum = roll1+roll2;
				System.out.println(roll1+ " + " + roll2 + " = " + sum);
			} while (sum !=7); 

		}	

	}
