package ticket;

public class Ticket {
	private double _price;
	private PromoteStrategy promoteStrategy;
	private String _name;
	public Ticket() {
			}
	public double get_price() {
		return _price;
	}
	public void set_price(double _price) {
		this._price = _price;
	}
	public PromoteStrategy getPromoteStrategy() {
		return promoteStrategy;
	}
	public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
		this.promoteStrategy = promoteStrategy;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}

	public double getPromotedPrice() {
		return promoteStrategy.DoDiscounte(_price);
	}
}
