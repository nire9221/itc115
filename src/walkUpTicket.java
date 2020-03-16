
public class walkUpTicket extends Ticket {

	public walkUpTicket() {
		super();	
	}
	
	@Override
	public int getticketType() {
		return ticketType = 1;
	}
	public double price() {
		return price = 50.00;
	}
	public String ticketTitle() {
		if (ticketType ==1) {
		return "Walk-Up";
		}
		return "ticket type";
	}
	
	
}
