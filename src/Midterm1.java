import java.util.Random;

public class Midterm1 {

	public static void main(String[] args) {

		Random r= new Random();
		
		int tries =0;
		int step=0;
		
		while (step != 6) {
			int stepUp=r.nextInt(2);
			if (stepUp ==0) {
				//System.out.println("fall " + stepUp);
				step = 0;
				tries++;
				
			}else {
				//System.out.println("up");
				step++;
			}
		
		} System.out.println("number of falls : " + tries);
	}

}
