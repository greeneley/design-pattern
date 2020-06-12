package milktea;

public class Bubble extends MilkTeaDecorator {
	public Bubble(IMilkTea inner) {
		// TODO Auto-generated constructor stub
		super(inner);
	}

	@Override
	public double Cost() {
		return 1 + _milktea.Cost();
	}
}
