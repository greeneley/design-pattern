package ticket;

public class HalfDiscountStrategy implements PromoteStrategy {

	@Override
	public double DoDiscounte(double price) {
		// TODO Auto-generated method stub
		return price * 0.5;
	}

}
