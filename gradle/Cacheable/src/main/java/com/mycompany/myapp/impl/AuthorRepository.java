package com.mycompany.myapp.impl;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.mycompany.myapp.Author;

public interface AuthorRepository {
	
	@Cacheable("authors")
	public Author findAuthorById(int id);
	
	@Cacheable("authors")
	public List<Author> findAuthorByFirstName(String name);
	
	@Cacheable("authors")
	public List<Author> findAuthorBySirName(String name);
}
