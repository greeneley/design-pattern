
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.drain();
		chocolateBoiler.boil();
	}

}
