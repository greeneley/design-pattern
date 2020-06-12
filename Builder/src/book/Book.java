package book;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {
	private String title;
	private String author;
	private GregorianCalendar publishData;
	private String ISBN;

	public static class Builder{

		// params default
		private String title;
		private String author;
		private GregorianCalendar publishData = new GregorianCalendar(1900,1,1);
		private String ISBN = "000000000000000";
		public Builder(String title, String author) {
			this.title = title;
			this.author = author;
		}

		public Builder publishData(GregorianCalendar val) {
			this.publishData = val;
			return this;
		}

		public Builder ISBN(String val) {
			this.ISBN = val;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}

	public Book(Builder builder) {
		title = builder.title;
		author = builder.author;
		publishData = builder.publishData;
		ISBN = builder.ISBN;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", author: " + author + ", publish year: " + publishData.get(Calendar.YEAR) +", ISBN: " + ISBN;
	}
}
