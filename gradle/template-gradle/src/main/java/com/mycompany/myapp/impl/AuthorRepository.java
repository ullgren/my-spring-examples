package com.mycompany.myapp.impl;

import java.util.List;

import com.mycompany.myapp.Author;

public interface AuthorRepository {
	public Author findAuthorById(int id);
	public List<Author> findAuthorByFirstName(String name);
	public List<Author> findAuthorBySirName(String name);
}
