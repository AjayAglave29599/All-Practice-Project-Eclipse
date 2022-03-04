package com.example.demo.RepositoryService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public interface BookService {
	
	public List<Book> getAllBook();
	public Book saveBook(Book book);
	public Book updateBook(Book book);
	public String deleteBook(Book book);
	
  

}
