package com.mycompany.myapp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.Author;
import com.mycompany.myapp.Book;
import com.mycompany.myapp.BookstoreService;

@Service
public class BookstoreServiceImpl implements BookstoreService {

	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> fetchByAuthorName(String name) {
		return null;
	}
	
	@Override
	public void addNewBook(String title, String isbn, String authorName) {
		List<Author> authors = authorRepository.findAuthorByFirstName(authorName);
		if ( authors.size() != 1) {
			throw new RuntimeException("Unexpected ("+authors.size()+") number of authors with the same name");
		}
		// TODO: Add the book into the repo
	}

}
