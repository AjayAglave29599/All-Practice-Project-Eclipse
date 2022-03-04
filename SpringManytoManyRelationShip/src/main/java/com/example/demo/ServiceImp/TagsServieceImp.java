package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TagsRepository;
import com.example.demo.Service.TagsService;
import com.example.demo.model.Tags;
@Service
public class TagsServieceImp implements TagsService {

	@Autowired
	public TagsRepository tagsRepository;
	@Override
	public List<Tags> listAllTags() {
		// TODO Auto-generated method stub
		return tagsRepository.findAll();
	}

	@Override
	public Tags saveTags(Tags tags) {
		// TODO Auto-generated method stub
		return tagsRepository.save(tags);
	}

	@Override
	public Tags updateTags(Tags tags) {
		// TODO Auto-generated method stub
		return tagsRepository.save(tags);
	}

	@Override
	public String deleteTags(Tags tags) {
		// TODO Auto-generated method stub
		tagsRepository.delete(tags);
		return "Deleted SuccessFully";
	}

}
