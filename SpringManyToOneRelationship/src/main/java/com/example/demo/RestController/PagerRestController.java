package com.example.demo.RestController;

import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RepositoryServiceImp.PageServiceImp;
import com.example.demo.model.Page;

@RestController
@Table(name = "PAGE_TABLE")
public class PagerRestController {
	
	@Autowired
	public PageServiceImp pageServiceImp;
	
	@GetMapping("/")
	public List<Page> getallPage()
	{
		return pageServiceImp.listAllPage();
		
	}
	@PostMapping("/")
	public Page storePage(@RequestBody Page page)
	{
		return pageServiceImp.savePage(page) ;
	}
	
	@PutMapping("/")
	public Page updatePage(@RequestBody Page page)
	{
		return pageServiceImp.updatePage(page);
	}
	
	@DeleteMapping("/")
	public String deletePage(@RequestBody Page page)
	{
		pageServiceImp.deletePage(page);
		return "deleted Successfully";
		
	}

}
