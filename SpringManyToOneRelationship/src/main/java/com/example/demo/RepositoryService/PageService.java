package com.example.demo.RepositoryService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Page;

@Service
public interface PageService {
	
	public List<Page> listAllPage();
	public Page savePage(Page page);
	public Page updatePage(Page page);
	public String deletePage(Page pages);

}
