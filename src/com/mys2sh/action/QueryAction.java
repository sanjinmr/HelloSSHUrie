package com.mys2sh.action;

import java.util.Map;

import com.mys2sh.dao.BookDao;

public class QueryAction {
	
	private String name;
	private BookDao book;

	public BookDao getBook() {
		return book;
	}

	public void setBook(BookDao book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Map<String, Integer> result;

	public Map<String, Integer> getResult() {
		return result;
	}

	public void setResult(Map<String, Integer> result) {
		this.result = result;
	}

	public String execute() throws Exception {
		try {
			System.out.println("name=" + name);
			Map<String, Integer> books = book.getBooks(name);
			if (books.isEmpty()) {
				System.out.println("%%%%%%%No item!%%%%%%%%%%%%%");
			} else {
				setResult(books);
				System.out.println("%%%%%%%success!%%%%%%%%%%%%%");
			}

			return "success";
		} catch (Exception e) {
			System.out.println("%%%%%%%error!%%%%%%%%%%%%%");
			e.printStackTrace();
			return "error";
		}

	}

}
