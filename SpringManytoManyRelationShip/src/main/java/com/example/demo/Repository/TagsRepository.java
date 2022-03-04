package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tags;

@Repository
public interface TagsRepository extends JpaRepository<Tags, Long> {

}
