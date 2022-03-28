package com.util.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book b1=new Book(101,"Learn Spring 5.0");
//		Book b2=new Book(102,"Learn Core Java");
//		Book b3=new Book(103,"Learn Java 9.0 to 13.0");
//		Book b4=new Book(104,"Java Professional Interview Guide");
//		Book b5=new Book(105,"Java 9+ Recipes");
//
//		List<Book> bookList=new ArrayList<Book>();
//		bookList.add(b1);
//		bookList.add(b2);
//		bookList.add(b3);
//		bookList.add(b4);
//		bookList.add(b5);
//		
//		Library_List library=new Library_List();
//		library.setBooks(bookList);
//		library.displayBooks();
//		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("books.xml");
		Library_List library=(Library_List)context.getBean("library1");
		
		library.displayBooks();
		
		
		
		
		
	}

}
