package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;


@Service
public interface PersonRepository extends JpaRepository<Person,Long>{

}
