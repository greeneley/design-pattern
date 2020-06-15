package wheel;

public class CarWheel extends Wheel {

	private float diameter;
	private float width;
	private String type = "Car";

	public CarWheel(float diameter, float width) {
		this.diameter = diameter;
		this.width = width;
	}

	@Override
	public float getDiameter() {
		// TODO Auto-generated method stub
		return this.diameter;
	}

	@Override
	public float getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
