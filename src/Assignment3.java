
public class Assignment3 {

	public static void main(String[] args) {

		
		printPowersOfN(4,3);
		printPowersOfN(5,6);
		printPowersOfN(-2,8);
	


	}
	public static void printPowersOfN(int x, int y){		
		
		for (int i=0; i <= y ; i++) {
			int result= (int) Math.pow(x, i);
			System.out.print(result+ " ");
	
		}
			
		System.out.println();
	}
}


//int product =1;
//for (int i=1; i<=20; i++) {
//	product *= 2; // product = product*2 
//}
//	System.out.println("2^20 =" +product)







