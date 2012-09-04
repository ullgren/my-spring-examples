package com.mycompany.myapp.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mycompany.myapp.Author;

public class AuthorMapper implements RowMapper<Author> {

	@Override
	public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
		Author author = new Author();
		author.setId(rs.getInt("id"));
		author.setFirstName(rs.getString("firstName"));
		author.setMiddleName(rs.getString("middleName"));
		author.setSirName(rs.getString("sirName"));
		author.setDateOfBirth(rs.getDate("dateOfBirth"));
		author.setDateOfDeath(rs.getDate("dateOfDeath"));
		return author;
	}

}
