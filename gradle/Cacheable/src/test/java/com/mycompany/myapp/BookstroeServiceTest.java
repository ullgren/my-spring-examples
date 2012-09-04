package com.mycompany.myapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"BookstroeServiceTest-context.xml"})
public class BookstroeServiceTest {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void verifyServiceExistence() {
		BookstoreService bookstore = context.getBean(BookstoreService.class);
		Assert.assertNotNull(bookstore);
	}
	
	@Test
	@DirtiesContext
	public void verifyBookAddition() {
		BookstoreService bookstore = context.getBean(BookstoreService.class);
		Assert.assertNotNull(bookstore);
		bookstore.addNewBook("My Book", "111111", "Arthur");
	}
	
	@Test
	@DirtiesContext
	public void verifyTwoBookAddition() {
		BookstoreService bookstore = context.getBean(BookstoreService.class);
		Assert.assertNotNull(bookstore);
		bookstore.addNewBook("My Book", "111111", "Arthur");
		bookstore.addNewBook("My Second Book", "111112", "Arthur");
	}
}
