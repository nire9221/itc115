//ex6) impelemnt a class called WalkupTicket to represent a walk-up event ticket. Walk-up tickets are also constructed by number
//, and they have a price of $50

//ex7) Implement a class called AdvanceTicket to represent tickets prurchased in advance. An advance ticket is constructed with a
//ticket number and with the number of days in advance that the ticket was purchased. Advanced tickets purchased 10 or more days before 
//the event cost $30 , and advanced tickets purchased fewer than 10days before the event cost $40

public class Assignment10_Client {

	public static void main(String[] args) {
		
		Ticket t1 = new advanceTicket();
		t1.setEventName("Seattle Music Festival");
		t1.getticketType();
		t1.setEventDate("2020-05-24");
		t1.setPurchaseDate("2020-03-24");
		t1.setQty(3);
		
		System.out.println(t1.toString());
		
		System.out.println();
		
		Ticket t2 = new walkUpTicket();
		t2.setEventName("Seattle Music Festival");
		t2.getticketType();
		t2.setEventDate("2020-05-24");
		t2.setPurchaseDate("2020-05-24");
		t2.setQty(2);
		
		System.out.println(t2.toString());
		
		System.out.println();
	}

}
