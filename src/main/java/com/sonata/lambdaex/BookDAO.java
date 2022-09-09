package com.sonata.lambdaex;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book>getBook(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(001,"Core Java",400));
		books.add(new Book(002,"Hibernate",300));
		books.add(new Book(003,"Spring",450));
		books.add(new Book(004,"ReactJS",600));
		return books;
	}

}
