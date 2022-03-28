package com.util.collections;

public class Book {
	int bookIsbn;
	String bookName;
	
	public Book() {
	}
	public Book(int bookIsbn, String bookName) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
	}
	public int getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookIsbn=" + bookIsbn + ", bookName=" + bookName + "]";
	}


}
