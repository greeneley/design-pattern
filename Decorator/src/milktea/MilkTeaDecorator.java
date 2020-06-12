package milktea;

abstract class MilkTeaDecorator implements IMilkTea {

	protected IMilkTea _milktea;

	public MilkTeaDecorator(IMilkTea inner) {
		// TODO Auto-generated constructor stub
		this._milktea = inner;
	}
	@Override
	public double Cost() {
		// TODO Auto-generated method stub
		return _milktea.Cost();
	}

}
