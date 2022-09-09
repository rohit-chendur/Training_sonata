package com.sonata.lambdaex;

import java.util.Collections;
import java.util.List;

public class BookServiceLambda {
	
	public List<Book>getBookinSort(){
		List<Book> books = new BookDAO().getBook();
		Collections.sort(books,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new BookService().getBookinSort());

	}

}
