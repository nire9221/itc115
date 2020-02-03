//import java.text.NumberFormat;

public class Receipt {

	
	public static void main(String[] args) {
		
		double total = subtotal()+ tax()+tip();
		System.out.println("tax:" + tax());
		System.out.println("tip:" + tip());
		System.out.println("subtotal:" + subtotal());
		System.out.println("total:" + total);

	}
	public static double subtotal() {
		
		double subtotal = (38+40+30);
		return subtotal;
		
	}
	public static double tax() {
		
		double tax =(subtotal()) * .08;
		return tax;
	}
	
	public static double tip() {
		
		double tip = (subtotal())* .15;
		return tip;
		
	}
	
	


}



//public class Receipt{
//	
//	public static final double Tax=.08;  //a constant
//	public static void main(String[] args) {
//		double total=calculateBill(45.55,0.20);
//		System.out.println(total);
//	
//	}
//	public static double calculateBill (double subtotal, double tipPercent) {
//		double tax= subtotal *Tax;
//		double tip= subtotal *tipPercent;
//		double total= subtotal + tax + tip; 
//		return total;
//	}
//}
//



// ** need to import java.text.NumberFormat;

//public static void printFormatted(double currencyValue) {
//	NumberFormat cf1= NumberFormat.getCurrencyInstance();
// 	System.out.println("Resulting values is :" + cf1.format(currencyValue));
//	
//}