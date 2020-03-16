import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


// impelemnt a class called WalkupTicket to represent a walk-up event ticket. Walk-up tickets are also constructed by number
//, and they have a price of $50
 
public abstract class Ticket {
	
	protected String eventName;
	protected int ticketType; //ticket num 1 = walk up , ticket num 2 = advance
	protected String eventDate;  //yyyy-mm-dd
	protected String purchaseDate; //yyyy-mm-dd
	double price;
	int qty;
	double totalprice;

	
	public abstract int getticketType(); 
	public abstract double price();
	public abstract String ticketTitle();

	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDate() { 
		return eventDate;
	}
	public void setEventDate(String eventDate) {  //yyyy-mm-dd
		this.eventDate = eventDate;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) { //yyyy-mm-dd
		this.purchaseDate = purchaseDate;
	}
	public String getPrice() {
		  String formattedPrice = NumberFormat.getCurrencyInstance().format(price());
		  return formattedPrice;
	}	
	
	public int setPrice() {
		return getticketType();
	}
	
	public String totalPrice() {
		totalprice = (double) (qty * price());
		String formattedPrice = NumberFormat.getCurrencyInstance().format(totalprice);
		return formattedPrice;
	}
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		if (qty > 3) {
			System.out.println("You've already purchased over limited amounts of tickes");
		}
	}

	public long getDiffDate() {
		LocalDate eDate = LocalDate.parse(eventDate);
		LocalDate pDate = LocalDate.parse(purchaseDate);
		long diff = ChronoUnit.DAYS.between(eDate, pDate);
		return Math.abs(diff);
	}

	
	public String toString() {
		if ( qty <= 3 && ticketType == 1 || ticketType == 2) {
		return "You purchased " + qty +" of "+ eventName + " " + ticketTitle() + " ticket(s). You purchased " 
	+ getDiffDate() + " days in advance, and total price is " + totalPrice() + " (each ticket: " + getPrice() + ")";
		}
		return "Please check the qty or ticket type";
	}

}
