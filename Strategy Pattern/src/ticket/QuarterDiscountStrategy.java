package ticket;

public class QuarterDiscountStrategy implements PromoteStrategy {

	@Override
	public double DoDiscounte(double price) {
		// TODO Auto-generated method stub
		return price * 0.75;
	}

}
