package com.example.demo.RepositoryServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BookRepository;
import com.example.demo.RepositoryService.BookService;
import com.example.demo.model.Book;
@Service
public class BookServiceImp implements BookService {

	@Autowired
	public BookRepository bookRepository;
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
		
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public String deleteBook(Book book) {
		bookRepository.delete(book);
		return "delete duccessfully";
	}

}
