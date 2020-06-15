package wheel;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheel firstOrder = WheelFactory.getWheel("CarWheel", 12, 312);
		System.out.println(firstOrder.toString());
		Wheel secondOrder = WheelFactory.getWheel("BikeWheel", 2, 312);
		System.out.println(secondOrder.toString());
	}

}
