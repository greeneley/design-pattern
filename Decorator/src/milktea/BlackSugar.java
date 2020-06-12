package milktea;

public class BlackSugar extends MilkTeaDecorator {
	public BlackSugar(IMilkTea inner) {
		// TODO Auto-generated constructor stub
		super(inner);
	}

	@Override
	public double Cost() {
		return 2 + _milktea.Cost();
	}
}
