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

import com.example.demo.ServiceImp.TagsServieceImp;
import com.example.demo.model.Tags;

@RestController
@RequestMapping(name = "/tags")
public class TagsRestController {
	
	@Autowired
	public TagsServieceImp servieceImp;
	
	@GetMapping("/")
	public List<Tags> getAllTags()
	{
		return servieceImp.listAllTags();
		
	}
	
	@PostMapping("/")
	public Tags saveTags(@RequestBody Tags tags)
	{
		return servieceImp.saveTags(tags);
	}
	@PutMapping("/")
	public Tags updatetags(@RequestBody Tags tags)
	{
		return servieceImp.updateTags(tags);
	}
	
	@DeleteMapping
	public String deleteTags(@RequestBody Tags tags)
	{
		servieceImp.deleteTags(tags);
		return "Deleted";
	
	}
	
	

}
