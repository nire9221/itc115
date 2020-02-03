
public class FactorPractice {

	public static void main(String[] args) {

		// finds the first factor of 92, other than 1
		
		int n=91;
		int factor=2;
		while (n % factor !=0) { // increase factor by 1 if there's a reminder of the div
			factor++; // factor = factor+1
		}
		System.out.println("First factor is "+factor);
		
		//output : First factor is 7
		
	}

}
