//1. The product data should include a product code, description, price and product count. 
//
//2. In addition to the getter and setter methods, the class should implement toString and also a formatted output of the price
//(Hint: use the NumberFormat class. Here is the implementation of your formattedPrice method: 
//	public String getPriceFormatted() 
//{
//    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
//    return formattedPrice;
//}
//
//3. From the client app create the instances of 2-3 different products and use the toString method to display their data.
//
//Optional: Keep track of the count of the products created and call the getCount method to verify that it is correct. 
//(Where could you keep track of the count of products?)




public class Assignment9_client {

	public static void main(String[] args) {
		
		Assignment9_product [] p = new Assignment9_product[7];
		
		//int c, String d, double p, int q
		p[0] = new Assignment9_product(1, "banana" ,1.2 ,20);
		p[1] = new Assignment9_product(2, "apple" ,0.5 ,10);
		p[2] = new Assignment9_product(3, "mango" ,3 ,15);
				
		System.out.println("item "+p[0].getpCode() +" " + p[0].toString());
		System.out.println("current Qty: " + p[0].getQty());
		p[0].sold(2);
		System.out.println("sold: " + p[0].getDescription());
		System.out.println("remaining Qty: " + p[0].getQty());
		
		System.out.println();
		
		System.out.println("item "+p[1].getpCode() +" " + p[1].toString());
		System.out.println("current Qty: " + p[1].getQty());
		p[1].sold(5);
		System.out.println("sold: " + p[1].getDescription());
		System.out.println("remaining Qty: " + p[1].getQty());
		
		System.out.println();
		
		System.out.println("item "+p[2].getpCode() +" : " + p[2].toString());
		System.out.println("current Qty: " + p[2].getQty());
		p[2].sold(15);
		System.out.println("sold: " + p[2].getDescription());
		System.out.println("remaining Qty: " + p[2].getQty());

	}

}
