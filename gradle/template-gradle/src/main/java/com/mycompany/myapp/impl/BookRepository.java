package com.mycompany.myapp.impl;

import com.mycompany.myapp.Book;

public interface BookRepository {
	public Book findBookByIsbn(String isbn);
	public Book findBookByTitle(String title);
}
