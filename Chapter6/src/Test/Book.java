package Test;

import java.util.ArrayList;

public class Book {
	
	private String bookTitle;
	private String author;
	
	public Book() {}
	
	public Book(String title,String author ) {
		this.bookTitle = title;
		this.author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookTitle+","+author);
	}

}
