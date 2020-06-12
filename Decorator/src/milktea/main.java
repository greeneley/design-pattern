package milktea;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble firstOrder = new Bubble(new BlackSugar(new MilkTea()));
		System.out.println("Cost: " + firstOrder.Cost());

		BlackSugar secondOrder = new BlackSugar(new BlackSugar(new MilkTea()));
		System.out.println("Cost: " + secondOrder.Cost());




	}

}
