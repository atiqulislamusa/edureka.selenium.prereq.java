package co.edureka.selenium.prereq.module1;

public class CaseStudy2 {
	
	static double goldenTicketCost = 200.00;
	static double silverTicketCost = 150.00;
	
	public static void main(String[] args) {
		System.out.println("Price for 2 golden tickets is: " + ticketPrice("golden", 2));
		System.out.println("Price for 2 silver tickets is: " + ticketPrice("silver", 2));
		
	}
	
	static double ticketPrice(String ticketType, int numberOfTickets) {
		
		double totalTicketPrice = 0;
		
		if (ticketType.equalsIgnoreCase("golden")) {
			totalTicketPrice = goldenTicketCost * numberOfTickets;
		} else if (ticketType.equalsIgnoreCase("silver")) {
			totalTicketPrice = silverTicketCost * numberOfTickets;
		}
		
		return totalTicketPrice;
	}
}
