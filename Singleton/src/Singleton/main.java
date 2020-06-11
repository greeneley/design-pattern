package Singleton;

public class main extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev thread1 = Dev.getInstance();
		thread1.SayHi();
		Dev thread2 = Dev.getInstance();
		thread2.SayHi();
	}

}
