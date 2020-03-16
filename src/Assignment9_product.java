import java.text.NumberFormat;

public class Assignment9_product {

	int pCode;
	String description;
	double price;
	int qty;	
	
	Assignment9_product(int c, String d, double p, int q){
		this.pCode = c;
		this.description = d;
		this.price = p;
		this.qty = q;	
	}
	
	public String getPrice() {
	    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	    return formattedPrice;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
//	public String getPriceFormatted() {
//	    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
//	    return formattedPrice;
//	}
	

	public int getQty() {
		if (qty <= 0) {
			System.out.println("sold out");
		}
		return qty;
		
	}


	public void setQty(int qty) {
		this.qty = qty;
		
	}


	public int getpCode() {
		return pCode;
	}


	public String getDescription() {
		return description;
	}


	public void sold(int amount) {
		this.qty -= amount;
	
	}
	
	public String toString() {
		return "(" + pCode + "," + description + "," + getPrice() + "," + qty+ ")";
	}
}
