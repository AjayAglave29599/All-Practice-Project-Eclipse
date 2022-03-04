package com.example.demo.Service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.model.Tags;
import com.example.demo.model.Tags;


public interface TagsService {
	
	public List<Tags> listAllTags();
	public Tags saveTags(Tags tags);
	public Tags updateTags(Tags tags);
	public String deleteTags(Tags tags);

}
