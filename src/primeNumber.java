 //number % i == 0 is prime --- 소수(1과 자기자신으로만 나눠지는수)
//If the maximum is less than 2, print no output.


public class primeNumber {

	public static void main(String[] args) {

		printPrimes(50);
		printPrimes(5);
	}
	
//print all prime numbers up to the given max.
	public static void printPrimes(int max) {
		
		if (max >= 2) {
			System.out.print("2");
			for (int i=3; i<=max; i++) {
				if (countFactors(i)==2) {
					System.out.print(", " + i);
				}
			}
			System.out.println();
		}
	}
	
	// returns how many factors the given number has.
	
	public static int countFactors(int number) {
		int count=0;
		for(int i=1; i<= number; i++) {
			if (number%i ==0) {
				count++; // i is a factor of number 
			}
		}
		return count;
	}
	

}

