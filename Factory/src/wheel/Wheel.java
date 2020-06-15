package wheel;

public abstract class Wheel {
	public abstract float getDiameter();
	public abstract float getWidth();
	public abstract String getType();
	@Override
	public String toString() {
		return "Type: "+ this.getType() +" Diameter = " + String.valueOf(this.getDiameter()) + " Width = " + String.valueOf(this.getWidth());
	}

}
