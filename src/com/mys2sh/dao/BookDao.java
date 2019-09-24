package com.mys2sh.dao;

import java.util.*;

public class BookDao {
	
	private static Map<String, Integer> books = new LinkedHashMap<String, Integer>();
	
	static {
		books.put("book1", 79);
		books.put("book2", 20);
		books.put("book3", 34);
		books.put("book4", 65);
		books.put("book5", 55);
		books.put("book6", 77);
		books.put("book7", 17);
	}

	public static Map<String, Integer> getBooks() {
		return books;
	}

	public static void setBooks(Map<String, Integer> books) {
		BookDao.books = books;
	}

	public Map<String, Integer> getBooks(String name) {
		Map<String, Integer> books = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : BookDao.books.entrySet()) {
			if (entry.getKey().toLowerCase().contains(name.toLowerCase())) {
				books.put(entry.getKey(), entry.getValue());
			}
		}
		return books;

	}
}
