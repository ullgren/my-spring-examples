package com.mycompany.myapp.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.Author;

@Repository
public class AuthorJdbcRepository implements AuthorRepository {
	
	private JdbcTemplate template;
	
	@Autowired
	public AuthorJdbcRepository(DataSource datasource) {
		this.template = new JdbcTemplate(datasource);
	}

	@Override
	public Author findAuthorById(int id) {
		return this.template.queryForObject("SELECT * FROM authors WHERE id=?", new AuthorMapper(), id);
	}

	@Override
	public List<Author> findAuthorByFirstName(String name) {
		this.template.query("SELECT * FROM authors WHERE firstName=?",new AuthorMapper(), name);
		return null;
	}

	@Override
	public List<Author> findAuthorBySirName(String name) {
		return this.template.query("SELECT * FROM authors WHERE sirName=?",new AuthorMapper(), name);
	}

}
