package strategy_pattern;

public class Modelduck extends Duck {

	public Modelduck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model duck");
	}

}
