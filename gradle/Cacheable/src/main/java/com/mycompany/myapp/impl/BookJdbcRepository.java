package com.mycompany.myapp.impl;

import org.springframework.stereotype.Repository;

import com.mycompany.myapp.Book;

@Repository
public class BookJdbcRepository implements BookRepository {
	
	

	@Override
	public Book findBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
