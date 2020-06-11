package Singleton;

import java.util.Random;

public class Dev {
	private int index;
	private static volatile Dev uniqueInstance;
	private Dev(int index) {
		this.index = index;
	}
	public static synchronized Dev getInstance() {
		if (uniqueInstance == null) {
			Random random = new Random();
			uniqueInstance = new Dev(random.nextInt(4));
		}
		return uniqueInstance;
	}

	public void SayHi() {
		System.out.println("hello:" + this.index);
	}
}
