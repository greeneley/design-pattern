package ticket;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();
		ticket.set_price(500);
		ticket.setPromoteStrategy(new QuarterDiscountStrategy());
		System.out.println("Price: " + ticket.getPromotedPrice());

	}

}
