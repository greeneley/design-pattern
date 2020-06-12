package book;

import java.util.GregorianCalendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book.Builder("Thanh Hai", "Toto").ISBN("2e3123131").publishData(new GregorianCalendar(2020, 05,20)).build();
		System.out.println(book.toString());
	}

}
