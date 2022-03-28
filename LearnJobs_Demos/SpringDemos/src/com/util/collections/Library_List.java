package com.util.collections;

import java.util.List;

public class Library_List {
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void displayBooks() {
		for(Book book:books) {
			System.out.println(book);
		}
	}

}
