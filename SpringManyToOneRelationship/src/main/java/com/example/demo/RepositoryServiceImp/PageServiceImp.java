package com.example.demo.RepositoryServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PageRepository;
import com.example.demo.RepositoryService.PageService;
import com.example.demo.model.Page;
@Service
public class PageServiceImp implements PageService {
	
	@Autowired
	public PageRepository pageRepository;

	@Override
	public List<Page> listAllPage() {
		// TODO Auto-generated method stub
		return pageRepository.findAll();
	}

	@Override
	public Page savePage(Page page) {
		// TODO Auto-generated method stub
		return pageRepository.save(page);
	}

	@Override
	public Page updatePage(Page page) {
		// TODO Auto-generated method stub
		return pageRepository.save(page);
	}

	@Override
	public String deletePage(Page pages) {
		// TODO Auto-generated method stub
		pageRepository.delete(pages);
		return "deleted Successfully";
	}
	
	

}
