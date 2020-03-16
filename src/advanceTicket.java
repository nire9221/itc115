
//Implement a class called AdvanceTicket to represent tickets prurchased in advance. An advance ticket is constructed with a
//ticket number and with the number of days in advance that the ticket was purchased. Advanced tickets purchased 10 or more days before 
//the event cost $30 , and advanced tickets purchased fewer than 10days before the event cost $40

public class advanceTicket extends Ticket {
	
		public advanceTicket() {
			super();
		}

		@Override
		public int getticketType() {
			return ticketType = 2;
		}
		public double price() {
			if (getDiffDate() >= 10 && getDiffDate() !=0) {	//Advanced tickets purchased 10 or more days
				price = 30.00;
			} else if (getDiffDate()<10) {
				price = 40.00;
			} 
			return price;
		}
		public String ticketTitle() {
			if (ticketType ==2) {
				return "Advance ";
				}
				return "ticket type";
			}
		}






