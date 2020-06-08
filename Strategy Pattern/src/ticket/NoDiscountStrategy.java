package ticket;

public class NoDiscountStrategy implements PromoteStrategy {

	@Override
	public double DoDiscounte(double price) {
		// TODO Auto-generated method stub
		return price;
	}

}
