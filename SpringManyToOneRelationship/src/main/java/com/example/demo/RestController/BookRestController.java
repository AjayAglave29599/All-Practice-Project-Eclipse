package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RepositoryServiceImp.BookServiceImp;
import com.example.demo.model.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@Autowired
	public BookServiceImp bookServiceImp;
	
	@GetMapping("/")
	public List<Book> getAllBook()
	{
		return bookServiceImp.getAllBook();
	}
	
	@PostMapping("/")
	public Book storeBook(@RequestBody Book book)
	{
		return bookServiceImp.saveBook(book);
	}
	
	@PutMapping("/")
	public Book updateBook(@RequestBody Book book)
	{
		return bookServiceImp.updateBook(book);
	}
	
	@DeleteMapping("/")
	public String deleteBook(@RequestBody Book book)
	{
		bookServiceImp.deleteBook(book);
		return "Deleted Successfully";
	}

}
