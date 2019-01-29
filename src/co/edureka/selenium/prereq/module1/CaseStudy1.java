package co.edureka.selenium.prereq.module1;

public class CaseStudy1 {
	
	static double ticketPrice = 400.00;
	
	public static void main(String[] args) {
		
		System.out.println("Ticket price for 5 tickets: " + calcTickPrice(5));
		System.out.println("Ticket price for 10 tickets: " + calcTickPrice(10));
		System.out.println("Ticket price for 15 tickets: " + calcTickPrice(15));

	}
	
	static double calcTickPrice(int numberOfTickets) {
		double totalPriceOfTickets = numberOfTickets * ticketPrice;

		//if more than 10 tickets are purchased discount 10%
		if (numberOfTickets > 10) {
			totalPriceOfTickets -= totalPriceOfTickets * 0.10;
		}
		
		return totalPriceOfTickets;

	}

}
