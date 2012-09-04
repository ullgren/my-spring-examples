package com.mycompany.myapp;

import java.util.List;

/*
 * This is a simple service for a Bookstore
 */
public interface BookstoreService {
	
	public List<Book> fetchByAuthorName(String author);
	
	public void addNewBook(String title, String isbn, String authorName);

}
